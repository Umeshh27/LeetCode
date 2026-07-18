class Solution {
    private static int gcd(int min,int max){
        if(max==0){
            return min;
        }
        return gcd(max,min%max);
    }

    public int findGCD(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        min=Math.min(min,nums[i]);
       }
       return gcd(min,max);
    }
}