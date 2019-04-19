package Stack.L739_Middle;

import java.util.Arrays;
import java.util.Stack;

/**
 ����ÿ�� ���� �б�����������һ���б���Ӧλ�õ�����������Ҫ�ٵȴ�����¶ȲŻ����ߵ�������
 ���֮�󶼲������ߣ������� 0 �����档

 ���磬����һ���б� temperatures = [73, 74, 75, 71, 69, 72, 76, 73]��
 ������Ӧ���� [1, 1, 4, 2, 1, 1, 0, 0]��

 ��ʾ������ �б��ȵķ�Χ�� [1, 30000]��ÿ�����µ�ֵ�Ķ��� [30, 100] ��Χ�ڵ�������
 */
public class Solution {
    public static int[] dailyTemperatures(int[] T) {

        int[] result = new int[T.length];

        Stack<Integer> s = new Stack<>();

        //��ǰֵ����ջ�е�ͷԪ��ֵʱ�����޳������Ҹ�ֵ
        int i = 0;
        while(i<T.length){

            if(s.isEmpty()||T[s.peek()]>=T[i]){
                s.push(i);
                i++;
            }else{
                //������֮ǰ�ıȽ�
                Integer index = s.pop();
                result[index]=i-index;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ints = dailyTemperatures(arr);
        Arrays.stream(ints).forEach(i->{
            System.out.println(ints[i]);
        });
    }
}
