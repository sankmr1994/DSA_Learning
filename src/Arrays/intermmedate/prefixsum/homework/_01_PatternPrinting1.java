package Arrays.intermmedate.prefixsum.homework;

public class _01_PatternPrinting1 {

    /*
     *
     * Problem Description
     *
     * Print a Pattern According to The Given Value of A.
     * Example: For A = 3 pattern looks like:
     * 1 0 0
     * 1 2 0
     * 1 2 3
     * */

    /*
     * Problem Constraints
     * 1 <= A <= 1000
     *
     * */

    /*
     *
     *  TC = O(N^2)
     *  SC = O(N^2)
     *
     * */

    public static void main(String[] args) {
        int A = 4;
        int[][] res = new int[A][A];
        for (int row = 0; row < A; row++) {
            for (int col = 0; col <= row; col++) {
                res[row][col] = col + 1;
            }
        }

        for (int[] row : res) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
