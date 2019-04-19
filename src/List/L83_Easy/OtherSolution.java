package List.L83_Easy;

import List.vo.ListNode;

/**
 ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�

 ʾ�� 1:

 ����: 1->1->2
 ���: 1->2
 ʾ�� 2:

 ����: 1->1->2->3->3
 ���: 1->2->3
 */
public class OtherSolution {

    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val) head = head.next;
        return head;
    }

    //[1,1,2,3,3]
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(3);
        n1.next =n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;

        deleteDuplicates(n1);
    }
}
