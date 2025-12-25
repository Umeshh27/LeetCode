class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum=sum+apple[i];
        }
         Arrays.sort(capacity);
        int c=0;
        int box=0;
       
        for(int j=capacity.length-1;j>=0;j--){
            box=box+capacity[j];
            c++;
            if(sum<=box){
            return c;
        }
        }
        return c;
    }
}