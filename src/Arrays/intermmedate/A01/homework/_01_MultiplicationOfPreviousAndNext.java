package Arrays.intermmedate.A01.homework;

import java.util.Arrays;

public class _01_MultiplicationOfPreviousAndNext {

    /*
     * Given an array of integers A,
     * update every element with multiplication of previous and next elements
     * with following exceptions.
     * a) First element is replaced by multiplication of first and second.
     * b) Last element is replaced by multiplication of last and second last.
     * */

    /*
     *
     * Constraints
     *
     * 1 <= length of the array <= 100000
     * -10^4 <= A[i] <= 10^4
     * */

    /*
     *  Time and Space Complexity
     *
     *  TC = O(N)
     *  SC = O(N)
     * */

    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        int n = A.length;
        int[] res = new int[n];

        if (n == 1) {
            return;
        }

        res[0] = A[0] * A[1];
        res[n - 1] = A[n - 1] * A[n - 2];

        for (int index = 1; index < n - 1; index++) {
            res[index] = A[index - 1] * A[index + 1];
        }

        System.out.println("Result is " + Arrays.toString(res));
    }
}
