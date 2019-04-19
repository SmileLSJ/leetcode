package LeetCode_Easy.L711;

/**
 * 通过hash的算法来执行
 */
public class OtherSolution {

    public static int numJewelsInStones(String J, String S) {

        int a[] = new int[256];

        char[] chars = S.toCharArray();

        for (int i=0;i<chars.length;i++){
            if(String.valueOf(a[chars[i]]).equals("")||String.valueOf(a[chars[i]])==null){
                a[chars[i]]=0;
            }else{
                a[chars[i]]++;
            }

        }

        int count=0;
        char[] chars1 = J.toCharArray();
        for (int j=0;j<chars1.length;j++){
            count+=a[chars1[j]];
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aaaa"));
    }
}
