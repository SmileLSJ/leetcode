package LeetCode_Easy.L977;

/**
 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。



 示例 1：

 输入：[-4,-1,0,3,10]
 输出：[0,1,9,16,100]
 示例 2：

 输入：[-7,-3,2,3,11]
 输出：[4,9,9,49,121]


 提示：

 1 <= A.length <= 10000
 -10000 <= A[i] <= 10000
 A 已按非递减顺序排序。
 */
public class Solution {

    public static int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }


        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {

                if (A[i] > A[j]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
        return A;
    }


    public static void main(String[] args) {
        int a[]  = {-4,-1,0,3,10};
        sortedSquares(a);
        System.out.println(a);
    }
}
