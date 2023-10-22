/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PakAmin;

/**
 *
 * @author EKA
 */
import java.util.*;

class ContohBubbleSort {
    int arrNilai[];

    public ContohBubbleSort(int[] arrNilai) {
        this.arrNilai = arrNilai;
    }

    public void methodBubbleSort() {
        for (int i = 1; i < arrNilai.length; i++) {
            System.out.println("Iterasi ke : " + i);
            for (int j = 0; j < arrNilai.length - 1; j++) {
                if (arrNilai[j] > arrNilai[j + 1]) {
                    int temp;
                    temp = arrNilai[j];
                    arrNilai[j] = arrNilai[j + 1];
                    arrNilai[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arrNilai));
            }
        }
    }
}

public class exBubbleSort {
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

        ContohBubbleSort obj = new ContohBubbleSort(arrNilai);
        obj.methodBubbleSort();

        System.out.println("Array setelah pengurutan: " + Arrays.toString(arrNilai));
        scanner.close();
    }
}

