package DP.L121_Easy;

/**
 ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�

 ��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������

 ע���㲻���������Ʊǰ������Ʊ��

 ʾ�� 1:

 ����: [7,1,5,3,6,4]
 ���: 5
 ����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
 ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�
 ʾ�� 2:

 ����: [7,6,4,3,1]
 ���: 0
 ����: �����������, û�н������, �����������Ϊ 0��
 */
public class OtherSolution {

//    ǰi���������� = max{ǰi-1���������棬��i��ļ۸�-ǰi-1���е���С�۸�}
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0) return 0;
        int r = 0;

        int[][] profit =  new int[prices.length][2];
        profit[0][0] = 0;//ǰi-1����������
        profit[0][1] = prices[0];//ǰi-1�����С�۸�

        for(int i=1;i<prices.length;i++){
            profit[i][0]=Math.max(profit[i-1][0],prices[i]-profit[i-1][1]);
            profit[i][1]=Math.min(prices[i],profit[i-1][1]);
            r=r>profit[i][0]?r:profit[i][0];
        }

        return r;
    }
}
