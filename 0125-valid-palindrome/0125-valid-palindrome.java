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
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                str = str + ch;
            }
        }

        return str.equals(rev(str));
    }
}