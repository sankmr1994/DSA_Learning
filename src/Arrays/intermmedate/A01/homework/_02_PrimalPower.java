package Arrays.intermmedate.A01.homework;

public class _02_PrimalPower {

    /*
     *
     *Problem Description
     *
     * "Primal Power" of an array is defined as the count of prime numbers present in it.
     * Given an array of integers A of length N, you have to calculate its Primal Power.
     * */

    /*
     *
     * Problem Constraints
     * 1 <= N <= 10^3
     * -10^6 <= A[i] <= 10^6
     * */

    /*
     *  Time and Space Complexity
     *
     *  TC = O(N * squareRoot(N))
     *  SC = O(N)
     * */

    public static void main(String[] args) {
        int[] A = {-11, 7, 8, 9, 10, 11};
        int n = A.length;
        int primalCount = 0;
        for (int index = 0; index < n; index++) {
            int number = A[index];
            if (number > 0) {
                if (checkIsPrime(number)) {
                    System.out.print(number + " ");
                    primalCount++;
                }
            }
        }

        System.out.println("PrimalPower count is " + primalCount);
    }

    public static boolean checkIsPrime(int number) {
        for (int index = 2; index * index <= number; index++) {
            if (number % index == 0)
                return false;
        }
        return true;
    }
}
