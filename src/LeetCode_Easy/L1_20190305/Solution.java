package LeetCode_Easy.L1_20190305;

/**
 ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ

 ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�

 ʾ��:

 ���� nums = [2, 7, 11, 15], target = 9

 ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
 ���Է��� [0, 1]

 */
public class Solution {


    public int[] sum(int[] nums , int target){

        int[] index = new int[2];

        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    index[0]=i;
                    index[1]=j;
                }
            }
        }

        return index;
    }
}
