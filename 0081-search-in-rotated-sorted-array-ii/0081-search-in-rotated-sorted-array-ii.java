import java.util.Arrays;
class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int l =0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]>target){
                r--;
            }
            else{
                l++;
            }
        }
    return false;}
}