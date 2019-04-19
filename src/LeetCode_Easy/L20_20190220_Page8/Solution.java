package LeetCode_Easy.L20_20190220_Page8;

import java.util.HashMap;

/**
 ����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��

 ��Ч�ַ��������㣺

 �����ű�������ͬ���͵������űպϡ�
 �����ű�������ȷ��˳��պϡ�
 ע����ַ����ɱ���Ϊ����Ч�ַ�����

 ʾ�� 1:

 ����: "()"
 ���: true
 ʾ�� 2:

 ����: "()[]{}"
 ���: true

 ����: "([)]"
 ���: false

 ʾ�� 5:

 ����: "{[]}"
 ���: true
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
