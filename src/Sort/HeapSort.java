package Sort;

/**
 * Created by Gxy on 2019/4/25.
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {3,2,4,6,4,6,5,3};
        sort(arr);
    }


    public static void sort(int[] nums){

        buildHeap(nums);
        //倒叙进行替换
        int k = nums.length-1;
        while(k>0){
            swap(nums,k,0);
            k--;
            //大顶堆的情况下，再比较时，只需要从上倒下依次比较就好
            heapify(nums,k+1,0);
        }
    }


    //初始化堆
    public static void buildHeap(int[] nums){
        for(int i=nums.length/2-1;i>=0;i--){
            heapify(nums,nums.length,i);
        }
    }

    // 2  3 4 5 6 2
    /**
     * 大顶堆
     * @param len 数组的长度，而不是下标
     * @param i 当前的节点  数组下标，从0开始
     */
    public static void heapify(int[] nums,int len,int i){
        while(true){
            int maxIndex = i;

            //下标小于
            if(2*i+1<len && nums[2*i+1]>nums[maxIndex]) maxIndex = 2*i+1;
            if(2*i+2<len && nums[2*i+2]>nums[maxIndex]) maxIndex = 2*i+2;

            if(maxIndex==i) break;
            swap(nums,i,maxIndex);
            i = maxIndex;
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
