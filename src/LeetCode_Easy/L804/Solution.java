package LeetCode_Easy.L804;

import java.util.HashSet;
import java.util.Set;

/**
 ����Ħ��˹���붨��һ�ֱ�׼���뷽ʽ����ÿ����ĸ��Ӧ��һ����һϵ�е�Ͷ�����ɵ��ַ�����
 ����: "a" ��Ӧ ".-", "b" ��Ӧ "-...", "c" ��Ӧ "-.-.", �ȵȡ�

 Ϊ�˷��㣬����26��Ӣ����ĸ��ӦĦ��˹��������£�

 [".-","-...","-.-.","-..",".","..-.","--.","....","..",
 ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
 "...","-","..-","...-",".--","-..-","-.--","--.."]
 ����һ�������б�ÿ�����ʿ���д��ÿ����ĸ��ӦĦ��˹�������ϡ�
 ���磬"cab" ����д�� "-.-..--..."��(�� "-.-." + "-..." + ".-"�ַ����Ľ��)�����ǽ�����һ�����ӹ��̳������ʷ��롣

 �������ǿ��Ի�����дʲ�ͬ���ʷ����������

 ����:
 ����: words = ["gin", "zen", "gig", "msg"]
 ���: 2
 ����:
 �����ʷ�������:
 "gin" -> "--...-."
 "zen" -> "--...-."
 "gig" -> "--...--."
 "msg" -> "--...--."

 ���� 2 �ֲ�ͬ����, "--...-." �� "--...--.".
 */
public class Solution {

    private static final String[] base =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."};

    public static int uniqueMorseRepresentations(String[] words) {

        Set<String> str = new HashSet<>();

        for (int i=0;i<words.length;i++){

            StringBuffer sb = new StringBuffer();

            char[] chars = words[i].toCharArray();

            for (int j=0;j<chars.length;j++){
                sb.append(base[(int)(chars[j])-(int)('a')]);
            }

            str.add(sb.toString());
        }

        return str.size();
    }


    public static String getChangePwd(char c){
        int index = (int)c;
        int i = index - (int)('a');
        return base[i];
    }

    public static void main(String[] args) {
        String[]  words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
