package LeetCode_Easy.L1_20190305;

import java.util.HashMap;
import java.util.HashSet;

/**
 ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ

 ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�

 ʾ��:

 ���� nums = [2, 7, 11, 15], target = 9

 ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
 ���Է��� [0, 1]

 */
public class OtherSolution {


    public static int[] sum(int[] nums , int target){
        int[] index = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                index[0]=i;
                index[1]=map.get(complement);
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,3};

        sum(arr,6);
    }
}
