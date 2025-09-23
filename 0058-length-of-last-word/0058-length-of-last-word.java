class Solution {
    public int lengthOfLastWord(String s) {
        String[] w=s.split(" ");
        String l=w[w.length-1];
        return l.length();
    }
}