package com.bridgelabz.array;

public class PrintTheSmallestElement {
    public static void main(String[] args) {
        int [] arr = new int [] {50, 60, 75, 80, 40, 35};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with min
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("smallest element present in given array : " + min);
    }
}
