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
public class OtherSolution {
    public static int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[T.length];

        int i = 0;
        while (i < T.length) {

            if (stack.isEmpty() || T[stack.peek()] >= T[i]) {
                stack.push(i);
                i++;
            } else {
                Integer index = stack.pop();
                res[index] = i - index;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {89,62,70,58,47,47,46,76,100,70};
        int[] ints = dailyTemperatures(arr);
        Arrays.stream(ints).forEach(i->{
            System.out.println(ints[i]);
        });
    }
}
