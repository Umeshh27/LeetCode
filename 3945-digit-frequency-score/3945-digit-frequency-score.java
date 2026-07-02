class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        while(n>0){
            int digitsum=n%10;
            sum+=digitsum;
            n=n/10;
        }
        return sum;
    }
}