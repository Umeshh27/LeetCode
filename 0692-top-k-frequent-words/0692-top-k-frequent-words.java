class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String>[] frequency= new List[words.length];
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(String val:map.keySet()){
            int freq=map.get(val);
            if(frequency[freq]==null){
                frequency[freq]=new ArrayList<>();
            }
            frequency[freq].add(val);
        }
        List<String> res=new ArrayList<>(k);
        for(int i=frequency.length-1;i>=0 && res.size()<k;i--){
            if(frequency[i]!=null){
                Collections.sort(frequency[i]);
                for(String string:frequency[i]){
                    res.add(string);
                    if(res.size()==k){
                        break;
                    }
                }
            }
        }
        return res;
    }
}