package LeetCode_Easy.L905;

/**
 ����һ���Ǹ��������� A������һ���� A ������ż��Ԫ����ɵ����飬����� A ����������Ԫ�ء�

 ����Է���������������κ�������Ϊ�𰸡�



 ʾ����

 ���룺[3,1,2,4]
 �����[2,4,3,1]
 ��� [4,2,3,1]��[2,4,1,3] �� [4,2,1,3] Ҳ�ᱻ���ܡ�
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
