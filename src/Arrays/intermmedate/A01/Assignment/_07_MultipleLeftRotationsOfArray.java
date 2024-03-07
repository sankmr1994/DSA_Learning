package Arrays.intermmedate.A01.Assignment;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class _07_MultipleLeftRotationsOfArray {

    /*
     *  Problem Description
     *
     * Given an array of integers A and multiple values in B,
     * which represents the number of times array A needs to be left rotated.
     * Find the rotated array for each value
     * and return the result in the from of a matrix
     * where ith row represents the rotated array for the ith value in B.
     *
     * */

    /*
     *
     * Problem Constraints
     *
     * 1 <= length of both arrays <= 2000
     * -10^9 <= A[i] <= 10^9
     * 0 <= B[i] <= 2000
     *
     * */

    /*
     *  Time and Space Complexity
     *
     *  TC = O(N * M)
     *  SC = O(N)
     * */

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 3};
        int n = A.length;
        int m = B.length;

        int[][] res = new int[m][n];

        for (int index = 0; index < m; index++) {
            int noOFTimesToRotate = B[index] % n;

            // Reverse the whole arrays
            int[] copyArr = new int[n];
            for (int copyIndex = 0; copyIndex < n; copyIndex++) {
                copyArr[copyIndex] = A[n - copyIndex - 1];
            }

            noOFTimesToRotate = n - noOFTimesToRotate;

            //Reverse Kth elements to right
            reverse(copyArr, noOFTimesToRotate, n - 1);

            //Reverse remaining elements
            reverse(copyArr, 0, noOFTimesToRotate - 1);

            // Copy to Two dimensional matrix
            for (int col = 0; col < n; col++) {
                res[index][col] = copyArr[col];
            }
        }

        System.out.println("After Reverse");
        //print 2D array
        for (int[] row : res) {
            for (int colVal : row) {
                System.out.print(colVal + " ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
