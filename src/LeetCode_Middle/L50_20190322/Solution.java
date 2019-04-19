package LeetCode_Middle.L50_20190322;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 实现 pow(x, n) ，即计算 x 的 n 次幂函数。

 示例 1:

 输入: 2.00000, 10
 输出: 1024.00000
 示例 2:

 输入: 2.10000, 3
 输出: 9.26100
 示例 3:

 输入: 2.00000, -2
 输出: 0.25000
 解释: 2-2 = 1/22 = 1/4 = 0.25
 说明:

 0.00001
 2147483647

 -100.0 < x < 100.0
 n 是 32 位有符号整数，其数值范围是 [?231, 231 ? 1] 。
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