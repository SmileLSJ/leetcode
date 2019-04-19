package Base.String.L344_Easy;

/**
 ��дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� char[] ����ʽ������
 ��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣
 ����Լ��������е������ַ����� ASCII ����еĿɴ�ӡ�ַ���

 ʾ�� 1��
 ���룺["h","e","l","l","o"]
 �����["o","l","l","e","h"]

 ʾ�� 2��
 ���룺["H","a","n","n","a","h"]
 �����["h","a","n","n","a","H"]
 */
public class Solution {

    public void reverseString(char[] s) {
        int start = 0;
        int end =s.length-1;

        while(end>start){

            char tmp = s[start];
            s[start++]=s[end];
            s[end--]= tmp;
        }
    }


}
