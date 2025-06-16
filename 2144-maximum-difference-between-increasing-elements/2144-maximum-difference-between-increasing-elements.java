class Solution {
    public int maximumDifference(int[] nums) {
       int max=nums[0], maxdiff=-1;
       for(int i=0;i<nums.length;i++){
        if(max < nums[i]){
            maxdiff=Math.max(maxdiff,nums[i] - max);
        }
        else{
            max=nums[i];
        }
       }
       return maxdiff;
    }
}