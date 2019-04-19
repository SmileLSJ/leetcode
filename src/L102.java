import java.util.ArrayList;
import java.util.List;

/**
 102. 二叉树的层次遍历

 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。

 例如:
 给定二叉树: [3,9,20,null,null,15,7],

   3
  / \
 9  20
   /  \
  15   7
 返回其层次遍历结果：

 [
 [3],
 [9,20],
 [15,7]
 ]
 在真实的面试中遇到过这道题？

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

    //用于获取同一级数据
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
