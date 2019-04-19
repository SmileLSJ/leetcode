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
public class Solution {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode tmp = head;

        while(tmp!=null){

            if(tmp.next!=null){
                ListNode n = tmp.next;
                while (n!=null){
                    if(tmp.val==n.val){
                        n = n.next;
                    }else{
                        break;
                    }
                }
                tmp = tmp.next = n;
                continue;
            }else{
                tmp.next=null;
            }
            tmp = tmp.next;
        }
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
