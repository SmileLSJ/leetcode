package Heap.L295_Hard;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。

 例如，

 [2,3,4] 的中位数是 3

 [2,3] 的中位数是 (2 + 3) / 2 = 2.5

 设计一个支持以下两种操作的数据结构：

 void addNum(int num) - 从数据流中添加一个整数到数据结构中。
 double findMedian() - 返回目前所有元素的中位数。
 示例：

 addNum(1)
 addNum(2)
 findMedian() -> 1.5
 addNum(3)
 findMedian() -> 2
 ["MedianFinder","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian",
 "addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian"]
 [[],[40],[],[12],[],[16],[],

 [14],[],[35],[],[19],[],[34],
 [],[35],[],[28],[],[35],[],[26],[],[6],[],[8],[],[2],[],
 [14],[],[25],[],[25],[],[4],[],[33],[],[18],[],[10],[],[14],[],[27],[],[3],[],[35],[],[13],[],[24],[],[27],[],[14],[],[5],[],[0],[],[38],[],[19],[],[25],[],[11],[],[14],[],[31],[],[30],[],[11],[],[31],[],[0],[]]

 */
class MedianFinder {

    private float pecent = 0.5f;

    //左
    private PriorityQueue<Float> maxHeap = new PriorityQueue<>(new Comparator<Float>() {
        @Override
        public int compare(Float o1, Float o2) {
            return (int) (o2-o1);
        }
    });
    //右
    private PriorityQueue<Float> minHeap = new PriorityQueue<>();

    /** initialize your data structure here. */
    public MedianFinder() {

    }


    public void addNum(float num) {

        if(maxHeap.size()==0) {
            maxHeap.add(num);
            return;
        }

        if(maxHeap.peek()>=num){
            if(maxHeap.size()==minHeap.size()+1){
                Float item = maxHeap.poll();
                minHeap.add(item);
            }
            maxHeap.add(num);
        }else{
            if(maxHeap.size()==minHeap.size()){
                Float item = minHeap.poll();
                maxHeap.add(item);
            }
            minHeap.add(num);
        }

    }

    //奇数取左，偶数取两个值和/2
    public Float findMedian() {
        return (maxHeap.size()==minHeap.size())?(maxHeap.peek()+minHeap.peek())/2:maxHeap.peek();
    }

    public static void main(String[] args) {
        MedianFinder m =new MedianFinder();
        m.addNum(1);
        m.addNum(2);
        System.out.println(m.findMedian());
        m.addNum(3);
        System.out.println(m.findMedian());
    }
}
