class Solution {
    public int xorOperation(int n, int start) {
        int res=0;
        int[] num=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=start+2*i;
            res=res^num[i];
        }
        return res;
    }
}