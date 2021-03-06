package Stack.L739_Middle;

import java.util.Arrays;
import java.util.Stack;

/**
 根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。
 如果之后都不会升高，请输入 0 来代替。

 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，
 你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。

 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的都是 [30, 100] 范围内的整数。
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
