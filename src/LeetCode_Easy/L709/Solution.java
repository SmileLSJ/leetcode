package LeetCode_Easy.L709;

/**
 ʵ�ֺ��� ToLowerCase()���ú�������һ���ַ������� str���������ַ����еĴ�д��ĸת����Сд��ĸ��֮�󷵻��µ��ַ�����

 ʾ�� 1��

 ����: "Hello"
 ���: "hello"
 ʾ�� 2��

 ����: "here"
 ���: "here"
 ʾ�� 3��

 ����: "LOVELY"
 ���: "lovely"
 */
public class Solution {

    public String toLowerCase(String str) {

        String result = null;

        char[] chars = str.toCharArray();

        for (int i=0;i<chars.length;i++){
            if((int)chars[i]<97 && (int)chars[i]>=65){
                chars[i] = (char) ((int)chars[i]+32);
            }
        }

        return new String(chars);

    }

    public static void main(String[] args) {
        System.out.println((int)'A');
        System.out.println('a');

    }

}
