package DiGui_DFS.L124_Hard;

import DiGui_DFS.pojo.TreeNode;

/**
 给定一个非空二叉树，返回其最大路径和。

 本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。

 示例 1:

 输入: [1,2,3]

   1
  / \
 2   3

 输出: 6
 示例 2:

 输入: [-10,9,20,null,null,15,7]

    -10
    / \
   9  20
  /  \
 15   7

 输出: 42
 */
public class Solution {

    private static int maxV = 0;

    public static int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        maxV = root.val;
        getMaxValue(root);
        return maxV;
    }

    //获取最大的值
    private static int getMaxValue(TreeNode root) {

        if(root==null) return 0;

        int left = getMaxValue(root.left);
        int right = getMaxValue(root.right);

        //自己和左子树最大值
        int leftValue = left+root.val;

        //自己和右子树最大值
        int rigthValue = right+root.val;

        //自己和左右子树最大值
        int value = root.val+left+right;


        //最大值，包括左子树最大，右子树最大，桥接值，当前值
        maxV = Math.max(maxV,Math.max(leftValue,Math.max(rigthValue,value)));

        //返回当前节点下的最大值，不包括桥接的，如果桥接了，那么必然与父节点断开了
        return Math.max(Math.max(leftValue,rigthValue),root.val);
    }
/*
              5
           4       8
        11       13   4
      7   2              1



*/


//[5,4,8,11,null,13,4,7,2,null,null,null,1]
    public static void main(String[] args) {


        TreeNode l1= new TreeNode(1);
        TreeNode l1l2 = new TreeNode(-2);
        TreeNode l1r2 = new TreeNode(3);

        l1.left = l1l2;
        l1.right = l1r2;

        System.out.println(maxPathSum(l1));

    }
}
