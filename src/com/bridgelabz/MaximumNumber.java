package com.bridgelabz;

public class MaximumNumber {
    public static Integer maximum(Integer a, Integer b, Integer c) {

        Integer max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        } else if (c.compareTo(max) > 0) {
            max = c;

        }
        return max;
    }

    public static Float maximumFloat(Float a, Float b, Float c) {

        Float max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        } else if (c.compareTo(max) > 0) {
            max = c;

        }
        return max;
    }


    public static void main(String[] args) {
        Integer result = MaximumNumber.maximum(7, 9, 8);
        System.out.println("maximum integer number is: " + result);
        Float  result1 = MaximumNumber.maximumFloat(6.7f,5.3f,6.1f);
        System.out.println("maximum floating number is: " + result1);
    }

}
