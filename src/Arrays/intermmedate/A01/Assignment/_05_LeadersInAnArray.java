package Arrays.intermmedate.A01.Assignment;

import java.util.Arrays;

public class _05_LeadersInAnArray {

    /*
     *
     * Problem Description
     *
     * Given an integer array A containing N distinct integers,
     * you have to find all the leaders in array A.
     * An element is a leader if it is strictly greater than all the elements to its right side.
     * NOTE: The rightmost element is always a leader.
     * */

    /*
     *
     * Problem Constraints
     * 1 <= N <= 10^5
     * 1 <= A[i] <= 10^8
     * */

    /*
     *  Time and Space Complexity
     *
     *  TC = O(N) => O(N)
     *  SC = O(1)
     * */

    public static void main(String[] args) {

        int[] A = {16, 17, 4, 3, 5, 2};
        int size = A.length;

        int leaderElement = A[size - 1];
        int leaderCount = 1;

        for (int index = size - 2; index >= 0; index--) {
            if (A[index] > leaderElement) {
                leaderElement = A[index];
                leaderCount++;
            }
        }

        int[] noOfLeaders = new int[leaderCount];
        int pointer = 0;
        noOfLeaders[pointer++] = A[size - 1];
        leaderElement = A[size - 1];

        for (int index = size - 2; index >= 0; index--) {
            if (A[index] > leaderElement) {
                leaderElement = A[index];
                noOfLeaders[pointer++] = A[index];
            }
        }

        System.out.println("Number leader is " + Arrays.toString(noOfLeaders));
    }
}
