import java.util.HashSet;
import java.util.Set;

/*
https://www.hackerrank.com/challenges/pangrams

Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence
"The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram.
(Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence s, tell Roy if it is a pangram or not.

 * Input Format

Input consists of a string s.

 * Constraints
Length of s can be at most 10^3 (1 <= s <= 10^3)  and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.

 * Output Format

Output a line containing 'pangram' if s is a pangram, otherwise output 'not pangram'.

 */

public class Pangrams {
    private static String YEP = "pangram";
    private static String NOPE = "not pangram";

    public static String pangram(String str){
        Set<Character> usedLetters = new HashSet<>();

        for(char letter : str.toCharArray()) {
            if(letter != ' ' && Character.isAlphabetic(letter) ) {
                usedLetters.add(Character.toLowerCase(letter));
            }
        }

        return (usedLetters.size() == 26) ? YEP : NOPE;
    }

}
