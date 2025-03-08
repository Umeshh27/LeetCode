import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap to store the most recent index of each number in the array
        // The key is the number, and the value is its most recent index
        HashMap<Integer, Long> map = new HashMap<>();
        
        // Iterate through the array with a long index 'i'
        for (long i = 0; i < nums.length; i++) {
            
            // Check if the current number is already in the HashMap and if the difference
            // between the current index 'i' and the previous index of the same number is less than or equal to k
            if (map.containsKey(nums[(int)i]) && Math.abs(i - map.get(nums[(int)i])) <= k) {
                // If the condition is true, return true as we found a nearby duplicate
                return true;
            }
            
            // If no duplicate is found within the range 'k', update the map with the current number and its index
            map.put(nums[(int)i], i);
        }
        
        // If the loop finishes without finding any nearby duplicate, return false
        return false;
    }
}
