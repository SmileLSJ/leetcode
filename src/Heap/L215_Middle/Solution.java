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
public class Solution {

    @Test
    public void main() {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr,4));
    }


    public int findKthLargest(int[] nums, int k) {

        for(int i=0;i<k-1;i++){
            sort(nums,0);
            nums[0]=Integer.MIN_VALUE;
        }
        sort(nums,0);

        return nums[0];
    }

    public void sort(int[] nums,int index){

        if(index>nums.length-1) return;

        int leftIndex = index*2+1;
        int rightIndex = 2*index+2;

        sort(nums,leftIndex);
        sort(nums,rightIndex);

        //左边
        if(leftIndex<nums.length){
            if(nums[leftIndex]>nums[index]){
                int tmp = nums[index];
                nums[index]=nums[leftIndex];
                nums[leftIndex]=tmp;
            }
        }

        //右边
        if(rightIndex< nums.length){
            if(nums[rightIndex]>nums[index]){
                int tmp = nums[index];
                nums[index]=nums[rightIndex];
                nums[rightIndex]=tmp;
            }
        }
    }

}
