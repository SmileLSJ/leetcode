import java.util.ArrayList;
import java.util.List;

/**
 102. �������Ĳ�α���

 ����һ���������������䰴��α����Ľڵ�ֵ�� �������أ������ҷ������нڵ㣩��

 ����:
 ����������: [3,9,20,null,null,15,7],

   3
  / \
 9  20
   /  \
  15   7
 �������α��������

 [
 [3],
 [9,20],
 [15,7]
 ]
 ����ʵ������������������⣿

 䵚

 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class L102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result =  new ArrayList<>();

        List<Integer> r = new ArrayList<>(1);
        r.add(root.val);
        result.add(r);

        getTreeNode(root,result);

        return result;
    }

    //���ڻ�ȡͬһ������
    public List<Integer> getTreeNode(TreeNode node,List<List<Integer>> list){

        List<Integer> li =  new ArrayList<>();

        TreeNode left = node.left;
        TreeNode right = node.right;

        li.add(left.val);
        li.add(right.val);

        list.add(li);

        getTreeNode(left.left,list);
        getTreeNode(left.right,list);
        getTreeNode(right.left,list);
        getTreeNode(right.right,list);

        return li;
    }

    class TreeNode {

     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }
}
