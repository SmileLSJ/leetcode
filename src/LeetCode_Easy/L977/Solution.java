package LeetCode_Easy.L977;

/**
 ����һ�����ǵݼ�˳��������������� A������ÿ�����ֵ�ƽ����ɵ������飬Ҫ��Ҳ���ǵݼ�˳������



 ʾ�� 1��

 ���룺[-4,-1,0,3,10]
 �����[0,1,9,16,100]
 ʾ�� 2��

 ���룺[-7,-3,2,3,11]
 �����[4,9,9,49,121]


 ��ʾ��

 1 <= A.length <= 10000
 -10000 <= A[i] <= 10000
 A �Ѱ��ǵݼ�˳������
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
