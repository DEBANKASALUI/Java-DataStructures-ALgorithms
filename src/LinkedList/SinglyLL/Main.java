package LinkedList.SinglyLL;

import java.util.Scanner;

public class Main {
    public static void printMenu() {
        System.out.println("******MENU*********");
        System.out.println("Enter 1 to INSERT");
        System.out.println("Enter 2 to DELETE");
        System.out.println("Enter 3 to SEARCH");
        System.out.println("Enter 4 to DISPLAY");
        System.out.println("Enter 5 to EXIT");
        System.out.println("*****************");
        System.out.println("Enter your choice:");

    }

    public static void printInsertMenu() {
        System.out.println("******INSERT  MENU*********");
        System.out.println("Enter 1 to INSERT at Beginning");
        System.out.println("Enter 2 to INSERT at END");
        System.out.println("Enter 3 to INSERT at specific Position");
        System.out.println("Enter your INSERT choice:");
    }

    public static void printDeleteMenu() {
        System.out.println("******DELETE  MENU*********");
        System.out.println("Enter 1 to DELETE at Beginning");
        System.out.println("Enter 2 to DELETE at END");
        System.out.println("Enter 3 to DELETE at specific Position");
        System.out.println("Enter your DELETE choice:");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        /*
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
         */

        System.out.println("WELCOME TO LINKED LIST !");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                printMenu();
                int choice = sc.nextInt();
                if (choice == 1) {
                    insertIntoLinkedist(linkedList);
                    linkedList.printData();
                } else if (choice == 2) {
                    deleteFromLinkedList(linkedList);
                    linkedList.printData();
                } else if (choice == 3) {
                    System.out.println("ENTER DATA to Search");
                    int data = sc.nextInt();
                    if (linkedList.searchData(data)) {
                        System.out.println("DATA present in Linked List");
                    } else {
                        System.out.println("DATA not present in Linked List");
                    }
                } else if (choice == 4) {
                    linkedList.printData();
                }else if (choice == 5) {
                    System.out.println("THANK YOU..!");
                    break;
                } else {
                    System.out.println("INVALID CHOICE!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    private static void insertIntoLinkedist(LinkedList linkedList) {
        Scanner sc = new Scanner(System.in);
        printInsertMenu();
        int ich = sc.nextInt();
        if (ich == 1) {
            System.out.println("ENTER DATA to INSERT");
            int data = sc.nextInt();
            linkedList.insertAtBeginning(data);
            System.out.println("INSERTED Successfully..");
        } else if (ich == 2) {
            System.out.println("ENTER DATA to INSERT");
            int data = sc.nextInt();
            linkedList.insertAtEnd(data);
            System.out.println("INSERTED Successfully..");
        } else if (ich == 3) {
            System.out.println("ENTER DATA to INSERT");
            int data = sc.nextInt();
            System.out.println("ENTER Position to INSERT");
            int pos = sc.nextInt();
            linkedList.insertAtPosition(data,pos);
            System.out.println("INSERTED Successfully..");
        } else {
            System.out.println("INVALID CHOICE!");
        }
    }

    private static void deleteFromLinkedList(LinkedList linkedList) {
        Scanner sc = new Scanner(System.in);
        printDeleteMenu();
        int dch = sc.nextInt();
        if (dch == 1) {
            linkedList.deleteFromBeginning();
            System.out.println("DELETED Successfully..");
        } else if (dch == 2) {
            linkedList.deleteFromEnd();
            System.out.println("DELETED Successfully..");
        } else if (dch == 3) {
            System.out.println("ENTER Position to Delete");
            int pos = sc.nextInt();
            linkedList.deleteFromPosition(pos);
            System.out.println("DELETED Successfully..");
        } else {
            System.out.println("INVALID CHOICE!");
        }
    }
}
