package Tanxin.L944_easy;

import java.util.HashSet;
import java.util.Set;

/**
 ������ N ��Сд��ĸ�ַ�����ɵ����� A������ÿ���ַ���������ȡ�

 ѡȡһ��ɾ���������У����� A �е�ÿ���ַ�����ɾ����Ӧÿ�����������ַ��� �����µ��ַ����д������¶��γ��С�

 ���磬�� A = ["abcdef", "uvwxyz"]��ɾ���������� {0, 2, 3}��ɾ���� A Ϊ["bef", "vyz"]�� A ���зֱ�Ϊ["b","v"], ["e","y"], ["f","z"]������ʽ�ϣ��� n ��Ϊ [A[0][n], A[1][n], ..., A[A.length-1][n]]����

 ���裬����ѡ����һ��ɾ������ D����ô��ִ��ɾ������֮��A ����ʣ���ÿһ�ж������� �ǽ��� ���еģ�Ȼ�����㷵�� D.length ����С����ֵ��

 ʾ�� 1��

 ���룺["cba", "daf", "ghi"]
 �����1
 ���ͣ�
 ��ѡ�� D = {1}��ɾ���� A ����Ϊ��["c","d","g"] �� ["a","f","i"]����Ϊ�ǽ������С�
 ��ѡ�� D = {}����ô A ���� ["b","a","h"] �Ͳ��Ƿǽ��������ˡ�
 ʾ�� 2��

 ���룺["a", "b"]
 �����0
 ���ͣ�D = {}
 ʾ�� 3��

 ���룺["zyx", "wvu", "tsr"]
 �����3
 ���ͣ�D = {0, 1, 2}
 ��ʾ��

 1 <= A.length <= 100
 1 <= A[i].length <= 1000
 */
public class OtherSolution {

    public int minDeletionSize(String[] A) {

        Set<Integer> indexs =new HashSet<>();


        char[][] chars = new char[A.length][A[0].length()];

        return indexs.size();
    }
}
