class Solution {
    public int firstStableIndex(int[] nums, int k) {
    int s=0;
    for(int i=0;i<nums.length;i++){
        int mx =0;
        int mn=Integer.MAX_VALUE;
        for(int j=0;j<=i;j++){
            if(nums[j]>mx){
                mx=nums[j];
            }
        }
        for(int j=i;j<nums.length;j++){
            if(nums[j]<mn){
                mn=nums[j];
            }
        }
        if((mx-mn)<=k){
            return i;
        }
    }
    return -1;
      
    }
}