package assignments;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Assignments obj = new Assignments();

        // Task 1
        System.out.println("Task 1, please, enter the number: ");
        int num = in.nextInt();

        System.out.println("Task 1, factorial of " + num + " is: " + obj.factorial(num));

        // Task 2
        System.out.println("Task 2, please, enter the n number: ");
        int n = in.nextInt();

        System.out.println("Task 2, sum of the squares: " + obj.sum(n));

        // Task 3
        System.out.println("\nTask 3, please, enter the n, b numbers : ");
        int q = in.nextInt();
        int w = in.nextInt();

        System.out.println("Task 3, n power of base b: " + obj.powers(q, w));

        // Task 4
        System.out.println("\nTask 4, please, enter values for the array: ");
        int nArray = in.nextInt();
        int[] array = new int[nArray];
        for (int i = 0; i < nArray; i++){
            array[i] = in.nextInt();
        }
        System.out.println("And enter up to what date you want to sum them: ");
        int x = in.nextInt();

        System.out.println("Task 4, sum of the array: " + obj.sumArray(array, x));

        // Task 5
        System.out.println("\nTask 5, please, enter values for the array: ");
        int nArray5 = in.nextInt();
        int[] array5 = new int[nArray5];
        for (int i = 0; i < nArray5; i++){
            array5[i] = in.nextInt();
        }

        System.out.println("Task 5, the maximum number in the array: " + obj.maxArray(array5, nArray5));

        //Task 6
        System.out.println("\nTask  6, please enter the n number: ");
        int a = in.nextInt();

        System.out.println("Task 6, sum up to number n: " + obj.sumN(a));

    }
}
