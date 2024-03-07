package Arrays.intermmedate.A01.homework;

import java.util.Arrays;

public class _03_CopyTheArray {

    /*
     *Problem Description
     *
     * You are given a constant array A and an integer B.
     * You are required to return another array where outArr[i] = A[i] + B.
     * */

    /*
     *
     * Problem Constraints
     *
     * 1 <= A.size() <= 10000
     * 1 <= A[i] <= 10000
     * 1 <= B <= 10000
     * */

    /*
     * Time and Space Complexity
     *
     *  TC = O(N)
     *  SC = O(1)
     * */

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 2, 1};
        int n = A.length;
        int B = 3;
        for (int index = 0; index < n; index++) {
            A[index] = A[index] + B;
        }
        System.out.println("After Copy Arrays " + Arrays.toString(A));
    }

}
