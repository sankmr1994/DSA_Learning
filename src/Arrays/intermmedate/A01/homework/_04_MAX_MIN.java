package Arrays.intermmedate.A01.homework;

import java.util.Arrays;

public class _04_MAX_MIN {

    /*
     *
     * Given an array of integers A and an integer B,
     * find and return the difference of B'th max element and B'th min element of the array A.
     * */

    /*
     *
     * Constraints
     *
     * 1 <= B <= length of the array <= 100000
     * -10^9 <= A[i] <= 10^9
     * */

    /*
     * Time and Space Complexity
     *
     *  TC = O(NlogN)
     *  SC = O(N)
     * */

    public static void main(String[] args) {
        int[] A = {5, 17, 100, 11};
        int n = A.length;
        int B = 1;

        int[] sortedArr = sort(A, 0, n - 1);
        System.out.println("After Sort " + Arrays.toString(sortedArr));

        int bThMin = sortedArr[B - 1];
        int bThMax = sortedArr[n - B];

        System.out.println("Ans is " + (bThMax - bThMin));

    }

    public static int[] sort(int[] A, int left, int right) {

        //Base Condition
        if (left == right) {
            return new int[]{A[left]};
        }
        int mid = (left + right) / 2;
        int[] leftSortedArr = sort(A, left, mid);
        int[] rightSortedArr = sort(A, mid + 1, right);
        int[] mergedArr = merge(leftSortedArr, rightSortedArr);
        return mergedArr;
    }

    public static int[] merge(int[] leftSortedArr, int[] rightSortedArr) {
        int n = leftSortedArr.length;
        int m = rightSortedArr.length;

        int i, j, k;
        i = j = k = 0;
        int[] sortedArr = new int[n + m];

        while (i < n && j < m) {
            sortedArr[k++] = leftSortedArr[i] < rightSortedArr[j] ? leftSortedArr[i++] : rightSortedArr[j++];
        }

        while (i < n) {
            sortedArr[k++] = leftSortedArr[i++];
        }
        while (j < m) {
            sortedArr[k++] = rightSortedArr[j++];
        }
        return sortedArr;
    }
}
