
/*
https://www.hackerrank.com/challenges/reduced-string

Steve has a string, s, consisting of n lowercase English alphabetic letters. In one operation, he can delete any pair of adjacent letters with same value. For example, string "aabcc" would become either "aab" or "bcc" after  operation.

Steve wants to reduce s as much as possible. To do this, he will repeat the above operation as many times as it can be performed. Help Steve out by finding and printing s's non-reducible form!

Note: If the final string is empty, print Empty String .

 * Input Format

A single string, s.

 * Constraints

1 <= n <= 100

 * Output Format

If the final string is empty, print Empty String; otherwise, print the final non-reducible string.

 */

public class SuperReducedString {

    static String reduce(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                s = s.substring(0, i-1) + s.substring(i+1);
                i = 0;
            }
        }
        return (s.length() == 0) ? "Empty String" : s;
    }

}
