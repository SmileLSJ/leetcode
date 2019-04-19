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
public class MyQueue {

    private Stack<Integer> head;

    /** Initialize your data structure here. */
    public MyQueue() {
        head = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        head.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (head.isEmpty()) return -1;
        Stack<Integer> tmp = new Stack<>();
        while(!head.isEmpty()){
            tmp.push(head.pop());
        }

        Integer result = tmp.pop();
        while(!tmp.isEmpty()){
            head.push(tmp.pop());
        }
        return result;
    }

    /** Get the front element. */
    public int peek() {
        if (head.isEmpty()) return -1;
        Stack<Integer> tmp = new Stack<>();
        while(!head.isEmpty()){
            tmp.push(head.pop());
        }

        Integer result = tmp.pop();
        head.push(result);
        while(!tmp.isEmpty()){
            head.push(tmp.pop());
        }
        return result;

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return head.isEmpty();
    }
}
