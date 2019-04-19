package LeetCode_Easy.L232_20190220_Page9;

import java.util.Stack;

/**
 使用栈实现队列的下列操作：

 push(x) -- 将一个元素放入队列的尾部。
 pop() -- 从队列首部移除元素。
 peek() -- 返回队列首部的元素。
 empty() -- 返回队列是否为空。
 示例:

 MyQueue queue = new MyQueue();

 queue.push(1);
 queue.push(2);
 queue.peek();  // 返回 1
 queue.pop();   // 返回 1
 queue.empty(); // 返回 false
 说明:

 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。


 使用付付得正的效果，来实现队列的效果
 */
public class OtherMyQueue {

    //如果进队列，就加入该栈中
    private Stack<Integer> inStack;

    //如果出队列，就全部移到该栈中
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
