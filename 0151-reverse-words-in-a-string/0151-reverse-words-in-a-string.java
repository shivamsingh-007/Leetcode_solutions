class Solution {
    public String reverseWords(String s) {
        String k = s.trim();
        String[] j= k.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=j.length-1;i>=0;i--){
            sb.append(j[i]);
            if(i!=0){
            sb.append(" ");}
        }
        
String res = sb.toString();
return res;
    }
}