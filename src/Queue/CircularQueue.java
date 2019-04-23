package Queue;

/**
 * Created by Gxy on 2019/4/22.
 */
public class CircularQueue {

    // 数组：items，数组大小：n
    private String[] items;
    private int n = 0;
    // head 表示队头下标，tail 表示队尾下标
    private int head = 0;
    private int tail = 0;

    // 申请一个大小为 capacity 的数组
    public CircularQueue(int capacity) {
        items = new String[capacity];
        n = capacity;
    }

    // 入队，栈尾入队
    public boolean enqueue(String item) {
        // 队列满了
        if ((tail + 1) % n == head) return false;
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    // 出队，栈顶出队，没必须进行赋值为空操作，当指针越过时，表示已经是没用的数据
    // 但是如果是对象的话，没有及时清理，容易造成OOM
    public String dequeue() {
        // 如果 head == tail 表示队列为空
        if (head == tail) return null;
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        System.out.println(circularQueue.enqueue("1"));
        System.out.println(circularQueue.enqueue("2"));
        System.out.println(circularQueue.enqueue("3"));
    }
}
