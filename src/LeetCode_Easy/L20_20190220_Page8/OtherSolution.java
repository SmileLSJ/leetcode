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

//ʱ�临�Ӷ�Ϊ   n*n/2
public class OtherSolution {
    public static boolean isValid(String s) {

        int len;
        do{
            len=s.length();
            //replace���� ��ʱ�临�ӶȾ���O(n),�����൱��O(n)+O(n)+O(n)
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
