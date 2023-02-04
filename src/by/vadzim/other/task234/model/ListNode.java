package by.vadzim.other.task234.model;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void addNext(int val) {
        this.next = new ListNode(val);
    }

    public void addNext(ListNode next) {
        this.next = next;
    }
}
