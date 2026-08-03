class Solution {
    public boolean checkPerfectNumber(int num) {
     if(num<0){
        return false;
     }
     int sd =0;
     for(int i =1;i<num;i++){
        if(num%i==0){
            sd = sd+i;
        }
     }
     return num==sd; 
    }
}