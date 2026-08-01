class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:map.keySet()){
            int  val=map.get(num);
            if(val==1){
                sum+=num;
            }
        }
        return sum;
    }
}