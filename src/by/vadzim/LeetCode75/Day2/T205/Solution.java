package by.vadzim.LeetCode75.Day2.T205;

/**
 * Best results
 * Runtime 2 ms Beats 99.60%
 * Memory 41.8 MB Beats 95.87%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        boolean result1 = solution.isIsomorphic("egg", "add");
        boolean result2 = solution.isIsomorphic("foo", "bar");
        boolean result3 = solution.isIsomorphic("paper", "title");

        System.out.println((true == result1) + " result1 = " + result1);
        System.out.println((false == result2) + " result2 = " + result2);
        System.out.println((true == result3) + " result3 = " + result3);
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int[] sPos = new int[255];
        int[] tPos = new int[255];

        for (int i = 0; i < s.length(); i++) {
            int sChar = sPos[sChars[i]];
            int tChar = tPos[tChars[i]];
            if (sChar == 0 && tChar == 0) {
                sPos[sChars[i]] = tChars[i];
                tPos[tChars[i]] = sChars[i];
            } else {
                if (sChar != tChars[i] || tChar != sChars[i]) {
                    return false;
                }
            }
        }
        return true;
    }


/*
    Second solution

    Runtime 9 ms Beats 65.45%
    Memory 42 MB Beats 83.15%

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer sVal = sMap.get(sChars[i]);
            Integer tVal = tMap.get(tChars[i]);
            if (sVal == null && tVal == null) {
                sMap.put(sChars[i], index);
                tMap.put(tChars[i], index);
                index++;
            } else {
                if (sVal == null || tVal == null) {
                    return false;
                } else if (!sVal.equals(tVal)) {
                    return false;
                }
            }
        }
        return true;
    }
*/

/*
    First solution

    Runtime 10 ms Beats 62.74%
    Memory 42.3 MB Beats 59.22%

    public boolean isIsomorphic(String s, String t) {
        int[] sPos = getCharsPositions(s);
        int[] tPos = getCharsPositions(t);

        return Arrays.equals(sPos, tPos);
    }

    public int[] getCharsPositions(String s) {
        int[] positions = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = s.toCharArray();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            boolean containsKey = map.containsKey(chars[i]);
            if (!containsKey) {
                positions[i] = index;
                map.put(chars[i], index);
                index++;
            } else {
                positions[i] = map.get(chars[i]);
            }
        }
        return positions;
    }
*/

}
