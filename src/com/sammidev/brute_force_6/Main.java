package com.sammidev.brute_force_6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,24,1,2,3,5,100,20};
        maximum(arr);
        pangkat(2,5);
        factorial(6);

        int[][] a = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
        };

        int[][] b = {
            {2, 3, 3},
            {5, 2, 4},
            {4, 2, 3}
        };

        int[][] c = new int[a.length][a[0].length];
        perkalianMatrix(a,b,c);

        carifaktor(10);


        int list[]={6,-4,1,0,2};
        JOptionPane.showMessageDialog(null,"Nilai suku banyak p(x)untuk x=-1 adalah: "+polinom(list,-1));
    }

    static void maximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max : " + max);
    }

    static void pangkat(int x, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * x;
        }

        System.out.println(x + " pangkat " + n + " : " + hasil);
    }

    static void factorial(int n) {
        int hasil = 1;
        for (int i = 2; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println("faktorial " + n + " : " + hasil);
    }

    static void perkalianMatrix(int[][] a, int[][] b, int[][] c) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j] +=a [i][k]*b[k][j];
                }//end of k loop
                System.out.print(c[i][j]+" ");  //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }
    }

    static void carifaktor(int n) {
        List<Integer> faktor = new ArrayList<>();

        for (int i = 2; i < n-1; i++) {
            if (n % i == 0) {
                faktor.add(i);
            }
        }
        faktor.forEach(System.out::println);
    }

    static double polinom(int a[], int t){
        int i, j;
        double p = 0.0, pangkat=1.0;
        for(i=0;i<=a.length-1;i++){
            pangkat=pangkat * t;
            p=p+a[i]*pangkat;
        }
        return p;
    }
}