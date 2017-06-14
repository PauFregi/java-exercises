import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/apple-and-orange

Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
In the diagram below, the red region denotes his house, where s is the start point and t is the end point.
The apple tree is to the left of his house, and the orange tree is to its right.
You can assume the trees are located on a single point, where the apple tree is at point a and the orange tree is at point b.

When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis.
A negative value of  means the fruit fell d units to the tree's left,
and a positive value of d means it falls d units to the tree's right.

Given the value of d for m apples and n oranges,
can you determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range [s,t])?

Print the number of apples that fall on Sam's house as your first line of output,
then print the number of oranges that fall on Sam's house as your second line of output.

 * Input Format

The first line contains two space-separated integers denoting the respective values of s and t.
The second line contains two space-separated integers denoting the respective values of a and b.
The third line contains two space-separated integers denoting the respective values of m and n.
The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a.
The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.

 * Constraints

1 <= s,t,a,b,,m,n <= 10000
-10000 <=d <= 10000
a < s < t < b

 * Output Format

Print two lines of output:
On the first line, print the number of apples that fall on Sam's house.
On the second line, print the number of oranges that fall on Sam's house.
 */

public class AppleAndOrange {

    public static int countFruits(int[] fruits, int tree, int houseStart, int houseEnd) {
        int count = 0;

        for(int fruit: fruits){
            int fruitPos = tree + fruit;
            if (fruitPos >= houseStart && fruitPos <= houseEnd) count ++;
        }

        return count;
    }
}
