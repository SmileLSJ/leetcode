package Heap.L215_Middle;


import org.junit.Test;

/**
 在未排序的数组中找到第 k 个最大的元素。请注意，
 你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

 示例 1:

 输入: [3,2,1,5,6,4] 和 k = 2
 输出: 5
 示例 2:

 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 输出: 4
 说明:

 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。

 使用大顶堆
 */
public class MinHeapSolution {

    public static void main(String[] args) {

        int[] arr = {3,2,1,5,6,4};
        MinHeapSolution minHeapSolution = new MinHeapSolution();
        System.out.println(minHeapSolution.findKthLargest(arr,2));
    }


    public int findKthLargest(int[] nums, int k) {

        //第一个为空，从第二个开始，下标为1
        int[] heap = new int[k+1];

        for (int i=0;i<k;i++){
            heap[i+1]=nums[i];
        }

        //初始化
        //必须从下到上，进行堆化，这样才能保证堆中结构正确
        for(int i = k/2;i>0;i--){
            sort(heap,i);
        }

        //在已经排好序的堆中，插入一个新值，然后从上到下进行堆化
        for(int i = k; i < nums.length; i++){
            if(nums[i] > heap[1]){
                heap[1] = nums[i];
                sort(heap,1);
            }
        }
        return heap[1];
    }


    //最小堆
    //index 表示非叶子节点，
    //从上到下堆化
    public void sort(int[] heap,int index){

        while(true){
            int minIndex = index;

            //左节点：序号肯定在小顶堆中，且小于
            if(2*index<heap.length&&heap[2*index]<heap[minIndex]){
                minIndex = 2*index;
            }

            //右节点：序号肯定在小顶堆中，且小于
            if(2*index+1<heap.length&&heap[2*index+1]<heap[minIndex]){
                minIndex = 2*index+1;
            }

            //如果没有修改，说明当前是小顶堆
            if(minIndex==index){
                break;
            }

            //交换
            int tmp = heap[index];
            heap[index]=heap[minIndex];
            heap[minIndex] = tmp;

            index = minIndex;
        }
    }
}
