/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        final var arr = new ArrayList<List<TreeNode>>();
        parse(traversal, 0, arr);
        return arr.getFirst().getFirst();
    }

    public void parse(final String traversal, final int cursor, final List<List<TreeNode>> arr) {
        if (cursor >= traversal.length()) return;
        var i = cursor;

        var level = 0;
        while (i < traversal.length() && traversal.charAt(i) == '-') {
            level += 1;
            i += 1;
        }

        var number = 0;
        while (i < traversal.length() && Character.isDigit(traversal.charAt(i))) {
            number = number * 10 + (traversal.charAt(i) - '0');
            i += 1;
        }

        final var node = new TreeNode(number);
        if (arr.size() == level) {
            arr.add(new ArrayList<>());
        }
        final var box = arr.get(level);
        box.add(node);

        if (level > 0) {
            final var parent = arr.get(level - 1).getLast();
            if (parent.left == null) {
                parent.left = node;
            } else {
                parent.right = node;
            }
        }
        parse(traversal, i, arr);
    }
}