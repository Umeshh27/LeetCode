class Solution {
    public int hammingWeight(int n) {
        String bits=Integer.toBinaryString(n);
        int count=0;
        for(char c:bits.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
}