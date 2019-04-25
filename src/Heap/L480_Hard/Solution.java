package Heap.L480_Hard;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 中位数是有序序列最中间的那个数。如果序列的大小是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。

 例如：

 [2,3,4]，中位数是 3

 [2,3]，中位数是 (2 + 3) / 2 = 2.5

 给出一个数组 nums，有一个大小为 k 的窗口从最左端滑动到最右端。
 窗口中有 k 个数，每次窗口移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。

 例如：

 给出 nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。

 窗口位置                      中位数
 ---------------               -----
 [1  3  -1] -3  5  3  6  7       1
 1 [3  -1  -3] 5  3  6  7       -1
 1  3 [-1  -3  5] 3  6  7       -1
 1  3  -1 [-3  5  3] 6  7       3
 1  3  -1  -3 [5  3  6] 7       5
 1  3  -1  -3  5 [3  6  7]      6
 */
public class Solution {


    PriorityQueue<Double> maxHeap = new PriorityQueue<>(new Comparator<Double>() {
        @Override
        public int compare(Double o1, Double o2) {
            return (o2-o1>0)?1:0;
        }
    });
    PriorityQueue<Double> mixHeap = new PriorityQueue<>();

    public double[] medianSlidingWindow(Double[] nums, int k) {
        double[] result = new double[nums.length-k+1];

        for(int i=0;i<nums.length;i++){
            double item = add(nums[i]);
            if(i>=k-1){
                result[i-k+1]=item;
            }
        }
        return result;
    }

    public double add(Double num){

        if(maxHeap.isEmpty()){
            maxHeap.add(num);
            return num;
        }

        if(maxHeap.peek()<num){
            mixHeap.offer(num);
        }else{
            mixHeap.offer(num);
        }

        if(maxHeap.size()-mixHeap.size()>1){

        }




        return 0;
    }

    public static void main(String[] args) {
        System.out.println(3/2);
        System.out.println(3-3/2);
    }
}
