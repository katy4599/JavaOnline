package com.fundamentals.lessons;

import java.util.Scanner;
/*
* The contents of this class goes over Lesson 7 content
* Java Operators
* */
public class Lesson7 {

    int value1= 23, value2 = 45;

    // This method does basic math
    public void basicMath() {
        System.out.println(value1 + value2);
        System.out.println(value2 - value1);
        System.out.println(value1 * value2);
        System.out.println(value1 / value2);
    } // end method basicMath

    // This method calculates modulus
    public void exampleModulus() {
        int total = value1 % value2;
        System.out.println(total);
    } //end method exampleModulus

    //This method demonstrates the scanner utility
    public void addTwoNumber() {
         int x,y,z;
         System.out.println("Enter two numbers to calculate their sum.");
         Scanner in = new Scanner(System.in);
         x = in.nextInt();
         y = in.nextInt();
         z = x + y;
         System.out.println("The sum of entered values = "+ z);
    } // end method addTwoNumbers

    // This method covers assignment operators for basic math
    public void exampleAssignment1() {
        value1 += value2;
        System.out.println(value1);
        value2 -= value1;
        System.out.println(value2);
        value1 *= value2;
        System.out.println(value1);
        value2 /= value1;
        System.out.println(value2);
        value2 %= value1;
        System.out.println(value2);
    } // end method exampleAssignment1
    // This method covers assignment operators for additional types
    public void exampleAssignment2() {
        int beta = 10, charlie = 5;
        beta <<= charlie;
        System.out.println(beta);
        charlie >>= beta;
        System.out.println(charlie);
        beta &= charlie;
        System.out.println(beta);
        charlie ^= beta;
        System.out.println(charlie);
    } //end method exampleAssignment2

    // This method covers the increment operator
    public void exampleIncrement() {
        int home = 10, car, bike;
        car = home++;
        System.out.println(car);
        bike = ++home;
        System.out.println(bike);
    } // end method exampleIncrement

    // this method covers the Decrement Operator
    public void exampleDecrement() {
        int bottle = 4, mug, pitcher;
        mug = bottle--;
        System.out.println(mug);
        pitcher = --bottle;
        System.out.println(pitcher);
    } //end method exampleDecrement

}// end class
