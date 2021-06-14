package com.sammidev.kompleksitas_4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int data[] = new int[100000];
//        Random angka = new Random();
//        for (int i = 0; i < data.length; i++)
//            data[i] = angka.nextInt(100000); //isi data secara random
//        sequentialSearch(data, 20, data.length);
        int[] arr = {5,4,3,2,1,-5,6,200};
        siapa_tahu(arr);

    }

    public static void sequentialSearch(int a[], int x, int n) {
        int k = 0;
        double time1, time2;
        time1 = System.nanoTime(); //inisialisasi waktu awal proses
        while (k < n) {
            if (a[k] == x) {
                time2 = System.nanoTime();
                System.out.println("Nilai x ketemu di indeks ke " + k);
                System.out.println("waktu pencarian = " + (time1 / time2) / 1000000 + " detik");
                break;
            } else
                k++;
        }
        if (k == a.length) {
            time2 = System.nanoTime(); //inisialisasi waktu untuk akhir proses
            System.out.print("Nilai x tidak ketemu, waktu pencarian = ");
            System.out.println((time1 / time2) / 1000000 + " detik");
        }
    }

    static int maximum(int[] numbers) {
        int max = numbers[0]; // 1
        for (int i = 0; i < numbers.length; i++) { // n
            if (max < numbers[i]) { // 1
                max = numbers[i]; // 1
            }
        }
        return max; // 1
    }

    static void siapa_tahu(int[] numbers) {
        int m = 0; // 1
        for (int i = 0; i < numbers.length-1; i++) { // n
            for (int j = i + 1; j < numbers.length; j++) { // n -1
                if (Math.abs(numbers[i] - numbers[j]) > m) { // 1
                    m = Math.abs(numbers[i] - numbers[j]); // 1
                }
            }
        }
    }
    
    static void max_diff(int[] numbers) {
        int min = numbers[0]; // 1
        int max = numbers[0]; // 1

        for (int i = 0; i < numbers.length; i++) { // n
            if (numbers[i] < min) {  // 1
                min = numbers[i]; // 1
            }else if (numbers[i] > max) { // 1
                max = numbers[i]; // 1
            }
        }
        int m = max - min; // 1
        System.out.println(m);
    }

    static void latihan3(int[][][] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = j; k < arr.length; k++) {
                    a += 1;
                }
            }
        }
    }
}
