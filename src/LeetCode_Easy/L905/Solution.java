package LeetCode_Easy.L905;

/**
 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。

 你可以返回满足此条件的任何数组作为答案。



 示例：

 输入：[3,1,2,4]
 输出：[2,4,3,1]
 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class Solution {

    public int[] sortArrayByParity(int[] A) {
        int startIndex = 0;
        int endIndex = A.length-1;

        int[] B = new int[A.length];
        for (int i=0;i<A.length;i++){
            if(A[i]%2==0){
                B[startIndex++]=A[i];
            }else{
                B[endIndex--]=A[i];
            }
        }

        return B;
    }
}
