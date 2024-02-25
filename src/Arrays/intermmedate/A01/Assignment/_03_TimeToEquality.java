package Arrays.intermmedate.A01.Assignment;

public class _03_TimeToEquality {
    /*
     *
     * Problem Description
     *
     * Given an integer array A of size N. In one second,
     * you can increase the value of one element by 1.
     * Find the minimum time in seconds to make all elements of the array equal.
     *
     * */

    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3, 2};
        int size = A.length;

        int maxValue = A[0];
        int sum = A[0];
        for(int index = 1; index < size; index++){
            if(A[index] > maxValue){
                maxValue = A[index];
            }
            sum = sum + A[index];
        }

        System.out.println("Ans is : "+ ((maxValue * size) - sum));

    }
}
