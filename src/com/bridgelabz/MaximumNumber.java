package com.bridgelabz;
import java.util.Arrays;
public class MaximumNumber <T> {
    public T maximum(T... a) {
        Arrays.sort(a);
        T max = a[a.length - 1];
        printMax(max);
        return max;
    }
    private void printMax(T max){
        System.out.println("maximum value is : " +max);
    }

    public static void main(String[] args) {
        MaximumNumber<Integer> integermaximum = new MaximumNumber<>();
        MaximumNumber<Float> floatMaximum = new MaximumNumber<>();
        MaximumNumber<String> stringMaximum = new MaximumNumber<>();
        integermaximum.maximum(4,5,7,5,3);
        floatMaximum.maximum(7.4f,5.6f,3.5f,2.2f);
        stringMaximum.maximum("apple","banana","coconut","grapes","jackfruit");
    }
}