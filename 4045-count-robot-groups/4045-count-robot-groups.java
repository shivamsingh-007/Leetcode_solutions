class Solution {
    public int countGroups(int[] pos, int[] sp, int dis) {
        int cnt = 1;
        int speed = sp[sp.length-1];
        for(int i = pos.length-2; i>=0; i--){
            if(sp[i]>speed || (pos[i+1] - pos[i]<=dis)) continue;
            cnt++;
            speed = sp[i];
        }
        return cnt;
    }
}