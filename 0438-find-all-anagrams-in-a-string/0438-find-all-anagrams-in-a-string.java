class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        if(p.length()>s.length()){
            return result;
        }
        int pfreq[] = new int[26];
        int sfreq[] = new int[26];
        for(int i=0;i<p.length();i++){
            pfreq[p.charAt(i)-'a']++;
            sfreq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            if(isana(pfreq,sfreq)){
                result.add(i);
            }
            if(i+p.length()<s.length()){
                sfreq[s.charAt(i)-'a']--;
                sfreq[s.charAt(p.length()+i)-'a']++;
            }
        }
        return result;
    }
    private boolean isana(int[] a,int[] b){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}