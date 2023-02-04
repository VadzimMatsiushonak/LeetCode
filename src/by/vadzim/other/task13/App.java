package by.vadzim.other.task13;

import java.util.*;

// 13. Roman to Integer
public class App {

    private static final List<Character> ALLOWED_SYMBOLS = new ArrayList<>() {{
        add('I');
        add('V');
        add('X');
        add('L');
        add('C');
        add('D');
        add('M');
    }};

    private static final Map<String, Integer> ROMAN_NUMERALS = new HashMap<>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
        /*
        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
         */
        put("IV", 4);
        put("IX", 9);
        put("XL", 40);
        put("XC", 90);
        put("CD", 400);
        put("CM", 900);
    }};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = "Input your Roman value: ";
        System.out.print(text);

        String value = in.nextLine();
        if (validateRomanString(value)) {
            Integer result = romanToInteger(value);
            System.out.printf("%s Roman To Integer %d", value, result);
        } else {
            System.out.println("Your value has invalid characters");
            System.out.println("Allowed symbols: " + ALLOWED_SYMBOLS);
        }
    }

    public static boolean validateRomanString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!ALLOWED_SYMBOLS.contains(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public static Integer romanToInteger(String str) {
        int result = 0;
        int letterCount;
        String temp;
        for (int i = 0; i < str.length(); i++) {
            letterCount = i + 2;
            // Counter, for 2 letters, or 1 letter if we at the end
            if (letterCount > str.length()) {
                letterCount = str.length();
            }

            // Get roman value for 2 letters
            Integer romanValue = ROMAN_NUMERALS.get(str.substring(i, letterCount));
                // If found increase counter
            if (romanValue != null) i++;
                // If not found try to get value for 1 letter
            else romanValue = ROMAN_NUMERALS.get(str.substring(i, letterCount - 1));

            result += romanValue;
        }
        return result;
    }

}
