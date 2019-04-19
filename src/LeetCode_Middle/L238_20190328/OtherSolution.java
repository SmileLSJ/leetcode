package LeetCode_Middle.L238_20190328;

/**
 * Created by Gxy on 2019/3/28.
 */
public class OtherSolution {

    public static int[] getResult(int[] nums){
        int[] result = new int[nums.length];
        System.arraycopy(nums,0,result,0,nums.length);


        result[0]=1;
        for (int i=1;i<nums.length;i++){
            result[i]=result[i-1]*nums[i-1];
        }

        //用于记录右边的乘积
        int tmp = nums[nums.length-1];
        for (int i=nums.length-2;i>=0;i--){
            result[i]=tmp*result[i];
            tmp *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] i= {1,2,3,4};
        int[] j =i;
        getResult(i);
    }
}
