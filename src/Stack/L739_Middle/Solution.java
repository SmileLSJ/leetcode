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
public class Solution {
    public static int[] dailyTemperatures(int[] T) {

        int[] result = new int[T.length];

        Stack<Integer> s = new Stack<>();

        //当前值大于栈中的头元素值时，就剔除，并且赋值
        int i = 0;
        while(i<T.length){

            if(s.isEmpty()||T[s.peek()]>=T[i]){
                s.push(i);
                i++;
            }else{
                //依次与之前的比较
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
