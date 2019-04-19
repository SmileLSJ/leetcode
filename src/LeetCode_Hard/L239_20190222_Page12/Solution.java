package LeetCode_Hard.L239_20190222_Page12;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 ����һ������ nums����һ����СΪ k �Ļ������ڴ������������ƶ�����������Ҳࡣ
 ��ֻ���Կ����ڻ������� k �ڵ����֡���������ÿ��ֻ�����ƶ�һλ��

 ���ػ����������ֵ��

 ʾ��:

 ����: nums = [1,3,-1,-3,5,3,6,7], �� k = 3
 ���: [3,3,5,5,6,7]
 ����:

 �������ڵ�λ��                ���ֵ
 ---------------               -----
 [1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 ע�⣺

 ����Լ��� k ������Ч�ģ�1 �� k �� ��������Ĵ�С�����������鲻Ϊ�ա�
 */
public class Solution {


    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length <= 0) {
            return new int[0];
        }

        int[] result = new int[nums.length-k+1];

        final PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });


        for(int i=0;i<nums.length;i++){
            int tmp=add(nums,i,k,queue);
            if(i>=k-1){
                result[i-k+1]=tmp;
            }
        }

        return result;
    }

    private int add(int[] nums, int i, int k, PriorityQueue<Integer> queue) {
        if(i<k){
            queue.offer(nums[i]);
        }else{
            queue.remove(nums[i-k]);
            queue.offer(nums[i]);
        }

        return queue.peek();
    }


    public static void main(String[] args) {
        int num[] = new int[]{1,3,-1,-3,5,3,6,7};
        int k=3;
    }
}
