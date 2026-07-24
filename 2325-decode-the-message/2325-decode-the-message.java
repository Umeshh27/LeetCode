class Solution {
    public String decodeMessage(String key, String message) {
            HashMap<Character,Character> map=new HashMap<>();
            char ch='a';
            for(int i=0;i<key.length();i++){
                if(key.charAt(i)==' ' || map.containsKey(key.charAt(i))){
                    continue;
                }
                else{
                    map.put(key.charAt(i),ch);
                    ch++; 
                }
               
            }
            StringBuilder ans=new StringBuilder();
            for(int j=0;j<message.length();j++){
                 if(message.charAt(j)==' '){
                    ans.append(' ');
                }
                else{
                    ans.append(map.get(message.charAt(j)));
                }
            }
            return ans.toString();
    }
}