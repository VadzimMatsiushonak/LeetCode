package by.vadzim.LeetCode75.Day7.T704;

/**
 * Best results
 * <p>
 * Runtime 0 ms Beats 100%
 * <p>
 * Memory 42.8 MB Beats 84.30%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result1 = solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        int result2 = solution.search(new int[]{2, 5}, 9);
        System.out.println((4 == result1) + " result1 = " + result1);
        System.out.println((-1 == result2) + " result2 = " + result2);
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pointer = 0;
        while (left <= right) {
            pointer = (left + right) / 2;
            if (nums[pointer] == target) {
                return pointer;
            } else {
                if (target > nums[pointer]) {
                    left = pointer + 1;
                } else {
                    right = pointer - 1;
                }
            }
        }
        return -1;
    }

/*
    First solution
    Runtime 0 ms Beats 100% Memory 43 MB Beats 60.98%
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        int length = nums.length;
        int left = -1;
        int right = length + 1;
        int ceil, iterator;
        while (true) {
            ceil = (int) Math.ceil((left + right) / 2.0);
            iterator = ceil - 1;
            if (right - left <= 1) {
                return -1;
            }
            int num = nums[iterator];
            if (num == target) {
                return iterator;
            } else {
                if (target > num) {
                    left = ceil;
                } else {
                    right = ceil;
                    if (right == 1) {
                        return -1;
                    }
                }
            }
        }
    }
*/

}
