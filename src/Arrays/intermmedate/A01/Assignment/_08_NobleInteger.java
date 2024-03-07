package Arrays.intermmedate.A01.Assignment;

import java.util.Arrays;

public class _08_NobleInteger {

    /*
     * Problem Description
     *
     * Given an integer array A,
     * find if an integer p exists in the array such that the number of integers
     * greater than p in the array equals p.
     *
     * */


    /*
     * Problem Constraints
     *
     * 1 <= |A| <= 2*105
     * -10^8 <= A[i] <= 10^8
     * */

    /*
    *  Time and Space Complexity
    *
    *  TC = O(NlogN) + O(N) => O(NlogN)
    *  SC = O(N)
    * */


    public static void main(String[] args) {
        int[] A = {3, 2, 1, 3};
        int n = A.length;
        //Sort the array first
        int[] sortedArr = sort(A, 0, n - 1);

        System.out.println(Arrays.toString(sortedArr));

        boolean isNobleInteger = false;
        int nobleInteger = 0;
        for (int index = 0; index < n - 1; index++) {

            // Skip the validation when current value is equals to next value
            if (sortedArr[index] == sortedArr[index + 1])
                continue;

            nobleInteger = sortedArr[index];

            // get the number of elements after the current index
            int noOfGreaterElements = n - index - 1;
            //check the current index value is equals to number of elements after the current index
            if (noOfGreaterElements == nobleInteger) {
                //if it is true set nob
                isNobleInteger = true;
                break;
            }
        }

        if (isNobleInteger || sortedArr[n - 1] == 0) {
            System.out.println("Noble integer is " + nobleInteger);
        } else {
            System.out.println("There is no Noble integer");
        }

    }

    public static int[] sort(int[] A, int left, int right) {

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
        int[] res = new int[n + m];

        while (i < n && j < m) {
            if (leftSortedArr[i] < rightSortedArr[j]) {
                res[k++] = leftSortedArr[i++];
            } else {
                res[k++] = rightSortedArr[j++];
            }
        }

        while (i < n)
            res[k++] = leftSortedArr[i++];
        while (j < m)
            res[k++] = rightSortedArr[j++];


        return res;
    }
}
