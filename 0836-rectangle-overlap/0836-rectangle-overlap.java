class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // Remove Math.abs() so negative positions evaluate properly
        int mH = Math.max(0, Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]));
        int mW = Math.max(0, Math.min(rec1[3], rec2[3]) - Math.max(rec1[1], rec2[1]));
    
        return mH > 0 && mW > 0;
    }
}
