class Solution {
    public int countCommas(int n) {
        int t=n;
        int c=0;
        while(t>999){
            c++;
            t--;
        }
        return c;
            }
}