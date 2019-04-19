package LeetCode_Easy.L711;

/**
 * Created by Gxy on 2019/2/19.
 */
class Solution {
    public int numJewelsInStones(String J, String S) {

        char[] chars = J.toCharArray();

        char[] chars1 = S.toCharArray();

        int count = 0;

        for (int i=0;i<chars.length;i++){

            for(int j=0;j<chars1.length;j++){

                if(chars1[j]==chars[i]){
                    count++;
                }
            }
        }

        return count;
    }
}