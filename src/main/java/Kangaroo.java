import java.util.Scanner;

/*

https://www.hackerrank.com/challenges/kangaroo

There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward positive infinity).
The first kangaroo starts at location x1 and moves at a rate of v2 meters per jump.
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
Given the starting locations and movement rates for each kangaroo,
can you determine if they'll ever land at the same location at the same time?

 * Input Format

A single line of four space-separated integers denoting the respective values of x1, v1, x2, and v2. *

 * Constraints

0 <= x1 < x2 <= 10000
1 <= v1, v2 <= 10000

 * Output Format

Print YES if they can land on the same location at the same time; otherwise, print NO.

Note: The two kangaroos must land at the same location after making the same number of jumps.

 */

public class Kangaroo {

    private static String YEP = "YES";
    private static String NOPE = "NO";

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int dist = x2 - x1;
        if(dist == 0) return YEP;

        x1 += v1;
        x2 += v2;
        int nextDist = x2 - x1;
        while(dist > nextDist && nextDist != 0) {
            dist = nextDist;
            x1 += v1;
            x2 += v2;
            nextDist = x2 - x1;
        }
        return (nextDist == 0) ? YEP : NOPE;
    }

    static String kangarooRic(int x1, int v1, int x2, int v2) {
        int dist = x2 - x1;
        return kangarooRic(dist, x1+v1, v1, x2+v2, v2);
    }

    static String kangarooRic(int dist, int x1, int v1, int x2, int v2) {
        int nextDist = x2 - x1;

        if (nextDist == 0) return YEP;
        if (dist <= nextDist) return NOPE;
        return kangarooRic(nextDist, x1+v1, v1, x2+v2, v2);

    }
}