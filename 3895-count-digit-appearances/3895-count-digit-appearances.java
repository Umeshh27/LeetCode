class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0 && digit == 0) {
                    c++;
                }
                while (nums[i] != 0) {
                    int digits = nums[i] % 10;
                    nums[i] = nums[i] / 10;
                if (digits == digit) {
                    c++;
                }
            }
        }
        return c;
    }
}
