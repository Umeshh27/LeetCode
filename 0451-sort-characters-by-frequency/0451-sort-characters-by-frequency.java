class Solution {
    public String frequencySort(String s) {
        List<Character>[] freq=new List[s.length()+1];
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(char ch:map.keySet()){
            int frequency=map.get(ch);
            if(freq[frequency]==null){
                freq[frequency]=new ArrayList<>();
            }
            freq[frequency].add(ch);
        }

        StringBuilder res=new StringBuilder();
        for(int i=freq.length-1;i>=1;i--){
            if(freq[i]!=null){
                for(char character: freq[i]){
                    for(int j=0;j<i;j++){
                        res.append(character);
                    }
                }
            }
        }
        return res.toString();
    }
}