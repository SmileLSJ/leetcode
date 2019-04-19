package Stack.L856_Middle;

import java.util.Stack;

/**
 给定一个平衡括号字符串 S，按下述规则计算该字符串的分数：

 () 得 1 分。
 AB 得 A + B 分，其中 A 和 B 是平衡括号字符串。
 (A) 得 2 * A 分，其中 A 是平衡括号字符串。


 示例 1：

 输入： "()"
 输出： 1
 示例 2：

 输入： "(())"
 输出： 2
 示例 3：

 输入： "()()"
 输出： 2
 示例 4：

 输入： "(()(()))"
 输出： 6


 提示：

 S 是平衡括号字符串，且只含有 ( 和 ) 。
 2 <= S.length <= 50
 */
public class Solution {

    public static int scoreOfParentheses(String S) {

        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        for(int i=0;i<chars.length;i++){
            //  (
            if(stack.isEmpty() || chars[i]=='('){
                stack.add(chars[i]);
                continue;
            }else{
                int count = 0;
                //具体值
                while(stack.peek()!='('){
                    Character pop = stack.pop();
                    count+=(int)pop;
                }
                stack.pop();
                stack.push(count==0?(char)1:(char)(2*count));
            }
        }
        while(!stack.isEmpty()){
            result +=(int)stack.pop();
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("(())"));
    }
}
