package LeetCode_Easy.L977;

/**
 * Created by Gxy on 2019/2/19.
 */
public class OtherSolution {

    public static int[] sortedSquares(int[] A) {

        int startIndex = 0;
        int endIndex = A.length-1;
        int newIndex = A.length-1;

        int[] B = new int[A.length];

        while (startIndex<=endIndex){

            if(Math.abs(A[startIndex])>Math.abs(A[endIndex])){
                B[newIndex] = A[startIndex]*A[startIndex];
                newIndex--;
                startIndex++;
            }else{
                B[newIndex] = A[endIndex] * A[endIndex];
                newIndex--;
                endIndex--;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int a[]  = {-4,-1,10,3,10};
        int b[] = sortedSquares(a);
        System.out.println(b);
    }
}
