class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int  mx =0;
      int c =0;
        for(int j=0;j<nums.length;j++){
        if(nums[j]==1){
            c++;
            if(mx<c){
                mx=c;
            }
        }
        else{
     c=0;
             }
             }
     return mx;
    }
}