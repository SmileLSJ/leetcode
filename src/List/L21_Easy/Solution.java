package List.L21_Easy;

import List.vo.ListNode;

/**
 ��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ�

 ʾ����

 ���룺1->2->4, 1->3->4
 �����1->1->2->3->4->4
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode tmp =  head;

        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){

                if(l1.val<l2.val){
                    tmp.next = new ListNode(l1.val);
                    l1 = l1.next;
                }else {
                    tmp.next =  new ListNode(l2.val);
                    l2 = l2.next;
                }

            }else{

                if(l1==null){
                    tmp.next =  new ListNode(l2.val);
                    l2 = l2.next;
                }else {
                    tmp.next =  new ListNode(l1.val);
                    l1 = l1.next;
                }
            }

            tmp = tmp.next;
        }

        return head.next;
    }

}
