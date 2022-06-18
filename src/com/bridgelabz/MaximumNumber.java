package com.bridgelabz;
import java.util.Arrays;
public class MaximumNumber {
    public static <T> T maximum(T... a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        System.out.println("maximum integer number is: " + maximum(3, 6, 1, 13, 56, 18));
        System.out.println("maximum flot number is: " + maximum(1.2f, 5.6f, 7.6f, 2.2f, 2.2f));
        System.out.println("maximum value string name is: " + maximum("apple", "banana","coconut" ,"jackfruit", "grapes"));
    }
}




