class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(map.containsKey(n)){
                int prev=map.get(n);
                map.put(n,prev+1);
            }
            else{
                map.put(n,1);
            }
        }
        for(int arr:map.keySet()){
            int val=map.get(arr);
            if(val>nums.length/3){
                ans.add(arr);
            }
        }
        return ans;
    }
}