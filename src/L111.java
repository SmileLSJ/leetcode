/**
 111. ����������С���

 ����һ�����������ҳ�����С��ȡ�

 ��С����ǴӸ��ڵ㵽���Ҷ�ӽڵ�����·���ϵĽڵ�������

 ˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣

 ʾ��:

 ���������� [3,9,20,null,null,15,7],

   3
  / \
 9  20
   /  \
  15   7
 ����������С���  2.

 ����ʵ������������������⣿
 */
public class L111 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node = new TreeNode(9);
        TreeNode node1 = new TreeNode(20);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(7);

        root.left=node;
//        root.right=node1;
//        node1.left=node2;
//        node2.right=node3;

        System.out.println(minDepth(root));
    }


    public static int minDepth(TreeNode root) {
        int depth = 0;
        if(root!=null){
            depth = 1;

            int leftNum = minDepth(root.left);
            int rightNum = minDepth(root.right);

            if(leftNum==0 && rightNum!=0){
                depth+=rightNum;
            }else if(leftNum!=0 && rightNum==0){
                depth+=leftNum;
            }else if(leftNum!=0&&rightNum!=0){
                depth+=leftNum<rightNum?leftNum:rightNum;
            }else{
                depth+=0;
            }
        }
        return  depth;
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
