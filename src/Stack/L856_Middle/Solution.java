package Stack.L856_Middle;

import java.util.Stack;

/**
 ����һ��ƽ�������ַ��� S�����������������ַ����ķ�����

 () �� 1 �֡�
 AB �� A + B �֣����� A �� B ��ƽ�������ַ�����
 (A) �� 2 * A �֣����� A ��ƽ�������ַ�����


 ʾ�� 1��

 ���룺 "()"
 ����� 1
 ʾ�� 2��

 ���룺 "(())"
 ����� 2
 ʾ�� 3��

 ���룺 "()()"
 ����� 2
 ʾ�� 4��

 ���룺 "(()(()))"
 ����� 6


 ��ʾ��

 S ��ƽ�������ַ�������ֻ���� ( �� ) ��
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
                //����ֵ
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
