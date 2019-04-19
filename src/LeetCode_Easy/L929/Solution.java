package LeetCode_Easy.L929;

import java.util.LinkedHashSet;

/**

 ÿ������ʼ�����һ���������ƺ�һ��������ɣ��� @ ���ŷָ���

 ���磬�� alice@leetcode.com�У� alice �Ǳ������ƣ��� leetcode.com ��������

 ����Сд��ĸ����Щ�����ʼ������ܰ��� ',' �� '+'��

 ����ڵ����ʼ���ַ�ı������Ʋ����е�ĳЩ�ַ�֮����Ӿ�㣨'.'��������������ʼ�����ת��������������û�е��ͬһ��ַ��
 ���磬"alice.z@leetcode.com�� �� ��alicez@leetcode.com�� ��ת����ͬһ�����ʼ���ַ�� ����ע�⣬�˹�����������������

 ����ڱ�����������ӼӺţ�'+'���������Ե�һ���Ӻź�����������ݡ����������ĳЩ�����ʼ������� m.y+name@email.com
 ��ת���� my@email.com�� ��ͬ�����˹�����������������

 ����ͬʱʹ������������

 ���������ʼ��б� emails�����ǻ����б��е�ÿ����ַ����һ������ʼ���ʵ���յ��ʼ��Ĳ�ͬ��ַ�ж��٣�
 */
public class Solution {

    public int numUniqueEmails(String[] emails) {


        LinkedHashSet<String> map = new LinkedHashSet<>();

        for (int i=0;i<emails.length;i++){
            String email = emails[i];
            int sIndex = email.indexOf("@");

            String preStr =  email.substring(0,sIndex);
            String endStr = email.substring(sIndex);

            preStr = changeStr(preStr);
            map.add(preStr+endStr);

        }

        return map.size();
    }

/*+----+---------+
        | Id | Email   |
            +----+---------+
            | 1  | a@b.com |
            | 2  | c@d.com |
            | 3  | a@b.com |
            +----+---------+
    �����������룬��Ĳ�ѯӦ�������½����

            +---------+
            | Email   |
            +---------+
            | a@b.com |
            +---------+*/
    private String changeStr(String preStr) {

        String str  = preStr;

        //ȥ����
        while (str.contains(".")){
            str = str.substring(0,str.indexOf("."))+str.substring(str.indexOf(".")+1);
        }

        //ȥ���Ӻ�
        if(str.contains("+")){
            str = str.substring(0,str.indexOf("+"));
        }

        return str;
    }

    public static void main(String[] args) {
        String strr = "1111@com.shhh";
        String substring = strr.substring(strr.indexOf("@"));
        System.out.println(substring);
    }
}
