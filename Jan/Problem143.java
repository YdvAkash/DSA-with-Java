package Jan;

import java.util.List;

public class Problem143 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        head.next = node1;
        for(int i = 2; i <= 12; i++) {
            node1.next = new ListNode(i);
            node1 = node1.next;
        }
        printList(head);
        reorderList(head);
    }

    private static void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        // Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode prev = null;
        ListNode curr = slow;
        printList(curr);
        while(curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        printList(prev);
        // Merge the two halves
        ListNode first = head;
        ListNode second = prev;
        while(second.next != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
        System.out.println("After Reordering:");
        System.out.println("head =>  ");
        printList(head);
        System.out.println("slow =>  ");
        printList(slow);
        System.out.println("fast =>  ");
        printList(fast);
        System.out.println("first =>  ");
        printList(first);
        System.out.println("second =>  ");
        printList(second);

    }   

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
        System.out.println("null");
        
    }
}
