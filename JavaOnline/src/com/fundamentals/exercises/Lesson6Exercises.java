package com.fundamentals.exercises;

public class Lesson6Exercises {

    String myString = "I can't wait to be a Java wiz!";

    public String exampleLowercase() {

        return myString.toLowerCase();
    }

    public void exampleChar() {
        char c1 = '\u00B6';
        System.out.println(c1);
    }

    public void exampleBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("Jack and Jill\nWent up the hill\nTo fetch a pail of water.\nJack fell down and broke his crown\nAnd Jill came tumbling after.");
        String fav = builder.toString();
        System.out.println(fav);
    }
}
