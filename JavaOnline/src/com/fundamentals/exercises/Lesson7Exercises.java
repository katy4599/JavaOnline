package com.fundamentals.exercises;

import java.util.Scanner;
public class Lesson7Exercises {
    public void exerciseModulus(int value1) {
        System.out.println("Please provide a number between 1 and 10.");
        Scanner in = new Scanner(System.in);
        int value2 = in.nextInt();
        int modulus = value1 % value2;
        System.out.println(modulus);
    } // end method exerciseModulus

    public void exerciseDoubleData(double value1, double value2) {
        value1 += value2;
        System.out.println(value1);
        value1 *= value2;
        System.out.println(value1);
        value1 %= value2;
        System.out.println(value1);
        //value2 ^= value1;
        //System.out.println(value2);
    } // end method exerciseDoubleData

    public void exerciseMysteryMath() {
        System.out.println(10 + 32 * 12 / 3);
        System.out.println(10 + 32 * 12 / 3 + 30);
    } // end method exerciseMysteryMath
}
