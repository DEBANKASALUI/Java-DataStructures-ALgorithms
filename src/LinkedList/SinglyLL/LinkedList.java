package LinkedList.SinglyLL;

public class LinkedList {

    Node head = null;

    //  insert at beginning
    public void insertAtBeginning(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //    insert at end
    public void insertAtEnd(int item) {
        Node newNode = new Node(item);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //      insert at specific position
    public void insertAtPosition(int item, int position) {
        Node newNode = new Node(item);
        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int index = 0;
        while (temp.next != null) {
            if (index == position - 1)
                break;
            temp = temp.next;
            index++;

        }
        if (temp.next == null) {
            System.out.println("Position out of Bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printData() {
        if (head == null) {
            System.out.println("Linked List is Empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next == null)
                System.out.println(temp.data);
            else
                System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
}
