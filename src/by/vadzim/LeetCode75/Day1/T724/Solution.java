package by.vadzim.LeetCode75.Day1.T724;

/**
 * Best results
 * <p>
 * Runtime 1 ms Beats 100%
 * <p>
 * Memory 42.6 MB Beats 95.39%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int result1 = solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        int result2 = solution.pivotIndex(new int[]{1, 2, 3});
        int result3 = solution.pivotIndex(new int[]{2, 1, -1});

        System.out.println((3 == result1) + " result1 = " + result1);
        System.out.println((-1 == result2) + " result2 = " + result2);
        System.out.println((0 == result3) + " result3 = " + result3);
    }

    public int pivotIndex(int[] nums) {
        int totalSum = 0, currentSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (currentSum << 1 == totalSum - nums[i]) {
                return i;
            }
            currentSum += nums[i];
        }
        return -1;
    }

/*
    First solution
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int sumWithoutCurrentNumber = totalSum - nums[i];
            if (currentSum << 2 == sumWithoutCurrentNumber) {
                return i;
            }
            currentSum += nums[i];
        }
        return -1;
    }
*/

}
