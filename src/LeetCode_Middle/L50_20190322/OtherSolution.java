package LeetCode_Middle.L50_20190322;

/**
 ʹ���۰���㣬ÿ�ΰ�n��Сһ�룬����n���ջ���С��0���κ�����0�η���Ϊ1��
 ��ʱ�����������سˣ������ʱn��ż����ֱ�Ӱ��ϴεݹ�õ���ֵ���ƽ����
 �ؼ��ɣ����������������Ҫ���ϸ�x��ֵ������һ����Ҫ�������ǵ�ע���
 ��n�п���Ϊ����������n�Ǹ�������������ǿ������������ֵ�����һ�����
 ��ȡ�䵹�����ɡ�������i��ʼ��Ϊn��Ȼ��i�Ƿ���2�ı������ǵĻ�x������
 ��������res����x��iÿ��ѭ����Сһ�룬ֱ��Ϊ0ֹͣѭ�������n�����������Ϊ���������䵹����
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
            //ֻ�е�һ�ν����˴��ڲ���3�ı���
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
