package List.L876_Easy;

/**
 ����һ������ͷ��� head �ķǿյ���������������м��㡣

 ����������м��㣬�򷵻صڶ����м��㡣



 ʾ�� 1��

 ���룺[1,2,3,4,5,6,7,8,9]
 ��������б��еĽ�� 3 (���л���ʽ��[3,4,5])
 ���صĽ��ֵΪ 3 �� (����ϵͳ�Ըý�����л������� [3,4,5])��
 ע�⣬���Ƿ�����һ�� ListNode ���͵Ķ��� ans��������
 ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, �Լ� ans.next.next.next = NULL.
 ʾ�� 2��

 ���룺[1,2,3,4,5,6]
 ��������б��еĽ�� 4 (���л���ʽ��[4,5,6])
 ���ڸ��б��������м��㣬ֵ�ֱ�Ϊ 3 �� 4�����Ƿ��صڶ�����㡣
 */
public class Solution {

    //����ָ�룬q����һ�ߣ�p�ı�һ����������һ��Ҳ�ƶ�
    public ListNode middleNode(ListNode head) {

        if(head.next==null) return  head;
        if(head.next.next==null) return head.next;

        ListNode  p=head,q=head;
        while(q!=null && q.next!=null){
            p = p.next;
            q = q.next.next;
        }
        return p;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
