class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count[ch - 'a']++;
        }

        Arrays.sort(count);

        int pushes = 0;
        int posit = 0;

        for (int i = 25; i >= 0; i--) {
            if (count[i] == 0) {
                break;
            }

            int times = (posit / 8) + 1;
            pushes += count[i] * times;
            posit++;
        }

        return pushes;
    }
}