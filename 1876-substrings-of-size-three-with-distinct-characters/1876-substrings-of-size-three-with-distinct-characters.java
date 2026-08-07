class Solution {
    public int countGoodSubstrings(String s) {
        int sl=3;
        int count=0;
        for(int i=0;i<s.length()-sl+1;i++){
            // int j=i+sl-1;
            if(s.charAt(i)!=s.charAt(i+1)&&s.charAt(i)!=s.charAt(i+2) &&s.charAt(i+1)!=s.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
}