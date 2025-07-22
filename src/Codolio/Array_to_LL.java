package Codolio;

public class Array_to_LL {

    public static Node constructLL(int arr[]) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        return head;
    }

    static class Node {
        int data;
        Node next;

        Node() { data = 0; }
        Node(int d) { data = d; }  //constructor to create a new node
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6};
        System.out.println(constructLL(arr));
    }
}
