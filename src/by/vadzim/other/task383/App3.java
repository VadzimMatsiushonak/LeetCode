package by.vadzim.other.task383;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        App3 app3 = new App3();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String n1 = scanner.next();
            String n2 = scanner.next();
            long startTime = System.nanoTime();
            app3.canConstruct(n1, n2);
            long stopTime = System.nanoTime();
            System.out.println(stopTime - startTime);
            long startTime1 = System.nanoTime();
            app3.canConstruct2(n1, n2);
            long stopTime1 = System.nanoTime();
            System.out.println(stopTime1 - startTime1);
        }

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ind = new int[26];
        int index=0;
        for(char c : ransomNote.toCharArray())
        {
            int fromIndex = ind[c - 'a'];
            index = magazine.indexOf(c, fromIndex);
            if (index == -1) return false;
            ind[c - 'a'] = index+1;
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        if(magazine.length() == 1)
            return ransomNote.equals(magazine);
        int[] hash = new int[26];

        for(char c : magazine.toCharArray())
            hash[c - 'a']++;

        for(char c : ransomNote.toCharArray()){
            int val = --hash[c - 'a'];
            if(val < 0)
                return false;
        }
        return true;
    }
}
