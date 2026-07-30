class Solution {
    public int fib(int n) {
    int next =0;
    int num1=0;
    int num2 =1;
    for(int i=0;i<n;i++){
        next = num1+num2;
        num1= num2;
        num2=next;
    }
    return num1;
    }
}