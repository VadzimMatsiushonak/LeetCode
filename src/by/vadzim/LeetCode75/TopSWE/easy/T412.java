package by.vadzim.LeetCode75.TopSWE.easy;

import java.util.ArrayList;
import java.util.List;

public class T412 {

    public static void main(String[] args) {
        T412 solution = new T412();
        List<String> result1 = solution.fizzBuzz(3);
        System.out.println("result1 = " + result1);
        List<String> result2 = solution.fizzBuzz(5);
        System.out.println("result2 = " + result2);
        List<String> result3 = solution.fizzBuzz(15);
        System.out.println("result3 = " + result3);
    }

    public List<String> fizzBuzz(int n) {
        List<String> response = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    response.add("FizzBuzz");
                } else {
                    response.add("Fizz");
                }
            } else if (i % 5 == 0) {
                response.add("Buzz");
            } else {
                response.add(Integer.toString(i));
            }
        }
        return response;
    }

}
