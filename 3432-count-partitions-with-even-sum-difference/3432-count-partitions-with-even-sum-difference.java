class Solution {
    public int countPartitions(int[] nums) {
        int c = 0;
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int i = 0;
        int left = 0;
        for (i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            if ((left - (total - left)) % 2 == 0) {
                c++;
            }
        }
        return c;

    }

}