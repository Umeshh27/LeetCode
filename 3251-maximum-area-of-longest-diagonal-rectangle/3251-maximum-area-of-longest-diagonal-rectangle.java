class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxdiagonal=0;
        int maxarea=0;
        for(int i=0;i<dimensions.length;i++){
            int length=dimensions[i][0];
            int width=dimensions[i][1];
            double diagonal=Math.sqrt(length*length+width*width);
            int area=length*width;
            if(diagonal > maxdiagonal || (diagonal == maxdiagonal && area > maxarea)){
                maxdiagonal=diagonal;
                maxarea=area;
            }
        }
        return maxarea;
    }
}