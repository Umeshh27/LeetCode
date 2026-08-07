import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Long> map = new HashMap<>();
        for (long i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[(int)i]) && Math.abs(i - map.get(nums[(int)i])) <= k) {
                return true;
            }
            map.put(nums[(int)i], i);
        }
        return false;
    }
}