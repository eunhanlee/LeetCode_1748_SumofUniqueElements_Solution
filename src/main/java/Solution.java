import java.util.HashMap;

public class Solution {

    /**
     * Calculates the sum of unique elements in the array.
     *
     * @param nums An integer array
     * @return The sum of unique elements in the array
     */
    public int sumOfUnique(int[] nums) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize a variable to store the result
        int sum = 0;

        // Iterate through the array to calculate the frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Iterate through the array again to calculate the sum of unique elements
        for (int num : nums) {
            if (map.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}
