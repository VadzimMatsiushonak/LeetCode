package by.vadzim.LeetCode75.Day1.T1480;

import java.util.Arrays;

/**
 * Best results:
 * Runtime 0 ms Beats 100%
 * Memory 41.9 MB Beats 94.49%
 *
 * @author Vadzim Matsiushonak
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] result1 = solution.runningSum1(nums);
        int[] result2 = solution.runningSum2(nums);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    public int[] runningSum1(int[] nums) {
        int currentValue = 0;
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            currentValue += nums[i];
            output[i] = currentValue;
        }

        return output;
    }

    public int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
