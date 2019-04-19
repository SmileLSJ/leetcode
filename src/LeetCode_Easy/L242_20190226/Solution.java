package LeetCode_Easy.L242_20190226;

/**
 ���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ��һ����ĸ��λ�ʡ�

 ʾ�� 1:

 ����: s = "anagram", t = "nagaram"
 ���: true
 ʾ�� 2:

 ����: s = "rat", t = "car"
 ���: false
 ˵��:
 ����Լ����ַ���ֻ����Сд��ĸ��

 ����:
 ��������ַ������� unicode �ַ���ô�죿���ܷ������Ľⷨ��Ӧ�����������
 */
public class Solution {

    public static boolean judge(String s,String t){

        if((s==null||t==null)||(s.length()!=t.length())) return false;


        while(s.length()!=0) {
            boolean f1 = s.substring(0, s.length() / 2).equals(t.substring(0, t.length() / 2));
            boolean f2 = s.substring(s.length() / 2).equals(t.substring(t.length() / 2));

            if (!(f1 ^ f2)) return false;

            if (!f1) {
                if(s.length()==1) return true;
                t = t.substring(0, t.length() / 2);
                s = s.substring(0, s.length() / 2);

            } else {
                if(s.length()==1) return true;
                s = s.substring(s.length() / 2);
                t = t.substring(t.length() / 2);
            }
        }

        return false;

    }


    public static void main(String[] args) {
        boolean f1 = false;
        boolean f2 = false;

        System.out.println(f2^f1);

        String s = "aaat";
        String t = "aat";

        System.out.println(judge(s,t));

    }

}
