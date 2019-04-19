package Stack.L84_Hard;

import java.util.Stack;

/**
 ���� n ���Ǹ�������������ʾ��״ͼ�и������ӵĸ߶ȡ�ÿ�����ӱ˴����ڣ��ҿ��Ϊ 1 ��

 ���ڸ���״ͼ�У��ܹ����ճ����ľ��ε���������





 ��������״ͼ��ʾ��������ÿ�����ӵĿ��Ϊ 1�������ĸ߶�Ϊ [2,1,5,6,2,3]��





 ͼ����Ӱ����Ϊ���ܹ��ճ�������������������Ϊ 10 ����λ��



 ʾ��:
       0  1 2 3 4 5
 ����: [2,1,5,6,2,3]
 ���: 10
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

            //�ж�Ϊ��
            if(stack.isEmpty()&&i!=heights.length-1){
                stack.push(i);
                i++;
                continue;
            }

            // �������һ��Ԫ��
            if(i!=heights.length-1){
                //С���������
                if(heights[stack.peek()]<=heights[i]){
                    stack.push(i);
                    i++;
                }else{
                    max = stack.pop();
                    int tmp = (i-max)*heights[max];
                    area = area>tmp?area:tmp;
                }
                //���һ��Ԫ��
            }else{

                //���һ��Ԫ��
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
