package LeetCode_Easy.L961;

import java.util.HashSet;
import java.util.Set;

/**
 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。

 返回重复了 N 次的那个元素。



 示例 1：

 输入：[1,2,3,3]
 输出：3
 示例 2：

 输入：[2,1,2,5,3,2]
 输出：2
 */
public class OtherSolution {

    public static int repeatedNTimes(int[] A) {

        Set<Integer> se = new HashSet<>(A.length/2+1);

        for (int i=0;i<=A.length/2+1;i++) {
            if (!se.add(A[i]))
                return A[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,3};
        System.out.println(repeatedNTimes(arr));
    }
}
