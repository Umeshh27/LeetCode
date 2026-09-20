class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int product=0;
        for(int i=0;i<s.length();i++){
            int ch='z'-s.charAt(i)+1;
            product=ch*(i+1);
            sum+=product;
        }
       
        return sum;
    }
}