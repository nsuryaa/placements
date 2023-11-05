class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class Solution {
    boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

public class loopInLinkedList {
    public static void main(String[] args) {
        // Create a linked list with a loop
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second; // Creating a loop from the fifth node to the second node

        Solution solution = new Solution();

        if (solution.detectLoop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

        // Clean up memory by setting references to null
        head = null;
        second = null;
        third = null;
        fourth = null;
        fifth = null;
    }
}
