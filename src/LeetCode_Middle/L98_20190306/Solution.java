package LeetCode_Middle.L98_20190306;

/**����һ�����������ж����Ƿ���һ����Ч�Ķ�����������

 ����һ��������������������������

 �ڵ��������ֻ����С�ڵ�ǰ�ڵ������
 �ڵ��������ֻ�������ڵ�ǰ�ڵ������
 �������������������������Ҳ�Ƕ�����������
 ʾ�� 1:

 ����:
 2
 / \
 1   3
 ���: true
 ʾ�� 2:

 ����:
 5
 / \
 1   4
 / \
 3   6
 ���: false
 ����: ����Ϊ: [5,1,4,null,null,3,6]��
 ���ڵ��ֵΪ 5 �����������ӽڵ�ֵΪ 4 ��

 */
class Solution {
    public boolean isValidBST(TreeNode root) {

        if(root==null) return true;

        boolean isLeft = false;
        boolean isRight = false;

        if(root.left!=null){
            if(root.left.val<root.val){
                isLeft = isValidBST(root.left);
            }
        }else{
            isLeft=true;
        }


        if(root.right!=null){
            if(root.right.val>root.val){
                isRight = isValidBST(root.right);
            }
        }else{
            isRight =  true;
        }

        return isLeft && isRight;
    }




    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
