class Solution {
    public int maximumDifference(int[] nums) {
        int diff=0;
        int maxdiff=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               if(nums[i]<nums[j]){
                 diff=nums[j]-nums[i];
                maxdiff=Math.max(maxdiff,diff);
               }
            }
        }
        return maxdiff;
    }
}