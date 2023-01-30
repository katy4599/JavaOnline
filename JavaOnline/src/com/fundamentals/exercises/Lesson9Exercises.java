package com.fundamentals.exercises;

public class Lesson9Exercises {
    public void iceCreamArray() {
        String[] stringArray = new String[]{"vanilla", "chocolate", "Rocky Road", "Strawberry", "Moose Tracks"};
        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    public void scores2019Chiefs() {
        int[][] myArray = {{26,10,33,30,13,24,30,24,26,35,24,40,16,23,3,31},{40,28,28,34,19,31,6,31,23,32,17,9,23,3,26,21}};
        for(int h = 0; h < myArray.length; h++) {
            for(int a = 0; a < myArray[h].length; a++) {
                System.out.println(myArray[h][a]);
            }
        }
    }
}
