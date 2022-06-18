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

    public static Integer maximumString(String a,String b,String c) {
        Integer l1 = a.length();
        Integer l2 = b.length();
        Integer l3 = c.length();
        Integer max = l1;
        
      if (l1.compareTo(l2)>0) {
          max = l1;
          System.out.println("maxim string is : " +a);

      }
        if (l2.compareTo(max) > 0) {
            max = l2;
            System.out.println("maximum string is : " +b);
        }
        if (l3.compareTo(max) > 0) {
            max = l3;
            System.out.println("maximum string is : " +c);
        }
        return max;
    }


    public static void main(String[] args) {
        Integer result = MaximumNumber.maximum(7, 9, 8);
        System.out.println("maximum integer number is: " + result);
        Float  result1 = MaximumNumber.maximumFloat(6.7f,5.3f,6.1f);
        System.out.println("maximum floating number is: " + result1);
        Integer result2 = MaximumNumber.maximumString("peach","apple","banana");
        System.out.println("length of given string is: " +result2);
    }

}
