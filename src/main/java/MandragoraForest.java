import java.util.*;

/*

https://www.hackerrank.com/challenges/mandragora

The evil forest is guarded by N vicious mandragoras.
Each i mandragora has H health points (1 <= i <= N).

Garnet and her pet begin their journey through the evil forest with S=1 strength points and P=0 experience points.
For each undefeated mandragora i, she can perform either of the following actions:
 - Garnet's pet eats mandragora i. This increments S by 1 and defeats mandragora i.
 - Garnet's pet battles mandragora i. This increases P by SxH experience points and defeats mandragora i    .
Each mandragora can only be defeated once, and Garnet can defeat the mandragoras in any order.
Given the respective health points for each mandragora, can you find the maximum number of experience
points she can earn from defeating all N mandragoras?

 * Input Format

The first line contains an integer, T, denoting the number of test cases. Each test case is described over two lines:
 - The first line contains a single integer, N, denoting the number of mandragoras in the forest.
 - The second line contains N space-separated integers describing the respective health points for the mandragoras.

 * Constraints

1 <= T <= 10000
1 <= N <= 10000
1 <= H <= 1000000
The sum of all Ns in a single test case is <= 10000

 * Output Format

For each test case, print a single line with an integer denoting the maximum number of experience points that Garnet can earn.

 */

public class MandragoraForest {
    public static long journey(long[] mandragora){
        long maxHP = Arrays.stream(mandragora).sum();
        return journey(mandragora, maxHP);
    }

    public static long journey(long[] mandragora, long mandragoraHP){
        int s = 1;

        Arrays.sort(mandragora);

        long maxExp = mandragoraHP;
        long nextExp;

        boolean found = false;
        int i = 0;
        do {
            s++;
            mandragoraHP -= mandragora[i];
            nextExp = mandragoraHP * s;
            if (maxExp <= nextExp) {
                maxExp = nextExp;
            } else {
                found = true;
            }
            i++;
        } while(i < mandragora.length && !found);
        return maxExp;
    }
}
