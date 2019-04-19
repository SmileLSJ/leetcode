package Base.String.L121_Easy;

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
public class Solution {

    public static int maxProfit(int[] prices) {


        if (prices.length==0) return 0;

        int min = 0;
        int max = 0;

        for (int i=0;i<prices.length;i++) {
            int price = prices[i];
            if(price<prices[min] && i< prices.length-1){
                min=i;
                max=i;
            }else if(price>prices[max]){
                max=i;
            }
        }
        return max>min?prices[max]-prices[min]:0;
    }

    public static void main(String[] args) {
        int[] i = {3,2,6,5,0,3};
        maxProfit(i);
    }
}
