package LeetCode_Easy.L225_20190220_Page9;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 使用队列实现栈的下列操作：

 push(x) -- 元素 x 入栈
 pop() -- 移除栈顶元素
 top() -- 获取栈顶元素
 empty() -- 返回栈是否为空
 注意:

 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
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
