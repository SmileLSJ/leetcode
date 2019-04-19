package LeetCode_Easy.L961;

import java.util.HashSet;
import java.util.Set;

/**
 �ڴ�СΪ 2N ������ A ���� N+1 ����ͬ��Ԫ�أ�������һ��Ԫ���ظ��� N �Ρ�

 �����ظ��� N �ε��Ǹ�Ԫ�ء�



 ʾ�� 1��

 ���룺[1,2,3,3]
 �����3
 ʾ�� 2��

 ���룺[2,1,2,5,3,2]
 �����2
 */
public class Solution {

    public static int repeatedNTimes(int[] A) {

        Set<Integer> se = new HashSet<>();

        for(int i=0;i<=(A.length/2)+1;i++){
            if(!se.contains(A[i])){
                se.add(A[i]);
            }else{
                return A[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,3};
        System.out.println(repeatedNTimes(arr));
    }
}
