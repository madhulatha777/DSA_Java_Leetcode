package Linked_List.leetcode_prblms;

import Linked_List.Theory_LL.Single_LL.LL;

public class Recursive_Insertion_In_LL {
    private Node head;
    private Node tail;
    private int size;
   public void InsertRec(int val,int pos,Node head){
       if(pos == 1){
           Node node = new Node(7);
           node.next = head.next;
           head.next = node;
           return;
       }
       head = head.next;
       InsertRec(7,pos-1,head);
   }

    private static class Node{
        private final int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value  = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}
