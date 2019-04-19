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
public class Solution {

    public static int[] diStringMatch(String S) {

        int[] result;
        int length = S.length();
        result = new int[length+1];

        int startNum = 0;
        int endNum = length;

        String strI =  S;

        while (strI.contains("I")){
            int i = strI.indexOf("I");
            strI = strI.substring(0,strI.indexOf("I"))+"-"+strI.substring(strI.indexOf("I")+1);
            result[i]=startNum;
            startNum++;
        }

        while (strI.contains("D")){
            int i = strI.indexOf("D");
            strI = strI.substring(0,strI.indexOf("D"))+"-"+strI.substring(strI.indexOf("D")+1);
            result[i]=endNum;
            endNum--;
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
