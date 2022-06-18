package com.bridgelabz;

public class MaximumNumber {
    public static void main(String[] args) {
      Genericdata<Integer> genericdata = new Genericdata<> (3,5,6);
        System.out.println("maximum integer number is: " +genericdata.maximum() );
        Genericdata<Float> genericdata1 = new Genericdata<>  (6.7f, 5.3f, 6.1f);
        System.out.println("maximum floating number is: " + +genericdata1.maximum());
        Genericdata<String> genericdata2 = new Genericdata<> ("apple", "banana", "jackfruit");
        System.out.println("length of given string is: " +genericdata2.maximum());
    }

}
   class Genericdata <T extends Comparable > {
        T a,b,c;

       public Genericdata(T a, T b, T c) {
           this.a = a;
           this.b = b;
           this.c = c;
       }

       public T maximum() {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
        }




