package DiGui_DFS.L129_Middle;

import DiGui_DFS.pojo.TreeNode;

/**
 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。

 例如，从根到叶子节点路径 1->2->3 代表数字 123。

 计算从根到叶子节点生成的所有数字之和。

 说明: 叶子节点是指没有子节点的节点。

 示例 1:

 输入: [1,2,3]
   1
  / \
 2   3
 输出: 25
 解释:
 从根到叶子节点路径 1->2 代表数字 12.
 从根到叶子节点路径 1->3 代表数字 13.
 因此，数字总和 = 12 + 13 = 25.
 示例 2:

 输入: [4,9,0,5,1]
    4
   / \
  9   0
 / \
 5   1
 输出: 1026
 解释:
 从根到叶子节点路径 4->9->5 代表数字 495.
 从根到叶子节点路径 4->9->1 代表数字 491.
 从根到叶子节点路径 4->0 代表数字 40.
 因此，数字总和 = 495 + 491 + 40 = 1026.
 */
public class Solution {

    private static int max = 0;

    public  static int sumNumbers(TreeNode root) {

        return getValue(root);
    }

    public static int getValue(TreeNode node){

        if(node==null) return 0;

        int left = getValue(node.left);
        int right = getValue(node.right);

        int leftValue =(node.left!=null)?node.val*10+left:0;
        int rightValue =(node.right!=null)?node.val*10+right:0;

        return leftValue+rightValue==0?node.val:leftValue+rightValue;
    }

//    4,9,0,5,1]
    public static void main(String[] args) {
        TreeNode l1 = new TreeNode(4);
        TreeNode l1l = new TreeNode(9);
        TreeNode l1r = new TreeNode(0);
        TreeNode l1l1 = new TreeNode(5);
        TreeNode l1r1 = new TreeNode(1);

        l1.left=l1l;
        l1.right=l1r;

        l1l.left = l1l1;
        l1l.right = l1r1;

        System.out.println(sumNumbers(l1));

    }
}
