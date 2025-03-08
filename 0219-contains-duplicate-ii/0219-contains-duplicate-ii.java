class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (long i = 0; i < nums.length; i++) {
            if (i > 5000) {
                return false;
            }
            for (long j = 0; j < i; j++) {
                if (nums[(int) i] == nums[(int) j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
