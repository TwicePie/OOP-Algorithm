/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PakAmin;
/**
 *
 * @author EKA
 */
public class FibonacciIterative {
    public static long fibonacciIterative(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] nValues = {100, 1000, 5000, 10000};

        for (int n : nValues) {
            long Start = System.nanoTime();
            long result = fibonacciIterative(n);
            long End = System.nanoTime();
            double elapsedTime = (End - Start) / 1e9; 
            System.out.printf("Iteratif: n = %d\n", n);
            System.out.printf("hasil = %d\n",result);
            System.out.printf("waktu = waktu = %.6f detik%n\n\n", elapsedTime);
        }
    }
}