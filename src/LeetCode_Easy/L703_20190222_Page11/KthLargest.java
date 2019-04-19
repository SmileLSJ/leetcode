package LeetCode_Easy.L703_20190222_Page11;

import java.lang.reflect.Array;
import java.util.*;

/**
 ���һ���ҵ��������е�K��Ԫ�ص��ࣨclass����ע���������ĵ�K��Ԫ�أ����ǵ�K����ͬ��Ԫ�ء�

 ��� KthLargest ����Ҫһ��ͬʱ�������� k ����������nums �Ĺ��������������������еĳ�ʼԪ�ء�
 ÿ�ε��� KthLargest.add�����ص�ǰ�������е�K���Ԫ�ء�

 ʾ��:

 int k = 3;
 int[] arr = [4,5,8,2];
 KthLargest kthLargest = new KthLargest(3, arr);
 kthLargest.add(3);   // returns 4
 kthLargest.add(5);   // returns 5
 kthLargest.add(10);  // returns 5
 kthLargest.add(9);   // returns 8
 kthLargest.add(4);   // returns 8
 ˵��:
 ����Լ��� nums �ĳ��ȡ� k-1 ��k �� 1��
 */

//���ȶ��У�Ĭ��ʹ�õ���С����
public class KthLargest {

    final PriorityQueue<Integer> queue;

    final int K;


    public KthLargest(int k, int[] nums) {
        K=k;
        queue =  new PriorityQueue<>();
        for (int i=0;i<nums.length;i++){
            add(nums[i]);
        }
    }

    public int add(int val) {
        if(queue.size()<K){
            queue.offer(val);
        }else{
            if(queue.peek()<val){
                queue.poll();
                queue.offer(val);
            }
        }

        return queue.peek();
    }
}
