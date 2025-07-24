class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int element=arr[n/2];
        int count=0;
        for(int num:arr){
            if(num==element){
                count++;
            }
        }
        if(count > n/2){
            return element;
        }
        return -1;
    }
}