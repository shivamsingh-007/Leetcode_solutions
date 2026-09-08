class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int[] ps = new int[n];
        int[] ss = new int[n];
        
        ps[0] = cardPoints[0];
        for(int i = 1; i < k; i++){
            ps[i] = ps[i-1] + cardPoints[i];
        }
        
        ss[n-1] = cardPoints[n-1];
        for(int i = n - 2; i >= n - k; i--){
            ss[i] = ss[i+1] + cardPoints[i];
        }
        
        int maxScore = Math.max(ps[k-1], ss[n-k]);
        
        for(int i = 0; i < k - 1; i++){
            int currentScore = ps[i] + ss[n - (k - 1 - i)];
            maxScore = Math.max(maxScore, currentScore);
        }
        
        return maxScore;
    }
}
