package Arrays.intermmedate.A01.Assignment;

public class _10_SubarrayWithLeastAverage {

    /*
     *
     * Problem Description
     * Given an array A of size N, find the subarray of size B with the least average.
     * */

    /*
     *
     * Problem Constraints
     * 1 <= B <= N <= 10^5
     * -10^5 <= A[i] <= 10^5
     * */

    /*
     *  Time and Space Complexity
     *
     *  TC = O(N)
     *  SC = O(1)
     * */

    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int n = A.length;
        int B = 3;

        //Solve by using sliding window technique
        //First get sum of first window [0 to B - 1]
        int sum = 0;
        for (int index = 0; index < B; index++) {
            sum = sum + A[index];
        }

        int minAvgSum = sum;
        int minAvgFisrtIndex = 0;
        int start = 1;
        int end = B;

        while (end < n) {

            // Remove previous value from sum
            sum = sum - A[start - 1];
            // Remove next value from sum
            sum = sum + A[end];

            if (sum < minAvgSum) {
                minAvgSum = sum;
                minAvgFisrtIndex = start;
            }
            start++;
            end++;
        }
        System.out.println("Minimum Average sum is " + minAvgSum);
        System.out.println("Minimum Average of first index is " + minAvgFisrtIndex);

    }
}
