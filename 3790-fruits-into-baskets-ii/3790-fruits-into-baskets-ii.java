class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced=0;
        for(int i=0;i<fruits.length;i++){
            boolean place=false;
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=-1;
                    place=true;
                    break;
                }
            }
            if(!place){
                unplaced++;
            }
        }
        return unplaced;
    }
}