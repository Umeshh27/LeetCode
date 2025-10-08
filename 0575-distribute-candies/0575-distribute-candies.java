class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length / 2;

        HashSet<Integer> set = new HashSet<>();
        for (int arr : candyType) {
            set.add(arr);
        }
        return Math.min(n, set.size());
    }
}