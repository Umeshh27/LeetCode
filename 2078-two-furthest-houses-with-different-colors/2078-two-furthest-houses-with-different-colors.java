class Solution {
    public int maxDistance(int[] colors) {
        int diff=0;
        int max=0;
        for(int i=0;i<colors.length;i++){
            for(int j=colors.length-1;j>=0;j--){
                if(colors[i]!=colors[j]){
                    diff=Math.abs(i-j);
                    max=Math.max(max,diff);
                }
            }
        }
        return max;
    }
}