package Arrays.intermmedate.A01.Assignment;

public class _01_GoodPair {
    /*
     * Problem Description
     * Given an array A and an integer B. A pair(i, j) in the array is a good pair
     * if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
     * */

    public static void main(String[] args) {
        int[] A = {1, 2, 4};
        int B = 4;
        boolean isPair = isPair(A, B);
        System.out.println("isPair available : " + isPair);
    }

    public static boolean isPair(int[] A, int B) {
        int size = A.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (A[i] + A[j] == B) {
                    return true;
                }
            }
        }
        return false;
    }
}
