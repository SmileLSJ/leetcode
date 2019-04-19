package LeetCode_Easy.L169_20190322;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
     ����һ����СΪ n �����飬�ҵ����е�������������ָ�������г��ִ������� ? n/2 ? ��Ԫ�ء�

     ����Լ��������Ƿǿյģ����Ҹ������������Ǵ���������

     ʾ�� 1:

     ����: [3,2,3]
     ���: 3
     ʾ�� 2:

     ����: [2,2,1,1,1,2,2]
     ���: 2
 */
class Solution {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        Arrays.stream(nums).forEach((i-> System.out.print(nums[i]+",")));
        System.out.println("");
        System.out.println(majorityElement(nums));
        Arrays.stream(nums).forEach((i-> System.out.print(nums[i]+",")));
    }

    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> m = new HashMap<>();

        for (int i :
                nums) {
            if (m.containsKey(i)) {
                m.put(i,(m.get(i)+1));
            } else {
                m.put(i, 1);
            }
        }

        Set<Integer> integers = m.keySet();
        for (Integer j :
                integers) {
            if(m.get(j)>(nums.length/2)){
                return j;
            }
        }
        return  -1;
    }
}
