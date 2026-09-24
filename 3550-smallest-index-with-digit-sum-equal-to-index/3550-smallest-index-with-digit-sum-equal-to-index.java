class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int digitsum=0;
            while(nums[i]>0){
                digitsum+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            if(digitsum==i){
               return i;
            }
        }
         return -1;
    }
}