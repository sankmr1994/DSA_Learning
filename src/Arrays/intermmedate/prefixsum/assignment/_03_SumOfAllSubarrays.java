package Arrays.intermmedate.prefixsum.assignment;

public class _03_SumOfAllSubarrays {

    /*
     * Problem Description
     *
     * You are given an integer array A of length N.
     * You have to find the sum of all subarray sums of A.
     * More formally, a subarray is defined as a contiguous part of an array
     * which we can obtain by deleting zero or more elements from either end of the array.
     *
     * A subarray sum denotes the sum of all the elements of that subarray.
     * Note :
     *   Be careful of integer overflow issues while calculations. Use appropriate datatypes.
     * */

    /*
     * Problem Constraints
     *
     * 1 <= N <= 10^5
     * 1 <= Ai <= 10^4
     * */

    /*
     *
     *  TC = O(N)
     *  SC = O(1)
     *
     * */

    public static void main(String[] args) {

        int[] A = {1, 2, 3};
        int n = A.length;
        long sum = 0;
        for (int index = 0; index < n; index++) {
            long totalContributionOfElement = (long) (index + 1) * (n - index);
            sum = sum + totalContributionOfElement * A[index];
        }

        System.out.println("Ans is " + sum);

    }
}
