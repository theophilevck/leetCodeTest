package linkedList;

public class MergeTwoSortedLists {

    //21. Merge Two Sorted Lists
    //Easy
    //You are given the heads of two sorted linked lists list1 and list2.
    //
    //Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    //
    //Return the head of the merged linked list.

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


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode result = new ListNode(-1);
        ListNode current = result;


        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                current.next = list2;
                list2 = list2.next;
                current = current.next;

            } else {
                current.next = list1;
                list1 = list1.next;
                current = current.next;

            }
        }

        while (list1 != null) {
            current.next = list1;
            list1 = list1.next;
            current = current.next;

        }

        while (list2 != null) {
            current.next = list2;
            list2 = list2.next;
            current = current.next;
        }
        return result.next;
    }

}
