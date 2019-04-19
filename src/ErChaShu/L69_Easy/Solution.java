package ErChaShu.L69_Easy;

/**
 ʵ�� int sqrt(int x) ������
 ���㲢���� x ��ƽ���������� x �ǷǸ�������
 ���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
 ʾ�� 1:
 ����: 4
 ���: 2

 ʾ�� 2:
 ����: 8
 ���: 2
 ˵��: 8 ��ƽ������ 2.82842...,
 ���ڷ���������������С�����ֽ�����ȥ��
 */
class Solution {
    public static int mySqrt(int x) {

        for(int i=0;i<Integer.MAX_VALUE;i++){

            if(x>=i*i && x<(i+1)*(i+1)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}