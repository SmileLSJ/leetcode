package Wei.L231_Easy;

/**
 ����һ����������дһ���������ж����Ƿ��� 2 ���ݴη���

 ʾ�� 1:

 ����: 1
 ���: true
 ����: 20 = 1
 ʾ�� 2:

 ����: 16
 ���: true
 ����: 24 = 16
 ʾ�� 3:

 ����: 218
 ���: false
 */
public class Solution {

    public static boolean isPowerOfTwo(int n) {

        if(n<=0) return false;
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2));
    }
}