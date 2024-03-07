package Arrays.intermmedate.prefixsum.assignment;

public class _02_EquilibriumIndexOfAnArray {

    /*
     * Problem Description
     *
     * You are given an array A of integers of size N.
     * Your task is to find the equilibrium index of the given array
     * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
     * If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
     *
     * Note:
     *  Array indexing starts from 0.
     *  If there is no equilibrium index then return -1.
     *  If there are more than one equilibrium indexes then return the minimum index.
     * */

    /*
     * Problem Constraints
     *
     * 1 <= N <= 105
     * -10^5 <= A[i] <= 10^5
     * */

    /*
     *
     *  TC = O(N) + O(N) => O(N)
     *  SC = O(N)
     *
     * */

    public static void main(String[] args) {

        int[] A = {1, 2, 3};
        int n = A.length;

        //Calculate prefixsum
        int[] prefixSum = new int[n];
        prefixSum[0] = A[0];

        for (int index = 1; index < n; index++) {
            prefixSum[index] = prefixSum[index - 1] + A[index];
        }

        //edgecase
        if (prefixSum[n - 1] - prefixSum[0] == 0) {
            System.out.println("The equilibrium index is 0");
            return;
        }

        //Check equilibrium index
        for (int index = 1; index < n; index++) {
            int lefSum = prefixSum[index - 1];
            int rightSum = prefixSum[n - 1] - prefixSum[index];
            if (lefSum == rightSum) {
                System.out.println("The equilibrium index is " + index);
                return;
            }
        }

        System.out.println("There is no equilibrium index...");
    }

}


