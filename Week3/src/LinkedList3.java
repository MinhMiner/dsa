// Function Description
// Complete the function insertNodeAtHead in the editor below.

// insertNodeAtHead has the following parameter(s):
//     SinglyLinkedListNode llist: a reference to the head of a list
//     data: the value to insert in the 'data' field of the new node

public class LinkedList3 {
    // Complete the insertNodeAtHead function below.
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist;
        return newNode;
    }    
}
