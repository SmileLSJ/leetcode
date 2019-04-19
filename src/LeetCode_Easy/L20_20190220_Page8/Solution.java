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
public class Solution {
    public static boolean isValid(String s) {

        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        char[] chars = s.toCharArray();

        int index = 0;
        char[] char2 = new char[s.length()];

        for (int i=0;i<chars.length;i++){
            if(index==0){
                char2[index]=chars[i];
                index++;
            }
            else{
                char c = char2[index - 1];
                char c1 = map.get(chars[i])==null?'0':map.get(chars[i]);

                if(c==c1){
                    index--;
                }
                else{
                    char2[index]=chars[i];
                    index++;
                }
            }
        }

        return (index==0);
    }

    public static void main(String[] args) {
//        String s = "{}[]()";
        /*String s = "([)]";
        boolean valid = isValid(s);
        System.out.println(valid);*/

        HashMap<Character,Character> map = new HashMap<>();
        char c1 = map.get(null);
    }
}
