class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int left=0,total=0;
        for(int r=0;r<nums.length;r++){
            total+=nums[r];
            while(total>=target){
                min=Math.min(r-left+1,min);
                total-=nums[left];
                left++;
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        else return min;
    }
}