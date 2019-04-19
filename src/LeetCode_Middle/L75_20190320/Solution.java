package LeetCode_Middle.L75_20190320;

/**
 ����һ��������ɫ����ɫ����ɫ��һ�� n ��Ԫ�ص����飬ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�

 �����У�����ʹ������ 0�� 1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ��

 ע��:
 ����ʹ�ô�����е����������������⡣

 ʾ��:

 ����: [2,0,2,1,1,0]
 ���: [0,0,1,1,2,2]
 ���ף�

 һ��ֱ�۵Ľ��������ʹ�ü������������ɨ���㷨��
 ���ȣ����������0��1 �� 2 Ԫ�صĸ�����Ȼ����0��1��2��������д��ǰ���顣
 �������һ����ʹ�ó����ռ��һ��ɨ���㷨��
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        print(nums);
        System.out.println("");
        sortColors(nums);
        print(nums);
    }


    public static void sortColors(int[] nums) {

        sort(nums,0,nums.length-1);
    }

    private static void print(int[] _nums){
        for (int i:_nums ) {
            System.out.printf(i+",");
        }
    }

    private static void sort(int[] nums, int start, int end) {

        if (start < end) {
            int middle = nums[start];

            int i = start;
            int j = end;

            while (i < j) {
                while (i < j && middle <= nums[j]) {
                    j--;
                }

                if (i < j) {
                    nums[i++] = nums[j];
                }

                while (i < j && middle >= nums[i]) {
                    i++;
                }

                if (i < j) {
                    nums[j--] = nums[i];
                }
            }

            nums[i] = middle;
            sort(nums, start, i);
            sort(nums, i + 1, end);
        }
    }

}
