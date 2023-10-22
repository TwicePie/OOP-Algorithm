/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PakAmin;

import java.util.*;

class ContohInsertSort {
    int arrNilai[];

    public ContohInsertSort(int[] arrNilai) {
        this.arrNilai = arrNilai;
    }

    public void methodInsertSort() {
        for (int i = 1; i < arrNilai.length; i++) {
            int key = arrNilai[i];
            int j = i - 1;

            System.out.println("Iterasi ke-" + i);

            while (j >= 0 && arrNilai[j] > key) {
                arrNilai[j + 1] = arrNilai[j];
                j--;

                System.out.println(Arrays.toString(arrNilai));
            }

            arrNilai[j + 1] = key;
        }
    }
}

public class exInsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int length = scanner.nextInt();

        int arrNilai[] = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arrNilai[i] = random.nextInt(10); // Mengisi array dengan angka acak antara 0 dan 99.
        }

        System.out.println("Array sebelum pengurutan: " + Arrays.toString(arrNilai));

        ContohInsertSort obj = new ContohInsertSort(arrNilai);
        obj.methodInsertSort();

        System.out.println("Array setelah pengurutan: " + Arrays.toString(arrNilai));
        scanner.close();
    }
}

