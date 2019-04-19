package LeetCode_Easy.L242_20190226;

/**
 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。

 示例 1:

 输入: s = "anagram", t = "nagaram"
 输出: true
 示例 2:

 输入: s = "rat", t = "car"
 输出: false
 说明:
 你可以假设字符串只包含小写字母。

 进阶:
 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
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
