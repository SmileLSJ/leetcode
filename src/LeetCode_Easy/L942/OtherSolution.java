package LeetCode_Easy.L942;

/**
 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。

 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：

 如果 S[i] == "I"，那么 A[i] < A[i+1]
 如果 S[i] == "D"，那么 A[i] > A[i+1]

 示例 1：

 输出："IDID"
 输出：[0,4,1,3,2]
 示例 2：

 输出："III"
 输出：[0,1,2,3]

 示例 3：

 输出："DDI"
 输出：[3,2,0,1]

 */
public class OtherSolution {

    public static int[] diStringMatch(String S) {

        int[] result;
        int length = S.length();
        result = new int[length+1];

        int startNum = 0;
        int endNum = length;

        for (int i=0;i<length+1;i++) {

            if(i==length){
                result[i]=endNum;
                continue;
            }

            if((S.charAt(i))=='I'){
                result[i]=startNum++;
            }else{
                result[i]=endNum--;
            }
        }

        result[length]=endNum;
        return result;
    }


    public static void main(String[] args) {
        String s = "IDID";
        int arr[] = diStringMatch(s);
        System.out.println(arr);
    }
}
