package com.bridgelabz.array;

public class ElementsOfAnArrayInReverseOrder {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 8};

        System.out.println("Array in reverse order : ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
