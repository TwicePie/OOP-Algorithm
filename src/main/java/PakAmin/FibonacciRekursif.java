/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PakAmin;
import java.util.HashMap;
/**
 *
 * @author EKA
 */
public class FibonacciRekursif {
    private static HashMap<Integer, Long> memo = new HashMap<>();

    public static long fibonaccirekursif(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = fibonaccirekursif(n - 1) + fibonaccirekursif(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int[] nValues = {100, 1000, 5000, 10000};

        for (int n : nValues) {
            long startTime = System.nanoTime();
            long result = fibonaccirekursif(n);
            long endTime = System.nanoTime();
            double elapsedTime = (endTime - startTime) / 1e9;
            System.out.printf("Iteratif: n = %d\n", n);
            System.out.printf("hasil = %d\n",result);
            System.out.printf("waktu = waktu = %.6f detik%n\n\n", elapsedTime);
        }
    }
}