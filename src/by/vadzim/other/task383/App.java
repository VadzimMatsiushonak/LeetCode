package by.vadzim.other.task383;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 383. Ransom Note
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App app = new App();
        while (true) {
            System.out.println(app.canConstruct(sc.next(), sc.next()));
        }
    }

    private Map<Character, Integer> symbols = new HashMap<>();

    public boolean canConstruct(String ransomNote, String magazine) {
        calculateSymbols(magazine);
        char key;
        for (int i = 0; i < ransomNote.length(); i++) {
            key = ransomNote.charAt(i);
            if (!symbols.containsKey(key) || symbols.get(key) == 0) {
                return false;
            }
            symbols.put(key, symbols.get(key) - 1);
        }
        return true;
    }

    private Map<Character, Integer> calculateSymbols(String magazine) {
        symbols = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (symbols.putIfAbsent(c, 1) != null) {
                symbols.put(c, symbols.get(c) + 1);
            }
        }
        return symbols;
    }
}
