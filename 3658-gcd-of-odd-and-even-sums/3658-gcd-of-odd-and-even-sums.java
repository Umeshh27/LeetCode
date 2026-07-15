class Solution {
    private static int gcd(int odd,int even){
        if(even==0){
            return odd;
        }
        return gcd(even,odd%even);
    }
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n;
        int even=n*(n+1);    
       return  gcd(odd,even);
    }
}