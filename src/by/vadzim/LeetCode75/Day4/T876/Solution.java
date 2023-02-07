package by.vadzim.LeetCode75.Day4.T876;

import by.vadzim.LeetCode75.model.ListNode;

/**
 * Best results Runtime 0 ms Beats 100% Memory 39.4 MB Beats 97.21%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(3, new ListNode(4, new ListNode(5)));

        Solution solution = new Solution();
        ListNode result = solution.middleNode(list);
        System.out.println(expected.equals(result) + " result = " + result);
    }

    public ListNode middleNode(ListNode head) {
        int counter = 1;
        ListNode temp = head.next;

        while (temp != null) {
            counter++;
            if (counter % 2 == 0) {
                head = head.next;
            }
            temp = temp.next;
        }

        return head;
    }

/*
    Better solution
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        while(head!=null && head.next!=null){
            head = head.next.next;
            middle = middle.next;
        }
        return middle;
    }
*/


}
