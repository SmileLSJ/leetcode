package JianZhi.L52_hard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gxy on 2019/3/28.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(totalNQueens(5));
    }



    public static int totalNQueens(int n) {

        List<Integer> list = new ArrayList<>(n);

        int count = 0;

        for(int i=0;i<n;i++){

            //��һ��Ϊ��һ��Ԫ��
            list.add(i);

            count+=getCount(i,n,list);

            //ɾ��֮ǰ������Ԫ��
            list.remove(list.size()-1);
        }
        return count;
    }

    public static int getCount(int topIndex,int n,List<Integer> list){

        int count = 0;


        if(list.size()==n){
            System.out.println("");
            return 1;
        }

        for(int i=0;i<n;i++){
            if(valid(list.size(),i,list)){
                list.add(i);
                count +=getCount(i,n,list);
                list.remove(list.size()-1);
            }
        }

        return count;
    }

    public static boolean valid(int x,int y,List<Integer> list){

        for (int i=0;i<list.size();i++){
            if(list.get(i)==y){
                return false;
            }

            if(Math.abs(y-list.get(i))==Math.abs(x-i)){
                return false;
            }
        }
        return  true;
    }

    public static void print(List<Integer> list){
        String[] str = new String[list.size()];
        for (int i=0;i<list.size();i++){
        }
    }
}
