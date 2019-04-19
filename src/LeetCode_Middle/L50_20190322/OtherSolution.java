package LeetCode_Middle.L50_20190322;

/**
 使用折半计算，每次把n缩小一半，这样n最终会缩小到0，任何数的0次方都为1，
 这时候我们再往回乘，如果此时n是偶数，直接把上次递归得到的值算个平方返
 回即可，如果是奇数，则还需要乘上个x的值。还有一点需要引起我们的注意的
 是n有可能为负数，对于n是负数的情况，我们可以先用其绝对值计算出一个结果
 再取其倒数即可。我们让i初始化为n，然后看i是否是2的倍数，是的话x乘以自
 己，否则res乘以x，i每次循环缩小一半，直到为0停止循环。最后看n的正负，如果为负，返回其倒数。
 */
public class OtherSolution {
/*
     0.00001
             2147483647

             2.00000
10*/
    public static void main(String[] args) {
        System.out.println(myPow3(2.00000,10));
    }


    public static double myPow(double x, int n) {
        double res = 1.0;
        for(int i = n; i != 0; i /= 2){
            if(i % 2 != 0){
                res *= x;
            }
            x *= x;
        }
        return  n < 0 ? 1 / res : res;
    }

    public static double myPow1(double x, int n) {
        double res =1.0;
        int abs = Math.abs(n);

        for(int i=0;i<abs;i++){
            res*=x;
        }

        return n<0?1/res:res;
    }

    public static double myPow3(double x, int n) {
        double res = 1.0;
        for(int i = n; i != 0; i /= 3){
            //只有第一次进来菜存在不是3的倍数
            if(Math.abs(i % 3) ==1){
                res *= x;
            }else if(Math.abs(i%3)==2){
                res *= x*x;
            }
            x*=(x*x);
        }
        return  n < 0 ? 1 / res : res;
    }

}
