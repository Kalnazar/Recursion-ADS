# Recursion-ADS

### Description

In these tasks, the goal was to complete tasks with a recursive function, these are the most common tasks for recursion.

### Tasks
1. Factorial of entered number:
```java
public int factorial(int num){
    if (num >= 1)
        return num * factorial(num-1);
    else
        return 1;
}
```
2. Sum of squares up to the entered number:
```java
public int sum(int n){
    if (n <= 0)
        return 0;
    else
        return sum(n-1)+n*n;
}
```
3. Enterd n power of base b:
```java
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
```
4. Sum of the array up to what date you want to sum them:
```java
public int sumArray(int[] array, int n){
    if (n <= 0)
        return 0;
    else
        return sumArray(array, n-1) + array[n-1];
}
```
5. The maximum number in the array:
```java
public int maxArray(int[] array, int n){
    if (n == 1)
        return array[0];
    else
        return Math.max(array[n-1], maxArray(array, n-1));
}
```
6. Sum up to entered number n:
```java
public int sumN(int n){
    if (n <= 0)
        return 0;
    else
        return sumN(n-1) + n;
}
```
