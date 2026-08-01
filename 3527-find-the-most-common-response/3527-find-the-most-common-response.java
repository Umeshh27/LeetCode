class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
        for(List<String> list:responses){
            HashSet<String> set = new HashSet<>(list);
            for(String str:set){
                map.put(str,map.getOrDefault(str,0)+1);
            }
        }
        String ans="";
        int maxfreq=0;
        for(String str: map.keySet()){
            int val=map.get(str);
            if (val > maxfreq || (val == maxfreq && str.compareTo(ans) < 0)){
                maxfreq=val;
                ans=str;
            }
        }
        return ans;
    }
}