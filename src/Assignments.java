package assignments;

import java.util.Scanner;

public class Assignments {

    // Task 1
    public int factorial(int num){
        if (num >= 1)
            return num * factorial(num-1);
        else
            return 1;
    }

    // Task 2
    public int sum(int n){
        if (n <= 0)
            return 0;
        else
            return sum(n-1)+n*n;
    }

    // Task 3
    public int powers(int n, int b){
        if (b == 0)
            return 1;
        else
            return powers(n, b-1) + power(n, b);
    }
    public int power(int n,int b){
        if (b == 0)
            return 1;
        else if (b == 1)
            return n;
        else
            return power(n, b-1) * n;
    }

    // Task 4
    public int sumArray(int[] array, int n){
        if (n <= 0)
            return 0;
        else
            return sumArray(array, n-1) + array[n-1];
    }

    // Task 5
    public int maxArray(int[] array, int n){
        if (n == 1)
            return array[0];
        else
            return Math.max(array[n-1], maxArray(array, n-1));
    }

    // Task 6
    public int sumN(int n){
        if (n <= 0)
            return 0;
        else
            return sumN(n-1) + n;
    }

}
