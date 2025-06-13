class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) res[left++] = num;
            else res[right--] = num;
        }
        return res;
    }
}
