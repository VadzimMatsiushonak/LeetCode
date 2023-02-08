package by.vadzim.LeetCode75.Day2.T392;

/**
 * Best results
 * <p>
 * Runtime 0 ms Beats 100%
 * <p>
 * Memory 39.8 MB Beats 97.64%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        boolean result1 = solution.isSubsequence("abc", "ahbgdc");
        boolean result2 = solution.isSubsequence("axc", "ahbgdc");

        System.out.println((true == result1) + " result1 = " + result1);
        System.out.println((false == result2) + " result2 = " + result2);
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        } else if (s.length() > t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int index = 0;
        for (int i = 0; i < tChars.length; i++) {
            if (tChars[i] == sChars[index]) {
                index++;
                if (index == sChars.length) {
                    return true;
                }
            }
        }
        return false;
    }

}
