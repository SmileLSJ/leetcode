package Stack.L921_Middle;

import java.util.Stack;

/**
 ����һ���� '(' �� ')' ������ɵ��ַ��� S��������Ҫ������ٵ����ţ� '(' ���� ')'���������κ�λ�ã�����ʹ�õ��������ַ�����Ч��

 ����ʽ�Ͻ���ֻ���������漸��֮һ�������ַ���������Ч�ģ�

 ����һ�����ַ���������
 �����Ա�д�� AB ��A �� B ���ӣ�, ���� A �� B ������Ч�ַ���������
 �����Ա�д�� (A)������ A ����Ч�ַ�����
 ����һ�������ַ���������Ϊʹ����ַ�����Ч��������ӵ�������������



 ʾ�� 1��

 ���룺"())"
 �����1
 ʾ�� 2��

 ���룺"((("
 �����3
 ʾ�� 3��

 ���룺"()"
 �����0
 ʾ�� 4��

 ���룺"()))(("
 �����4


 ��ʾ��

 S.length <= 1000
 S ֻ���� '(' �� ')' �ַ���

 */
public class Solution {

    public int minAddToMakeValid(String S) {
        char[] c = {'(',')'};

        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<chars.length;i++){
            if(stack.size()==0){
                stack.push(chars[i]);
            }else {
                if(stack.peek()==c[0]&&chars[i]==c[1]){
                    stack.pop();
                }else {
                    stack.push(chars[i]);
                }
            }
        }
        return stack.size();
    }
}
