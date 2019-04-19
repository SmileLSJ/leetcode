package List.L203_Easy;

import List.vo.ListNode;

/**
 *
 * 876
 删除链表中等于给定值 val 的所有节点。

 示例:

 输入: 1->2->6->3->4->5->6, val = 6
 输出: 1->2->3->4->5
 */
public class Solution {

    public static ListNode removeElements(ListNode head, int val) {

        ListNode tmp =  head;

        ListNode pre =null;
        while(tmp!=null){
            if(tmp.val==val){
                if(pre==null){
                    head =  head.next;
                }else{
                    pre = pre.next = tmp.next;
                    tmp = tmp.next.next==null?tmp.next:tmp.next.next;
                }
            }else{
                pre = tmp;
                tmp = tmp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode n =  new ListNode(1);
        ListNode n2 =  new ListNode(2);
        ListNode n3=  new ListNode(6);
        ListNode n4=  new ListNode(3);
        ListNode n5=  new ListNode(4);
        ListNode n6=  new ListNode(5);
        ListNode n7=  new ListNode(6);

        n.next = n2;
        n2.next =n3;
        n3.next =n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=null;

        removeElements(n,6);
    }

}
