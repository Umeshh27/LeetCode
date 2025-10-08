class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();

        for (char arr : jewels.toCharArray()) {
            set.add(arr);
        }

        int c = 0;
        for (char arr2 : stones.toCharArray()) {
            if (set.contains(arr2)) {
                c++;
            }
        }
        return c;
    }
}