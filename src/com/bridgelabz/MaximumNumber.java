package com.bridgelabz;

public class MaximumNumber {

    public static <T extends Comparable> T maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer result = MaximumNumber.maximum(7, 9, 8);
        System.out.println("maximum integer number is: " + result);
        Float result1 = MaximumNumber.maximum(6.7f, 5.3f, 6.1f);
        System.out.println("maximum floating number is: " + result1);
        String result2 = MaximumNumber.maximum("apple", "banana", "jackfruit");
        System.out.println("length of given string is: " + result2);
    }

}
