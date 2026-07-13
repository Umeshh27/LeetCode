class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum = new int[nums.length];
        int[] rightsum = new int[nums.length];
        int[] ans = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                sum += nums[i - 1];

            }
            leftsum[i] = sum;
        }
        int sum2 = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i < nums.length - 1) {
                sum2 += nums[i + 1];
            }
            rightsum[i] = sum2;
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return ans;
    }

}