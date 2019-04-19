package LeetCode_Easy.L225_20190220_Page9;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 ʹ�ö���ʵ��ջ�����в�����

 push(x) -- Ԫ�� x ��ջ
 pop() -- �Ƴ�ջ��Ԫ��
 top() -- ��ȡջ��Ԫ��
 empty() -- ����ջ�Ƿ�Ϊ��
 ע��:

 ��ֻ��ʹ�ö��еĻ�������-- Ҳ���� push to back, peek/pop from front, size, �� is empty ��Щ�����ǺϷ��ġ�
 ����ʹ�õ�����Ҳ��֧�ֶ��С� �����ʹ�� list ���� deque��˫�˶��У���ģ��һ������ , ֻҪ�Ǳ�׼�Ķ��в������ɡ�
 ����Լ������в���������Ч�ģ�����, ��һ���յ�ջ������� pop ���� top ��������
 */
public class OtherMyStack {
    private Queue<Integer> data;

    public OtherMyStack() {
        data = new LinkedList<>();
    }

    public void push(int x) {
        data.offer(x);
        //��������ǰ���Ѿ������Ԫ�ط���xԪ�غ��棬ʹ����������
        for (int i = 0; i < data.size() - 1; i++) {
            data.offer(data.poll());
        }
    }

    public int pop() {
        return data.poll();
    }

    public int top() {
        return data.peek();
    }

    public boolean empty() {
        return data.isEmpty();
    }
}
