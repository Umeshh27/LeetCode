class Solution {
    public boolean uniformArray(int[] nums1) {
        if(nums1.length==1) return true;
        int[] nums2=new int[nums1.length];
        for(int i=0;i<nums1.length-1;i++){
           if(i+1!=i){
            nums2[i]=nums1[i];
            nums2[i]=nums1[i]-nums1[i+1];
           }
           return true;
        }
        return false;
    }
}