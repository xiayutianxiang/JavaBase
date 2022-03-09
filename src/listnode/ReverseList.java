package listnode;

public class ReverseList {

    static class ListNode{
        int val;
        ListNode next;

       public ListNode(int val,ListNode next){
           this.val=val;
           this.next=next;
       }
    }

    private static ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = head;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        ListNode listNode = reverseList(listNode1);
        System.out.println(listNode);
    }
}
