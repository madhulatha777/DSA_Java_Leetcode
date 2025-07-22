package Codolio;

public class AddingNodeAtEnd {

    public Node insertAtEnd(Node head, int x) {
        Node temp = head;
        Node newNode = new Node(x);
        if(head == null){
            return newNode;
        }

        while(head.next != null){
            head = head.next;
        }
        head.next = newNode;
        return temp;
    }
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
}
