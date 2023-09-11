import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSumOfUnique() {
        Solution solution = new Solution();

        int[] nums1 = {};
        assertEquals(0, solution.sumOfUnique(nums1));

        int[] nums2 = {5};
        assertEquals(5, solution.sumOfUnique(nums2));

        int[] nums3 = {2, 2, 2, 2, 2};
        assertEquals(0, solution.sumOfUnique(nums3));

        int[] nums4 = {1, 2, 3, 2, 4};
        assertEquals(8, solution.sumOfUnique(nums4));

        int[] nums5 = {1, 1, 1, 1, 1};
        assertEquals(0, solution.sumOfUnique(nums5));

        int[] nums6 = {1000, 2000, 3000, 4000};
        assertEquals(10000, solution.sumOfUnique(nums6));

        int[] nums7 = {7, 7, 7, 7, 7, 7, 7};
        assertEquals(0, solution.sumOfUnique(nums7));

        int[] nums8 = {3, 4, 3, 4, 5};
        assertEquals(5, solution.sumOfUnique(nums8));

        System.out.println("All test cases passed.");
    }
}
