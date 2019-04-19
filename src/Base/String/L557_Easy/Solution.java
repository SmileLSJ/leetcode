package Base.String.L557_Easy;

/**
 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 示例 1:
 输入: "Let's take LeetCode contest"
 输出: "s'teL ekat edoCteeL tsetnoc"

 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class Solution {

    public static String reverseWords(String s) {

        int start = 0;
        int end = 0;

        char[] chars = s.toCharArray();

        for(int i=0;i<chars.length;i++){
            if(chars[i]==' ' || i==chars.length-1){
                while(end-1>start){
                    char tmp = chars[start];
                    chars[start++] = chars [end-1];
                    chars[end---1] = tmp;
                }
                start=i;
                end= i+1;
            }else {
                if(chars[start]==' ')start=i;

                //为了避免最后没有空格，不进行解析最后的字符串
                if(i==chars.length-2) end = chars.length-1;
                end++;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
    }
}
