package LinkedList.SinglyLL;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBeginning(50);
        linkedList.insertAtEnd(40);

        linkedList.insertAtBeginning(100);
        linkedList.insertAtEnd(30);
        linkedList.insertAtBeginning(10);

        linkedList.insertAtPosition(99, 2);
//        Position Out of Bounds
        linkedList.insertAtPosition(299, 6);

        linkedList.printData();

        linkedList.insertAtPosition(999, 0);
//        Invalid Position
        linkedList.insertAtPosition(999,-1);

        linkedList.printData();

        linkedList.insertAtPosition(150, 0);
        linkedList.insertAtPosition(151, 1);
//        linkedList.insertAtPosition(300, 5);
        linkedList.insertAtPosition(850, 15);

        linkedList.printData();
    }
}
