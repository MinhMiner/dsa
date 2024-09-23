// Function Description
// Complete the reversePrint function in the editor below.

// reversePrint has the following parameters:
//     SinglyLinkedListNode pointer head: a reference to the head of the list
// Prints
//     The 'data' values of each node in the reversed list.

public class LinkedList6 {
    public static void reversePrint(SinglyLinkedListNode llist) {
        // Write your code here
        if (llist == null) {
            return;
        }
        reversePrint(llist.next);
        System.out.println(llist.data);
    }
}
