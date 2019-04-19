package Stack.L84_Hard;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://blog.csdn.net/Zolewit/article/details/88863970
 */
public class OtherSolution {
    /**
     * ���õ���ջ  ��⣬����˼·�� ������i�߶�Ϊ���θ߶�ʱ�����γ������������������ҳ���i����������ߺ��ұ߱���ʱ��һ�������͵����ӣ�
     * ����ջ���壺ֻ��߶ȵ���������
     * ����
     * ��ջʱ��
     * ��ô�������ջΪ���ˣ�˵��û�б�������Ӹ��͵��ˣ����ο��Ϊ������ӵ���ţ������Ϊ0��
     * �������ջ��Ϊ�գ�˵��ջ��������Ӹ߶ȶ�С����ô�����Ϊջ�����ӵ����
     *
     * �����ұ���Ϊi ��Ϊ���ջ ��˵����ȱ��˵��ˣ����Ѿ������ܴﵽ�����������.��ջ��¼���
     * **/
    public static int largestRectangleArea(int[] heights) {
        int heightn[] =new int[heights.length+1];
        for (int i = 0; i < heights.length; i++) {
            heightn[i] = heights[i];
        }
        heightn[heights.length] = 0;   //������Ӹ��߶�Ϊ0 �����ӣ��Ա�ɵ���ջ����Ķ�����ȥ��
        Deque<Integer> stack =new ArrayDeque<>(); //�洢���
        int maxS=0;
        for (int i = 0; i < heightn.length;i++) {
            while (!stack.isEmpty() && heightn[i]<heightn[stack.peek()]){  //һֱ��ջ ֱ������С��
                int temp=stack.pop();
                maxS= Math.max(maxS,( ( stack.isEmpty()?i:(i-stack.peek()-1) )*heights[temp] ));
            }
            stack.push(i); //��ջ
        }
        return maxS;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int i = largestRectangleArea(arr);
        System.out.println(i);
    }

}
