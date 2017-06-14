import java.util.Scanner;

/*

https://www.hackerrank.com/challenges/grading

HackerLand University has the following grading policy:

 - Every student receives a grade in the inclusive range from 0 to 100.
 - Any grade less than 40 is a failing grade.

Sam is a professor at the university and likes to round each student's grade according to these rules:

 - If the difference between the grade and the next multiple of 5 is less than 3,
   round grade up to the next multiple of 5.
 - If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.

For example, grade=84 will be rounded to 85 but grade=29 will not be rounded because the rounding would result
in a number that is less than 40.

Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
For each grade, round it according to the rules above and print the result on a new line.

 * Input Format

The first line contains a single integer denoting n (the number of students).
Each line i of the n subsequent lines contains a single integer, grade, denoting student i's grade.

 * Constraints

i <= n <=60
0 <= grade <= 100

 * Output Format

For each grade of the n grades, print the rounded grade on a new line.
 */

public class GradingStudents {
    private static int MAGIC_NUMBER = 38;

    static int[] solve(int[] grades){
        int[] result = new int[grades.length];
        for(int i=0; i<grades.length; i++) {
            result[i] = round(grades[i]);
        }
        return result;
    }

    static private int round(int grade){
        int mod = grade%5;
        if(grade < MAGIC_NUMBER) return grade;
        if(mod == 0 || 5-mod >= 3) return grade;
        return grade + (5-mod);
    }
}
