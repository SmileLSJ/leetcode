package LeetCode_Middle.L50_20190322;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 ʵ�� pow(x, n) �������� x �� n ���ݺ�����

 ʾ�� 1:

 ����: 2.00000, 10
 ���: 1024.00000
 ʾ�� 2:

 ����: 2.10000, 3
 ���: 9.26100
 ʾ�� 3:

 ����: 2.00000, -2
 ���: 0.25000
 ����: 2-2 = 1/22 = 1/4 = 0.25
 ˵��:

 0.00001
 2147483647

 -100.0 < x < 100.0
 n �� 32 λ�з�������������ֵ��Χ�� [?231, 231 ? 1] ��
 */
class Solution {

    public static void main(String[] args) {

        double x = 0.00001;
        int n = 2147483647;

        System.out.println(myPow(x,n));

    }


    public static double myPow(double x, int n) {
        if(n==0) {
            return 1;
        }

        if(n>0){
            return pow(x,n);
        }else{
            return 1/pow(x, -1*n);
        }
    }

    private static double pow(double x,int n){

        x = new BigDecimal(x).setScale(5,BigDecimal.ROUND_DOWN).doubleValue();

        if(n==0) return 1;
        else return new BigDecimal(x*pow(x,n-1)).setScale(5,BigDecimal.ROUND_DOWN).doubleValue();
    }
}