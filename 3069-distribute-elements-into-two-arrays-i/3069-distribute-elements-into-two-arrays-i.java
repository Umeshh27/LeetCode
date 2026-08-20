class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int arr1Index=0;
        int arr2Index=0;
        for(int i=2;i<nums.length;i++){
           if(arr1[arr1Index]>arr2[arr2Index]){
            arr1Index++;
            arr1[arr1Index]=nums[i];
           }
           else{
             arr2Index++;
            arr2[arr2Index]=nums[i];
           }
        }
        int[] res=new int[n];
        int idx=0;
        for(int i=0;i<=arr1Index;i++){
            res[idx++]=arr1[i];
        }

        for(int i=0;i<=arr2Index;i++){
             res[idx++]=arr2[i];
        }
        return res;
    }
}