package com.fundamentals.exercises;

public class Lesson8Exercises {

    public void compareTwoStrings(String string1, String string2) {
        if(string1 == string2){
            System.out.println("The two strings are the same.");
        }else {
            System.out.println("The two strings are different.");
        }
    }

    public void charSwitchStatement(char grade) {
       switch(grade) {
           case 'E':
               System.out.println("Excellent");
               break;
           case 'V':
               System.out.println("Very Good");
               break;
           case 'G':
               System.out.println("Good");
               break;
           case 'A':
               System.out.println("Average");
               break;
           case 'F':
               System.out.println("Fail");
               break;
           default:
               System.out.println("Not a valid grade.");
               break;
       }
    }

    public void forLoopModulus() {
        for (int i = 0; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
