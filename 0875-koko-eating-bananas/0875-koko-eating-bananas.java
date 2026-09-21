class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        int left=1,right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            long total=0;
            for(int i=0;i<piles.length;i++){
               int div=(piles[i] + mid - 1) / mid;
               total+=div;
            }
            if(total<=h){
               right=mid-1;
            }
            else left=mid+1;
        }
        return left;
    }
}