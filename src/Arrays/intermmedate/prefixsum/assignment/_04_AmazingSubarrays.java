package Arrays.intermmedate.prefixsum.assignment;

public class _04_AmazingSubarrays {

    /*
     * Problem Description
     *
     * You are given a string S, and you have to find all the amazing substrings of S.
     * An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
     * */

    /*
     * Constraints
     *
     * 1 <= length(S) <= 1e6
     * S can have special characters
     * */

    /*
     *
     *  TC = O(N)
     *  SC = O(1)
     *
     * */

    public static void main(String[] args) {
        String str = "ABEC";
        int n = str.length();
        int mod = 10003;
        long totalCount = 0;
        for (int index = 0; index < n; index++) {
            char ch = str.charAt(index);
            if (isVowel(ch)) {
                long totalContributionOfCharacter = (long) (n - index);
                totalCount = (totalCount % mod + totalContributionOfCharacter % mod) % mod;
            }
        }
        System.out.println("Ans is " + totalCount);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
}
