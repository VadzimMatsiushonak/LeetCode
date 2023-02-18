package by.vadzim.LeetCode75.TopSWE.easy;

import java.util.Arrays;

public class T1 {

    public static void main(String[] args) {
        T1 t1 = new T1();
        int[] ints = new int[1000];
        for (int i = 0; i < 1000; i++) {
            ints[i] = i;
        }
        System.out.println("twoSum(ints, 1997) = " + Arrays.toString(t1.twoSum(ints, 1997)));
        ints[0] = 10000;
        ints[999] = 10000;
        System.out.println("twoSum(ints, 20000) = " + Arrays.toString(t1.twoSum(ints, 20000)));
    }

    public int[] twoSum(int[] nums, int target) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                count++;
                if (nums[j] + nums[j - i] == target) {
                    System.out.print("count = " + count + " ");
                    return new int[]{j - i, j};
                }
            }
        }
        return null;
    }

/*
    First Solution
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
*/

}
