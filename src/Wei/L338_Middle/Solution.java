package Wei.L338_Middle;

/**
 ����һ���Ǹ����� num������ 0 �� i �� num ��Χ�е�ÿ������ i ����������������е� 1 ����Ŀ����������Ϊ���鷵�ء�

 ʾ�� 1:

 ����: 2
 ���: [0,1,1]
 ʾ�� 2:

 ����: 5
 ���: [0,1,1,2,1,2]
 ����:

 ����ʱ�临�Ӷ�ΪO(n*sizeof(integer))�Ľ��ǳ����ס��������������ʱ��O(n)����һ��ɨ��������
 Ҫ���㷨�Ŀռ临�Ӷ�ΪO(n)��
 ���ܽ�һ�����ƽⷨ��Ҫ����C++���κ����������в�ʹ���κ����ú������� C++ �е� __builtin_popcount����ִ�д˲�����
 */
public class Solution {
    public int[] countBits(int num) {
        if(num<0) return null;
        int[] res = new int[num+1];

        for(int i = 1; i <= num; ++ i) {
            res[i] = res[i&(i-1)] + 1;
        }
        return res;
    }
}
