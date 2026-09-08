class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq =  new int[10];
        if(n==0){
            return 0;
        }
        while(n!=0){
            freq[n%10]++;
            n=n/10;
        }
        int sum=0;
        int c=0;
        for(int t:freq){
            sum = t*c+sum;
            c++;
        }
        return sum;
    }
}