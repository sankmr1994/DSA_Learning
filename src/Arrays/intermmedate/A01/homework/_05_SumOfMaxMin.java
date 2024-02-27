package Arrays.intermmedate.A01.homework;

public class _05_SumOfMaxMin {

    /*
     *
     * Problem Description
     *
     * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
     * NOTE: You should make minimum number of comparisons.
     * */

    /*
     *
     * Problem Constraints
     *
     * 1 <= N <= 10^5
     * -10^9 <= A[i] <= 10^9
     * */

    /*
     * Time and Space Complexity
     *
     *  TC = O(N)
     *  SC = O(1)
     * */

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 1};
        int n = A.length;

        int min = A[0];
        int max = A[0];

        for (int index = 1; index < n; index++) {
            if (A[index] < min)
                min = A[index];
            if (A[index] > max)
                max = A[index];
        }

        System.out.println("Ans is " + (max + min));
    }
}
