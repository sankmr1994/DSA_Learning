package Arrays.intermmedate.prefixsum.assignment;

import java.util.Arrays;

public class _01_ContinuousSumQuery {

    /*
     *
     * Problem Description
     *
     * There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot.
     * When the devotees come to the temple, they donate some amount of coins to these beggars.
     * Each devotee gives a fixed amount of coin(according to their faith and ability)
     * to some K beggars sitting next to each other.
     *
     * Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
     * For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B
     * */

    /*
     *
     * Problem Constraints
     *
     * 1 <= A <= 2 * 10^5
     * 1 <= L <= R <= A
     * 1 <= P <= 10^3
     * 0 <= len(B) <= 10^5
     * */

    /*
     *
     *  TC = O(Q) + O(N) => O(Q+N)
     *  SC = O(N)
     *
     * */

    public static void main(String[] args) {
        int arrSize = 5;
        int[][] query = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};

        int[] sumArr = new int[arrSize];

        int queryLen = query.length;

        for (int row = 0; row < queryLen; row++) {
            int start = query[row][0] - 1;
            int end = query[row][1];
            int val = query[row][2];
            sumArr[start] = sumArr[start] + val;
            if (end < arrSize) {
                sumArr[end] = sumArr[end] - val;
            }
        }

        //Calculate prefix sum
        for (int index = 1; index < arrSize; index++) {
            sumArr[index] = sumArr[index - 1] + sumArr[index];
        }

        System.out.println("Ans is " + Arrays.toString(sumArr));

    }
}
