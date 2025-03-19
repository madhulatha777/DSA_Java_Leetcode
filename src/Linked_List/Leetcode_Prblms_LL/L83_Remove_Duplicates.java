package Linked_List.Leetcode_Prblms_LL;

public class L83_Remove_Duplicates {
    public static ListNode deleteDuplicates(ListNode node){
        if(node == null){
            return node;
        }
        ListNode head = node;
        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(5);
        head = insertFirst(head,3);
        head = insertFirst(head,3);
        head = insertFirst(head,2);
        head = insertFirst(head,1);
        head = insertFirst(head,1);
        display(head);
//        head = deleteDuplicates(head);
//        display(head);
        System.out.println(deleteDuplicates(head));
        display(head);
    }

    public static ListNode insertFirst(ListNode head,int value){
        return new ListNode(value,head);
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
