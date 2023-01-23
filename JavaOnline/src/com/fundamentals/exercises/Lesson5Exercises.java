package com.fundamentals.exercises;

public class Lesson5Exercises {
    public void showNumber() {
        int value = 29;
        int value2 = 0x1D;
        int value3 = 0b11101;
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);
    }

    byte myByte = 9;
    int myInt = 4222;
    short myShort = 235;
    double myDouble = 36.43D;
    float myFloat = 34.53F;
    long myLong = 56864L;

    public void showConversions() {
        int example1 = myByte;
        long example2 = myShort;
        float example3 = myInt;
        long example4 = (long)myDouble;
        int example5 = (int)myFloat;
        short example6 = (short)myLong;
        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);
        System.out.println(example4);
        System.out.println(example5);
        System.out.println(example6);

    }
}
