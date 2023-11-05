class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class middleElementLL {
    static int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        // Create a sample linked list for testing getMiddle
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Call getMiddle function and print the result
        int middleValue = getMiddle(head);
        System.out.println("The middle element in the linked list is: " + middleValue);

        // No need to explicitly clean up memory in Java, as it uses automatic memory
        // management.
    }
}
