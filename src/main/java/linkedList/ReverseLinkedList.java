package linkedList;

public class ReverseLinkedList {

    //206. Reverse Linked List
    //Easy
    //Given the head of a singly linked list, reverse the list, and return the reversed list.

    //Related Topics
    //Linked List
    //Recursion


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode n=head;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            n=temp.next;
            temp.next=prev;
            prev=temp;
            temp=n;
        }
        head=prev;
        return head;
    }
}
