class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int maxright=-1;
            for(int j=i+1;j<n;j++){
                maxright=Math.max(maxright,arr[j]);
            }
            arr[i]=maxright;
        }
        return arr;
    }
}