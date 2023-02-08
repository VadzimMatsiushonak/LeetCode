package by.vadzim.LeetCode75.Day1.T1480;

import java.util.Arrays;

/**
 * Best results
 * <p>
 * Runtime 0 ms Beats 100%
 * <p>
 * Memory 41.9 MB Beats 94.49%
 *
 * @author Vadzim Matsiushonak
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result1 = solution.runningSum(new int[]{1, 2, 3, 4});
        int[] result2 = solution.runningSum(new int[]{1, 1, 1, 1, 1});
        int[] result3 = solution.runningSum(new int[]{3, 1, 2, 10, 1});

        System.out.println(Arrays.equals(new int[]{1, 3, 6, 10}, result1) + " result1 = " + Arrays.toString(result1));
        System.out.println(Arrays.equals(new int[]{1, 2, 3, 4, 5}, result2) + " result2 = " + Arrays.toString(result2));
        System.out.println(
            Arrays.equals(new int[]{3, 4, 6, 16, 17}, result3) + " result3 = " + Arrays.toString(result3));
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

/*
    First solution
    public int[] runningSum(int[] nums) {
        int currentValue = 0;
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            currentValue += nums[i];
            output[i] = currentValue;
        }

        return output;
    }
*/

}
