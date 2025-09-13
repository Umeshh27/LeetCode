import java.util.*;
class Solution{
    public int maxFreqSum(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxVowel=0,maxConsonant=0;
        String vowels="aeiou";
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            if(vowels.indexOf(ch)!=-1){
                maxVowel=Math.max(maxVowel,freq);
            }else{
                maxConsonant=Math.max(maxConsonant,freq);
            }
        }
        return maxVowel+maxConsonant;
    }
}
