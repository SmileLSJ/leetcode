package Heap.L215_Middle;


import org.junit.Test;

/**
 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。

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
public class OtherSolution {

    @Test
    public void main() {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr,4));
    }


    public int findKthLargest(int[] nums, int k) {
        // 建一个大小为k+1(第一个结点不使用)的数组
        int[] heap = new int[k+1];
        for(int i = 0; i < k; i++){
            heap[i+1] = nums[i];
        }
        // 堆化。建立一个大小为k的小顶堆
        // 从最后一个非叶子结点自上往下开始进行堆化，该结点堆化完后就轮到前一个非叶子结点再自上往下进行堆化
        for(int i = k/2; i > 0; i--){
            heapify(heap,k+1,i);
        }

        // 继续遍历数组中剩余的数字，并与堆顶元素进行比较，
        // 若大于堆顶元素，则替换掉堆顶元素，并自顶向下堆化
        for(int i = k; i < nums.length; i++){
            if(nums[i] > heap[1]){
                heap[1] = nums[i];
                heapify(heap,k+1,1);
            }
        }
        return heap[1];
    }
    // 自顶向下堆化。一般在删除堆顶结点后，把最后一个结点放到堆顶的时候使用。
    // 即这时堆中已经是部分堆化
    private void heapify(int[] heap,int len,int index){
        while(true){
            // 找出当前结点和两个直接子结点的最小值
            int minPos = index;
            if(2*index < len && heap[2*index] < heap[minPos]){
                minPos = 2*index;
            }
            if(2*index+1 < len && heap[2*index+1] < heap[minPos]){
                minPos = 2*index + 1;
            }
            // 若当前结点是最小的，说明下面的是堆化好的了，直接退出循环
            if(minPos == index){
                break;
            }
            // 当前结点与最小值进行交换
            swap(heap,index,minPos);
            // 当前结点更改为最小直接子结点，继续往下堆化
            index = minPos;
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
