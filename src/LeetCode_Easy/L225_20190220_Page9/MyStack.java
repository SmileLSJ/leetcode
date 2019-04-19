package LeetCode_Easy.L225_20190220_Page9;

import java.util.ArrayDeque;
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
public class MyStack {
    /** Initialize your data structure here. */

    Queue<Integer> de;
    Queue<Integer> out;

    public MyStack() {
        de = new ArrayDeque<>();
        out =  new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        de.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {

        int result = -1;
        int len;

        if (!de.isEmpty()){
            int count = 0;
            len = de.size();
            while(count<len-1){
                out.add(de.poll());
                count++;
            }
            result=de.poll();
        }
        else if(!out.isEmpty()){
            int count = 0;

            Queue<Integer> tmp = new ArrayDeque<>();
            len = out.size();
            while(count<len-1){
                tmp.add(out.poll());
                count++;
            }
            result=out.poll();
            out = tmp;
        }

        return result;
    }

    /** Get the top element. */
    public int top() {
        int result = -1;
        int len ;

        if (!de.isEmpty()){
            int count = 0;
            len = de.size();
            while(count<len-1){
                out.add(de.poll());
                count++;
            }
            result=de.poll();
            out.add(result);
        }
        else if(!out.isEmpty()){

            Queue<Integer> tmp = new ArrayDeque<>();

            int count = 0;
            len = out.size();
            while(count<len-1){
                tmp.add(out.poll());
                count++;
            }
            result=out.poll();
            tmp.add(result);
            out = tmp;
        }
        return result;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return (out.size()==0 && de.size()==0);
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        int param_3 = obj.top();
//        int param_2 = obj.pop();

        boolean param_4 = obj.empty();
    }
}
