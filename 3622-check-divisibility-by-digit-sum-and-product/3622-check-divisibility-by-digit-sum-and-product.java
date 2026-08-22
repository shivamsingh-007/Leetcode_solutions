class Solution {
    public boolean checkDivisibility(int n) {
        int k =n;
        int p = 1;
        int r =0;
        while(k!=0){
            r = r+ k%10;
            p = p*(k%10);
            k = k/10;
        }
        int sum = p+r;
        if(n%sum==0){
            return true;
        }
        else return false;

    }
}