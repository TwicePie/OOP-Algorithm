/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PakAmin;
import java.util.*;
/**
 *
 * @author EKA
 */

class HitungSelect {
    int arrNilai[];

    public HitungSelect(int[] arrNilai) {
        this.arrNilai = arrNilai;
    }

    public void methodSelectionSort() {
        for (int i = 0; i < arrNilai.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrNilai.length; j++) {
                if (arrNilai[j] < arrNilai[min]) {
                    min = j;
                }
            }
            
            // Menukar elemen yang lebih kecil dengan elemen pada indeks i
            int temp = arrNilai[i];
            arrNilai[i] = arrNilai[min];
            arrNilai[min] = temp;

            // Menampilkan status array setiap iterasi
            System.out.println("Iterasi " + (i + 1) + ": " + Arrays.toString(arrNilai));
        }
    }
}

public class exSelectionSort {
    public static void main(String[] args) {
        int arrNilai[] = {64, 25, 12, 22, 11};
        HitungSelect obj = new HitungSelect(arrNilai);
        
        System.out.println("Array sebelum pengurutan: " + Arrays.toString(arrNilai));

        obj.methodSelectionSort();

        System.out.println("Array setelah pengurutan: " + Arrays.toString(arrNilai));
    }
}

