package com.sammidev.pencarian_dan_pengurutan_5;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        bubbleSort(arr);
//          selectionSort(arr);
        countingSort(arr, arr.length);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    static void insertionSort(int[] arr) {
        // 5 4 3 2 1

        int n = arr.length; // 5
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // 4
            int j = i-1; // 0
            while (j >= 0 && arr[j] > key) { // 5 > 4
                arr[j+1] = arr[j]; //5
                j = j-1; // 0
            }
            arr[j+1] = key; // 4
        }
    }

    static void countingSort(int[] array, int size) {
        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }
        printarr(count);

        // Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }
        printarr(count);

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        printarr(count);

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        printarr(count);

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }

    static void printarr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}