class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0;
        int right=0;
        int avg=0;
        int count=0;
        while(right<arr.length){
            if(right-left+1==k){
                int sum=0;
                for(int i=left;i<=right;i++){
                    sum+=arr[i];
                }
                if(sum/k>=threshold){
                    count++;
                }
                left++;
            }
            right++;
        }
        return count;
    }
}