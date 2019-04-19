package Stack.L84_Hard;

import java.util.Stack;

/**
 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。

 求在该柱状图中，能够勾勒出来的矩形的最大面积。





 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3]。





 图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。



 示例:
       0  1 2 3 4 5
 输入: [2,1,5,6,2,3]
 输出: 10
 */
public class Solution {
    public static int largestRectangleArea(int[] heights) {
        int area = 0;
        if(heights.length==1){
            return heights[0];
        }

        Stack<Integer> stack = new Stack<>();

        int i = 0;
        int max  = 0;
        while(i<heights.length){

            //判断为空
            if(stack.isEmpty()&&i!=heights.length-1){
                stack.push(i);
                i++;
                continue;
            }

            // 不是最后一个元素
            if(i!=heights.length-1){
                //小于添加数据
                if(heights[stack.peek()]<=heights[i]){
                    stack.push(i);
                    i++;
                }else{
                    max = stack.pop();
                    int tmp = (i-max)*heights[max];
                    area = area>tmp?area:tmp;
                }
                //最后一个元素
            }else{

                //最后一个元素
                if(stack.size()==0){
                    area = area>heights[heights.length-1]?area:heights[heights.length-1];
                    break;
                }

                max = stack.pop();
                int tmp =0;
                if(heights[max]<=heights[heights.length-1]){
                    tmp = (i-max+1)*heights[max];
                }else {
                    tmp = (i-max)*heights[max];
                }
                area = area>tmp?area:tmp;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,2};
        int i = largestRectangleArea(arr);
        System.out.println(i);
    }
}
