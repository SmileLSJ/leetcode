package DiGui_DFS.L687_Easy;

import org.junit.Test;

/**
 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。

 注意：两个节点之间的路径长度由它们之间的边数表示。

 示例 1:

 输入:

    5
   / \
  4   5
 / \   \
 1   1   5
 输出:

 2
 示例 2:

 输入:

    1
   / \
  4   5
 / \   \
 4   4   5
 输出:

 2
 注意: 给定的二叉树不超过10000个结点。 树的高度不超过1000。
 */
public class OtherSolution {

    private static int maxL = 0;
    public static int longestUnivaluePath(TreeNode root) {
        /**
         解题思路类似于124题, 对于任意一个节点, 如果最长同值路径包含该节点, 那么只可能是两种情况:
         1. 其左右子树中加上该节点后所构成的同值路径中较长的那个继续向父节点回溯构成最长同值路径
         2. 左右子树加上该节点都在最长同值路径中, 构成了最终的最长同值路径
         需要注意因为要求同值, 所以在判断左右子树能构成的同值路径时要加入当前节点的值作为判断依据
         **/
        getMaxL(root);
        return maxL;
    }


    //因为是在得到子结果后，在于该父节点进行判断，是否需要添加
    private static int getMaxL(TreeNode r) {
        if(r == null) return 0;

        int left = getMaxL(r.left);
        int right = getMaxL(r.right);

        if(r.left!=null&&r.left.val==r.val){
            left+=1;
        }else{
            //因为是从底部进行递归到root，所以如果与父节点不相等的话，值肯定是0
            left =0;
        }
        if(r.right!=null&&r.right.val==r.val){
            right+=1;
        }else{
            //因为是从底部进行递归到root，所以如果与父节点不相等的话，值肯定是0
            right=0;
        }

        //至于中间桥接比较
        maxL = Math.max(maxL,left+right);

        //只返回该节点下左子树和右子树的最大值
        return Math.max(left,right);
    }

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  @Test
    public void text() {

        TreeNode root = new TreeNode(1);
        TreeNode l1 = new TreeNode(4);
        TreeNode r1 = new TreeNode(5);
        TreeNode l1l = new TreeNode(4);
        TreeNode l1r = new TreeNode(4);
        TreeNode r1r = new TreeNode(5);

        root.left = l1;
    //        root.right = r1;

        l1.left = l1l;
    //        l1.right = l1r;

    //        r1.right = r1r;

        System.out.println(longestUnivaluePath(root));

    }

}
