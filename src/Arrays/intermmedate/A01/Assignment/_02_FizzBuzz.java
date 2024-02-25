package Arrays.intermmedate.A01.Assignment;

import java.util.Arrays;

public class _02_FizzBuzz {

    /*
     *
     * Problem Description
     *
     * Given a positive integer A, return an array of strings with all the integers from 1 to N.
     * But for multiples of 3 the array should have “Fizz” instead of the number.
     * For the multiples of 5, the array should have “Buzz” instead of the number.
     * For numbers which are multiple of 3 and 5 both,
     * the array should have "FizzBuzz" instead of the number.
     * */
    public static void main(String[] args) {

        int A = 15;
        String[] result = new String[A];
        for (int index = 1; index <= A; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                result[index - 1] = "FizzBuzz";
            } else if (index % 3 == 0) {
                result[index - 1] = "Fizz";
            } else if (index % 5 == 0) {
                result[index - 1] = "Buzz";
            } else {
                result[index - 1] = String.valueOf(index);
            }
        }

        System.out.println("Result is " + Arrays.toString(result));

    }
}
