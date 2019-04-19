package LeetCode_Middle.L75_20190320;

/**
 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

 注意:
 不能使用代码库中的排序函数来解决这道题。

 示例:

 输入: [2,0,2,1,1,0]
 输出: [0,0,1,1,2,2]
 进阶：

 一个直观的解决方案是使用计数排序的两趟扫描算法。
 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 你能想出一个仅使用常数空间的一趟扫描算法吗？
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
