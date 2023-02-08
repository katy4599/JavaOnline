package com.fundamentals.exercises;

public class Lesson14Exercises {

    public static int  i = 15;
    public static int r = 2;
    public static int v = 12;
    public static final int FORMULA_FOR_V = i * r;
    public static final int FORMULA_FOR_I = v/r;
    public static final int FORMULA_FOR_R = v/i;

    public static void ohmsLawV(int i, int r){
       int v = i * r;
        System.out.println(v);
    }

    public static void ohmsLawI(int v, int r) {
        int i = v/r;
        System.out.println(i);
    }

    public static void ohmsLawR(int v, int i) {
        int r = v/i;
        System.out.println(r);
    }
}
