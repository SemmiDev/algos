package com.sammidev.array_3;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // basic();
        // studikasus1();
        // studikasus2();

    }

    static void basic() {
        PrintArray printArray = new PrintArray();

        // CONTOH 1
        int[] sample1 = {1, 2, 3, 4, 5};

        printArray.firstStyle(sample1);
        printArray.secondStyle(sample1);
        printArray.thirdStyle(sample1);
        printArray.fourthStyle(sample1);

        // CONTOH 2
        int[] sample2 = new int[5];
        sample2[0] = 5;
        sample2[1] = 4;
        sample2[2] = 3;
        sample2[3] = 2;
        sample2[4] = 1;

        printArray.firstStyle(sample2);
        printArray.secondStyle(sample2);
        printArray.thirdStyle(sample2);
        printArray.fourthStyle(sample2);

        // CONTOH 3
        char[] nameCharacter = {'S', 'A', 'M', 'M', 'I', ' ', 'L', 'O', 'V', 'E', ' ', 'I', 'Z', 'Z', 'A', 'H'};
        printArray.printChar1Dimension(nameCharacter);


        // CONTOH 4
        int[][] dimensi2 = new int[5][10];
        for (int i = 0; i < dimensi2.length; i++) {
            for (int j = 0; j < dimensi2[0].length; j++) {
                dimensi2[i][j] = i + j;
            }
        }

        for (int i = 0; i < dimensi2.length; i++) {
            for (int j = 0; j < dimensi2[0].length; j++) {
                System.out.print(dimensi2[i][j] + " | ");
            }
            System.out.println();
        }


        // CONTOH 5

        // • index pertama menunjukkan banyak baris
        // • index kedua menunjukkan banyak kolom
        // • index ketiga menunjukkan banyak lapisan
        int[][][] mat3D = new int[5][5][5];
        int initial = 0;

        for (int i = 0; i < mat3D.length; i++) {
            for (int j = 0; j < mat3D[0].length; j++) {
                for (int k = 0; k < mat3D[0][0].length; k++) {
                    mat3D[i][j][k] = initial + 1;
                }
            }
        }

        for (int i = 0; i < mat3D.length; i++) {
            for (int j = 0; j < mat3D[0].length; j++) {
                for (int k = 0; k < mat3D[0][0].length; k++) {
                    System.out.print("nilai [" + i + "][" + j + "][" + k + "] = "
                            + mat3D[i][j][k] + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    static void studikasus1() {
        /*
        * • Terdapat 10 data berat badan di kelas X yang
            sudah terurut.
          • 45, 50, 53, 55, 59, 60, 62, 63, 65, 67
          • Carilah rata-rata berat badan, berat terkecil
            dan berat yang terbesar
          • Buatlah algoritma dan kode programnya
          • Petunjuk: data diatas sudah terurut, jadi untuk
            menentukan berat terkecil dan terbesar lebih
            mudah
        * */

        int total = 0;
        int rataRata = 0;
        int beratTerkecil = 0;
        int beratTerbesar = 0;

        int[] beratBadan = {45, 50, 53, 55, 59, 60, 62, 63, 65, 67};

        // total seluruh berat badan
        for (int bb : beratBadan) {
            total += bb;
        }

        // total seluruh berat badan / banyak data
        rataRata = total / beratBadan.length;

        // berat Terkecil
        beratTerkecil = beratBadan[0];

        // berat terbesar
        beratTerbesar = beratBadan[beratBadan.length - 1];

        System.out.print("data : ");
        for (int data : beratBadan) {
            System.out.printf("%d ", data);
        }

        System.out.println();
        System.out.println("total data : " + beratBadan.length);
        System.out.println("total berat badan : " + total);
        System.out.println("rata-rata berat badan : " + rataRata);
        System.out.println("berat terkecil  : " + beratTerkecil);
        System.out.println("berat terbesar  : " + beratTerbesar);
    }

    static void studikasus2() {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int[][] matrix2 = new int[3][3];
        int init = 9;
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                init += 1;
                matrix2[i][j] = init;
            }
        }

        int layer1size = matrix1.length;
        int layer2size = matrix1[0].length;

        int[][] penjumlahan = new int[layer1size][layer2size];
        int[][] pengurangan = new int[layer1size][layer2size];

        int[] diagonalMatrixA = new int[layer1size];
        int[] diagonalMatrixASecondary = new int[layer1size];

        // penjumlahan dua matrix
        for (int i = 0; i < layer1size; i++) {
            for (int j = 0; j < layer2size; j++) {
                penjumlahan[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // pengurangan dua matrix
        for (int i = 0; i < layer1size; i++) {
            for (int j = 0; j < layer2size; j++) {
                pengurangan[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // diagonal matrix a
        for (int i = 0; i < layer1size; i++) {
            for (int j = 0; j < layer2size; j++) {
                if (i == j) {
                    diagonalMatrixA[i] = matrix1[i][j];
                }
            }
        }

        // diagonal matrix a secondary
        for (int i = 0; i < layer1size; i++) {
            int j = layer2size - 1 - i;
            diagonalMatrixASecondary[i] = matrix1[i][j];
        }


        // transpose matrix B

        // 10 11 12                10 13 16
        // 13 14 15  TRANSPOSE ->  11 14 17
        // 16 17 18                12 15 18

        int[][] transposeMatrixB = new int[layer1size][layer1size];

        for (int i = 0; i < layer1size; i++) {
            for (int j = 0; j < layer2size; j++) {
                // baris -> kolom & kolom -> baris
                transposeMatrixB[i][j] = matrix2[j][i];
            }
        }

        System.out.println("------------- MATRIX A");
        printMatrix2D(matrix1);

        System.out.println("\n------------- MATRIX B");
        printMatrix2D(matrix2);

        System.out.println("\n------------- MATRIX A + MATRIX B");
        printMatrix2D(penjumlahan);

        System.out.println("\n------------- MATRIX A - MATRIX B");
        printMatrix2D(pengurangan);

        System.out.println("\n------------- DIAGONAL MATRIX A");
        System.out.print("Diagonal pertama = | ");
        printArr(diagonalMatrixA);
        System.out.print("|\n");
        System.out.print("Diagonal pertama = | ");
        printArr(diagonalMatrixASecondary);
        System.out.print("|\n");

        System.out.println("\n------------- TRANSPOSE MATRIX B");
        printMatrix2D(transposeMatrixB);
    }

    private static void printArr(int[] arr) {
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    private static void printMatrix2D(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.printf("  | %d |  ", data[i][j]);
            }
            System.out.println();
        }
    }
}

class PrintArray {

    static void printChar1Dimension(char[] arr) {
        String join = "";
        for (int i = 0; i < arr.length; i++) {
            join += arr[i];
        }
        System.out.println(join);
    }

    static void firstStyle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // 5 4 3 2 1
        }
    }

    static void secondStyle(int[] arr) {
        for (int data : arr) {
            System.out.println(data);
        }
    }

    static void thirdStyle(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    static void fourthStyle(int[] arr) {
        String text = "";
        for (int data : arr) {
            text += data + "\n";
            JTextArea outputArea = new JTextArea();
            outputArea.setText(text);
            JOptionPane.showMessageDialog(null, outputArea);
        }
    }
}