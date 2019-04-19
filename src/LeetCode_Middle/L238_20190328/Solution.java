package LeetCode_Middle.L238_20190328;

import java.util.Arrays;

/**
 * Created by Gxy on 2019/3/28.
 */
public class Solution {


    public static int[] getResult(int[] nums){
        int[] result = new int[nums.length];
        System.arraycopy(nums,0,result,0,nums.length);
        //记录后面的
        int[] tmp =new int[nums.length];
        System.arraycopy(nums,0,result,0,tmp.length);
        tmp[nums.length-1]=1;
        for (int j=nums.length-2;j>=0;j--){
            tmp[j]=tmp[j+1]*nums[j+1];
        }

        for(int j=0;j<nums.length;j++){
            if(j==0){
                result[j]=1;
            }else {
                result[j] = result[j - 1] * nums[j - 1];
            }
        }

        for (int j =0;j<nums.length;j++){
            result[j]*=tmp[j];
        }

        return result;
    }

    public static void main(String[] args) {
         int[] i= {9,0,-2};
         int[] j =i;
        getResult(i);
    }
}
