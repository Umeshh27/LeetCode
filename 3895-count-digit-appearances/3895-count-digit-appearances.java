class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        String[] arr = new String[nums.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(nums[i]);
            for (int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].charAt(j);
                if (ch == (char) (digit + '0')) {
                    count++;
                }
            }
        }
        return count;
    }
}