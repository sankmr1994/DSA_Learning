package Arrays.intermmedate.A01.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class _04_RotationGame {

    /*
     *Problem Description
     *
     * Given an integer array A of size N and an integer B,
     * you have to print the same array after rotating it B times towards the right.
     * */

    /*
     *
     * Problem Constraints
     *
     * 1 <= N <= 10^6
     * 1 <= A[i] <=10^8
     * 1 <= B <= 10^9
     * */

    /*
     *  Time and Space Complexity
     *
     *  TC = O(N/2) => O(N)
     *  SC = O(1)
     * */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];

        for (int index = 0; index < arraySize; index++) {
            A[index] = scanner.nextInt();
        }

        System.out.println("Before rotation " + Arrays.toString(A));

        // Get number of times to rotate array
        int noOfTimesToRotate = scanner.nextInt();
        noOfTimesToRotate = noOfTimesToRotate % arraySize;

        if (noOfTimesToRotate > 0) {
            // Reverse Whole Array first [0 to (n - 1)]
            reverseArray(A, 0, arraySize - 1);
            // Reverse first number of rotation [ 0 to (noOfTimesToRotate - 1)]
            reverseArray(A, 0, noOfTimesToRotate - 1);
            //Reverse remaining elements
            reverseArray(A, noOfTimesToRotate, arraySize - 1);
        }
        System.out.println("After rotation " + Arrays.toString(A));
    }

    public static void reverseArray(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
}
