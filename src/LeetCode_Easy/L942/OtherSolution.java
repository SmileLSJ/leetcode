package LeetCode_Easy.L942;

/**
 ����ֻ�� "I"�����󣩻� "D"����С�����ַ��� S ���� N = S.length��

 ���� [0, 1, ..., N] ���������� A ʹ�ö������� i = 0, ..., N-1�����У�

 ��� S[i] == "I"����ô A[i] < A[i+1]
 ��� S[i] == "D"����ô A[i] > A[i+1]

 ʾ�� 1��

 �����"IDID"
 �����[0,4,1,3,2]
 ʾ�� 2��

 �����"III"
 �����[0,1,2,3]

 ʾ�� 3��

 �����"DDI"
 �����[3,2,0,1]

 */
public class OtherSolution {

    public static int[] diStringMatch(String S) {

        int[] result;
        int length = S.length();
        result = new int[length+1];

        int startNum = 0;
        int endNum = length;

        for (int i=0;i<length+1;i++) {

            if(i==length){
                result[i]=endNum;
                continue;
            }

            if((S.charAt(i))=='I'){
                result[i]=startNum++;
            }else{
                result[i]=endNum--;
            }
        }

        result[length]=endNum;
        return result;
    }


    public static void main(String[] args) {
        String s = "IDID";
        int arr[] = diStringMatch(s);
        System.out.println(arr);
    }
}
