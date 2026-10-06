class Solution {
    public int maxArea(int[] height) {
        int l =0;
        int r = height.length-1;
        int ma =0;
        while(l<r){
            int container;
            if(height[l]<height[r]){
                container=height[l];
            }
            else{
                container = height[r];
            }
            int w = r-l;
            int a = w*container;
            if(ma<a){
                ma=a;
            }
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
    return ma;}
}