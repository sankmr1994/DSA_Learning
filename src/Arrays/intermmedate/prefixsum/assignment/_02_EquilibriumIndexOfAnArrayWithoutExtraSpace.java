package Arrays.intermmedate.prefixsum.assignment;

public class _02_EquilibriumIndexOfAnArrayWithoutExtraSpace {

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
     *  SC = O(1)
     *
     * */

    public static void main(String[] args) {

        int[] A = {0, 0, 1, 0, 0};
        int n = A.length;

        int totalSum = 0;
        for (int index = 0; index < n; index++) {
            totalSum = totalSum + A[index];
        }
        int p1 = 0;
        int p2 = A[0];
        //edgecase
        if (totalSum - p2 == 0) {
            System.out.println("The equilibrium index is 0");
            return;
        }

        //Check equilibrium index
        for (int index = 1; index < n; index++) {
            p1 = p1 + A[index - 1];
            p2 = p2 + A[index];
            int lefSum = p1;
            int rightSum = totalSum - p2;
            if (lefSum == rightSum) {
                System.out.println("The equilibrium index is " + index);
                return;
            }
        }

        System.out.println("There is no equilibrium index...");
    }

}


