package Base.String.L557_Easy;

/**
 ����һ���ַ���������Ҫ��ת�ַ�����ÿ�����ʵ��ַ�˳��ͬʱ�Ա����ո�͵��ʵĳ�ʼ˳��
 ʾ�� 1:
 ����: "Let's take LeetCode contest"
 ���: "s'teL ekat edoCteeL tsetnoc"

 ע�⣺���ַ����У�ÿ�������ɵ����ո�ָ��������ַ����в������κζ���Ŀո�
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

                //Ϊ�˱������û�пո񣬲����н��������ַ���
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
