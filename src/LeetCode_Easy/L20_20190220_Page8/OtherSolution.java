package LeetCode_Easy.L20_20190220_Page8;

import java.util.HashMap;

/**
 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

 有效字符串需满足：

 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。

 示例 1:

 输入: "()"
 输出: true
 示例 2:

 输入: "()[]{}"
 输出: true

 输入: "([)]"
 输出: false

 示例 5:

 输入: "{[]}"
 输出: true
 */

//时间复杂度为   n*n/2
public class OtherSolution {
    public static boolean isValid(String s) {

        int len;
        do{
            len=s.length();
            //replace方法 的时间复杂度就是O(n),下面相当于O(n)+O(n)+O(n)
            s = s.replace("()","").replace("{}","").replace("[]","");
        }while (s.length()!=len);

        return (len==0);

    }

    public static void main(String[] args) {
        String s = "{}[]()";
//        String s = "([)]";
        boolean valid = isValid(s);
        System.out.println(valid);

    }
}
