class Solution {
    public int countCommas(int n) {
        int length = String.valueOf(n).length();
        if(length<4) return 0;
        int count=0;
        for(int i=1000;i<n;i++){
            if(length>3 || length<5 ) count++;
        }
        return count+1;
    }
}