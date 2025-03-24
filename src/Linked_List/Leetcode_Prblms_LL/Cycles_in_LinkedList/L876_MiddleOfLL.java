package Linked_List.Leetcode_Prblms_LL.Cycles_in_LinkedList;

public class L876_MiddleOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
