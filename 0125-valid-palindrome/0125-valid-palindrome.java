class Solution {

    private static String rev(String revs) {
        String reverse = "";
        for (int i = revs.length() - 1; i >= 0; i--) {
            reverse = reverse + revs.charAt(i);
        }
        return reverse;
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        return s.equals(rev(s));
    }
}