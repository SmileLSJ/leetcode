package Sort;

/**
 * 相当于保存中间值，数组中为中间值的位置相当于空，用于进行数组排序过程中挪动其他位置的数值
 */
public class FastSort {

    private static int[]  nums = {2,0,2,1,1,0};

    //实质就是找到无效位置，
    //     如果无效位置是在中间值的左边，就用右边中小于中间值的数值填充
    //     如果无效位置是在中间值的右边，就用左边中大于中间值的数值填充
    private static void sort(int[] nums,int begin,int end){

        System.out.println("begin:"+begin+",end:"+end);

        if(begin<end) {

            int middle = nums[begin];

            int i = begin;
            int j = end;

            while (i < j) {

                //右边是大于中间值的，当大于或者等于时，就向左移动
                while (i < j && middle <= nums[j]) {
                    j--;
                }

                //当右边存在小于中间值的，就将右边的值，放在中间值的地方，即一开始begin的地方
                //这样begin和j的地方都相等，那必然存在无效的位置，即j的位置的值实质是无效的，
                //因为放到i的位置，所以必须在j的左边找到比中间的值大的地方来填充这个无效位置，
                if (i < j) {
                    nums[i++] = nums[j];
                }

                //左边是保存小于中间值的地方，当小于或等于时，就向右移动
                while (i < j && middle >= nums[i]) {
                    i++;
                }

                //当左边存在大于中间值的，就将左边的值即i的值，放到之前无效的位置，即j的位置，
                //因为i的值和j的值相等，实质是i的值放到了j的地方，所以i的位置是无效的，这样
                //数组中无效的位置就转移到i的位置
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }

            //最后将中间值，放到无效的位置的地方
            nums[i] = middle;

            sort(nums, begin, i);
            sort(nums,i+1,end);
        }
    }

    public static void main(String[] args) {

        print(nums);
        sort(nums,0,nums.length-1);
        print(nums);
    }

    private static void print(int[] _nums){
        for (int i:_nums ) {
            System.out.printf(i+",");
        }
    }

}
