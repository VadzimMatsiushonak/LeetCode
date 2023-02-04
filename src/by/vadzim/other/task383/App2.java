package by.vadzim.other.task383;

import java.util.Scanner;

// 383. Ransom Note
public class App2 {

    private int[] alphabet = new int[26];
    private int firstLetter = 'a';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App2 app = new App2();
        while (true) {
            System.out.println(app.canConstruct(sc.next(), sc.next()));
        }
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        calculateSymbols(magazine);
        char letter;
        for (int i = 0; i < ransomNote.length(); i++) {
            letter = ransomNote.charAt(i);
            if (alphabet[letter-firstLetter] == 0) {
                return false;
            }
            alphabet[letter-firstLetter]--;
        }
        return true;
    }

    private void calculateSymbols(String magazine) {
        alphabet = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            alphabet[c-firstLetter]++;
        }
    }


}
