package by.vadzim.LeetCode75.Day5.T409;

/**
 * Best results Runtime 1 ms Beats 100% Memory 40.1 MB Beats 97.53%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int result1 = solution.longestPalindrome("abccccdd");
        int result2 = solution.longestPalindrome("z");
        int result3 = solution.longestPalindrome("ccc");
        int result4 = solution.longestPalindrome(
            "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel");
        int result5 = solution.longestPalindrome("aabbc");
        int result6 = solution.longestPalindrome("aabb");

        System.out.println((7 == result1) + " result1 = " + result1);
        System.out.println((1 == result2) + " result2 = " + result2);
        System.out.println((3 == result3) + " result3 = " + result3);
        System.out.println((445 == result4) + " result4 = " + result4);
        System.out.println((5 == result5) + " result5 = " + result5);
        System.out.println((4 == result6) + " result6 = " + result6);
    }

    public int longestPalindrome(String s) {
        int[] chars = new int[123];
        for (char c : s.toCharArray()) {
            chars[c]++;
        }
        int result = 0;
        for (int i = 'A'; i < chars.length; i++) {
            result += chars[i] >> 1 << 1;
            if ((result & 1) == 0 && (chars[i] & 1) == 1) {
                result++;
            }
        }
        return result;
    }

/*
    Second solution Runtime 1 ms Beats 100% Memory 40.2 MB Beats 97.53%

    private int charsSize = 58; // 'z' - 'A' + 1
    private int firstLetterIndex = 65; // 'A'
    public int longestPalindrome(String s) {
        int[] chars = new int[charsSize];
        for (char c : s.toCharArray()) {
            chars[c - firstLetterIndex]++;
        }
        int result = 0;
        for (int count : chars) {
            result += count / 2 * 2;
            if ((result % 1) == 0 && (count % 1) == 1) {
                result++;
            }
        }
        return result;
    }
*/


/*
    First solution Best results Runtime 5 ms Beats 59.84% Memory 41 MB Beats 46.72%

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer count = map.get(c);
            map.put(c, count == null ? 1 : ++count);
        }

        int result = 0;
        boolean isThereAOne = false;
        for (Integer value : map.values()) {
            if (value % 2 == 0) {
                result += value;
            } else {
                result += value - 1;
                isThereAOne = true;
            }
        }

        if (isThereAOne) {
            result++;
        }

        return result;
    }
*/

}
