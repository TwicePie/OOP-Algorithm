/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sems3;

/**
 *
 * @author EKA
 */
public class FibonacciComparison {
    // Iterative Approach
    public static long fibonacciIterative(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0, b = 1, result = 0;
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }

    // Recursive Approach
    public static long fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    // Measure Execution Time
    public static long measureExecutionTime(FibonacciFunction function, int n) {
        long startTime = System.nanoTime();
        long result = function.calculate(n);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        return executionTime;
    }

    public static void main(String[] args) {
        int[] nValues = { 100, 1000, 5000, 10000 };

        for (int n : nValues) {
            System.out.println("\nCalculating Fibonacci term " + n + ":");

            // Iterative Approach
            long iterativeTime = measureExecutionTime(FibonacciComparison::fibonacciIterative, n);
            System.out.println("Iterative Approach: Result = " + fibonacciIterative(n) + ", Time = " + iterativeTime + " nanoseconds");

            // Recursive Approach
            long recursiveTime = measureExecutionTime(FibonacciComparison::fibonacciRecursive, n);
            System.out.println("Recursive Approach: Result = " + fibonacciRecursive(n) + ", Time = " + recursiveTime + " nanoseconds");
        }
    }

    interface FibonacciFunction {
        long calculate(int n);
    }
}

