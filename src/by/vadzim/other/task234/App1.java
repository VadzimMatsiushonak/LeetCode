package by.vadzim.other.task234;

import by.vadzim.other.task234.model.ListNode;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

// 234. Palindrome Linked List
public class App1 {


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(1);
        listNode1.addNext(listNode2);
        listNode2.addNext(listNode3);
//        listNode3.addNext(listNode4);

        System.out.println(isPalindromeUsingInt(listNode1));

    }

    public static boolean isPalindromeUsingStringBuilder(ListNode head) {
        ListNode current = head;
        StringBuilder s = new StringBuilder("");
        while (current != null) {
            s.append(current.val);
            current = current.next;
        }
        String s1 = s.toString();
        return (s1.equals(s.reverse().toString()));
    }

    public static boolean isPalindromeUsingList(ListNode head) {
        ListNode current = head;
        List<Integer> values = new ArrayList<>();
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        for (int i = 0; i < Math.ceil(values.size() / 2d); i++) {
            System.out.println(values.get(i) + " " + values.get(values.size() - 1 - i));
            if (!values.get(i).equals(values.get(values.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeUsingInt(ListNode head) {
        ListNode current = head;
        BigDecimal value = new BigDecimal(0);
        int counter = 0;
        while (current != null) {
            value = value.multiply(BigDecimal.valueOf(10));
            value = value.add(BigDecimal.valueOf(current.val));
            counter++;
            current = current.next;
        }

        BigDecimal tempValue = new BigDecimal(String.valueOf(value));
        BigDecimal reversedValue = new BigDecimal(0);

        for (int i = 0; i < counter; i++, tempValue = tempValue.divide(BigDecimal.valueOf(10), RoundingMode.DOWN)) {
            reversedValue = reversedValue.multiply(BigDecimal.valueOf(10));
            BigDecimal remainder = tempValue.remainder(BigDecimal.valueOf(10));
            reversedValue = reversedValue.add(remainder);
        }
        return value.equals(reversedValue);
    }

}
