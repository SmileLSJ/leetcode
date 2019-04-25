package Heap.L295_Hard;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Gxy on 2019/4/25.
 */
public class OtherSolution {
    private Queue<Integer> maxHeap;// 大顶堆
    private Queue<Integer> minHeap;// 小顶堆

    /**
     * initialize your data structure here.
     */
    public OtherSolution() {
        maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty()) {
            maxHeap.offer(num);
            return;
        }
        if (num > maxHeap.peek()) {// 比大顶堆堆顶元素大，进入对面的小顶堆
            minHeap.offer(num);
        } else {// 比大顶堆堆顶元素小，进入大顶堆
            maxHeap.offer(num);
        }
        if (maxHeap.size() - minHeap.size() > 1) {
            minHeap.offer(maxHeap.poll());
        } else if (maxHeap.size() - minHeap.size() < -1) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        int maxSize = maxHeap.size();
        int minSize = minHeap.size();
        if(maxSize == minSize) {
            if(maxSize==0){
                return 0;
            }
            return (maxHeap.peek()+minHeap.peek())/(double)2;
        }
        if(maxSize > minSize) {
            return maxHeap.peek();
        }
        return minHeap.peek();
    }
}
