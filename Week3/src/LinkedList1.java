/**
 * Function Description
 * Complete the printLinkedList function in the editor below.
 * printLinkedList has the following parameter(s):
 *      SinglyLinkedListNode head: a reference to the head of the list
 * Print:
 *      For each node, print its 'data' value on a new line.
*/

public class LinkedList1 {
    // Complete the printLinkedList function below.
    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
