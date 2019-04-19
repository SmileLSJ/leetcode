package List.L206_Easy;

/**
 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 进阶:
 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {


    //递归
    public static  ListNode reverseList(ListNode head) {

        if(head.next==null || head==null) return head;

        // 5
        ListNode sNode = reverseList(head.next);

        // 4
        head.next.next=head;
        head.next = null;

        return sNode;
    }

    //迭代
    public static ListNode reverseList2(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode pre =null;
        ListNode cur = head;

        while (cur!=null){
            ListNode last = cur.next;
            cur.next = pre;
            pre = cur;
            cur = last;
        }

        return pre;
    }





    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;

        ListNode listNode = reverseList2(n1);

    }




    static class ListNode {
      int val;
      ListNode next;
        ListNode(int x) { val = x; }
    }
}