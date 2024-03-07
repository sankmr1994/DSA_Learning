package Arrays.intermmedate.A01.Assignment;

import java.util.Arrays;

public class _09_ReverseTheArray {

    /*
     * Problem Description
     *
     * You are given a constant array A.
     * You are required to return another array which is the reversed form of the input array.
     * */

    /*
     * Problem Constraints
     *
     * 1 <= A.size() <= 10000
     * 1 <= A[i] <= 10000
     * */

    /*
     *  Time and Space Complexity
     *
     *  TC = O(N/2) => O(N)
     *  SC = O(1)
     * */


    public static void main(String[] args) {
        int[] A = {1, 1, 10, 5};
        int end = A.length - 1;
        int start = 0;
        System.out.println("Array Before reverse " + Arrays.toString(A));
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array After reverse " + Arrays.toString(A));
    }
}
