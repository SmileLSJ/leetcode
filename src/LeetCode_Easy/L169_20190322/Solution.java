package LeetCode_Easy.L169_20190322;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
     给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ? n/2 ? 的元素。

     你可以假设数组是非空的，并且给定的数组总是存在众数。

     示例 1:

     输入: [3,2,3]
     输出: 3
     示例 2:

     输入: [2,2,1,1,1,2,2]
     输出: 2
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
