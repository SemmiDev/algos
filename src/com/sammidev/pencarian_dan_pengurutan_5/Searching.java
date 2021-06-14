package com.sammidev.pencarian_dan_pengurutan_5;

public class Searching {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
//        sequentialSearch(numbers, 3);

//        int arr[] = { 2, 3, 4, 10, 40 };
//        int n = arr.length;
//        int x = 10;
//
//        int result = binarySearch(arr, 0, n - 1, x);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at index " + result);

//        System.out.println(binarySearch2(numbers, 5));



        studiKasus1SequentialSearch(numbers, 2);
        studiKasus1SBinarySearch(numbers,2);
    }


    static void sequentialSearch(int[] numbers, int x) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                result = i;
            }
        }
        if (result == 0) {
            System.out.println("hasil tidak ditemukan");
            return;
        } else {
            System.out.println(result);
        }
    }
    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
    static int binarySearch2(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    static void studiKasus1SequentialSearch(int[] sepatu, int match) {
        int hasil = 0;
        for (int i = 0; i < sepatu.length; i++) {
            if (sepatu[i] == match) {
                hasil = i;
                break;
            }
        }
        if (hasil == 0)
            System.out.println("tidak ada yg pas");
        else
            System.out.println("yosh cocok di : " + hasil);
    }

    static void studiKasus1SBinarySearch(int[] numbers, int x) {
        int hasil = 0;
        int kiri = 1;
        int kanan = numbers.length;
        while ((kiri < kanan) && hasil == 0) {
            int tengah = (kiri+kanan)/2;
            if (x < numbers[tengah]) {
                kanan = tengah-1;
            }else if (x > numbers[tengah]) {
                kiri= tengah+1;
            }else {
                hasil = tengah;
            }
        }
        if (hasil == 0)
            System.out.println("tidak ada yg pas");
        else
            System.out.println("yosh cocok di : " + hasil);
    }
}
