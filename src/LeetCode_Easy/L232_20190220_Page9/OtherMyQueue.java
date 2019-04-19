package LeetCode_Easy.L232_20190220_Page9;

import java.util.Stack;

/**
 ʹ��ջʵ�ֶ��е����в�����

 push(x) -- ��һ��Ԫ�ط�����е�β����
 pop() -- �Ӷ����ײ��Ƴ�Ԫ�ء�
 peek() -- ���ض����ײ���Ԫ�ء�
 empty() -- ���ض����Ƿ�Ϊ�ա�
 ʾ��:

 MyQueue queue = new MyQueue();

 queue.push(1);
 queue.push(2);
 queue.peek();  // ���� 1
 queue.pop();   // ���� 1
 queue.empty(); // ���� false
 ˵��:

 ��ֻ��ʹ�ñ�׼��ջ���� -- Ҳ����ֻ�� push to top, peek/pop from top, size, �� is empty �����ǺϷ��ġ�
 ����ʹ�õ�����Ҳ��֧��ջ�������ʹ�� list ���� deque��˫�˶��У���ģ��һ��ջ��ֻҪ�Ǳ�׼��ջ�������ɡ�
 �������в���������Ч�� �����磬һ���յĶ��в������ pop ���� peek ��������


 ʹ�ø���������Ч������ʵ�ֶ��е�Ч��
 */
public class OtherMyQueue {

    //��������У��ͼ����ջ��
    private Stack<Integer> inStack;

    //��������У���ȫ���Ƶ���ջ��
    private Stack<Integer> outStack;

    /** Initialize your data structure here. */
    public OtherMyQueue() {

        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {

        if(!outStack.isEmpty()) return outStack.pop();

        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
        return outStack.pop();

    }

    /** Get the front element. */
    public int peek() {

        if(!outStack.isEmpty()) return outStack.peek();

        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
