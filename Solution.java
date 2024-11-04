import java.util.HashMap;

public class Solution {
    public boolean hasDuplicate(int[] nums) {

        // nums = [1, 2, 3, 3]
        HashMap<Integer, Integer> numFrequency = new HashMap<Integer, Integer>();

        for (int i : nums) {
            int frequency = numFrequency.getOrDefault(i, 0) + 1;
            if (frequency > 1) {
                return true;
            }
            numFrequency.put(i, frequency);
        }
        return false;
    }
}
