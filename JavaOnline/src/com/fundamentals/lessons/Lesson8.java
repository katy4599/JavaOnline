package com.fundamentals.lessons;

/*
* The contents of this class is to cover Lesson 8 content
* Control Flow Statements
* */
public class Lesson8 {

    // This method shows an if statement
    public void basicIfExample(int num1, int num2) {
        System.out.println("Before if Statement");
        if (num1 == num2) {
            System.out.println("Values are equal");
        } // end if
        System.out.println("After if statement");
    } // end method basicIfExample

    // This method shows an if else statement
    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if statement");
        if(alpha != beta){
            System.out.println("The values are not equal.");
        } else {
            System.out.println("The values are equal");
        } // end if else
        System.out.println("End of if else statement");
    } // end method basicIfElseExample

    //This method shows an if else chain statement
    public void basicIfElseChainExample(int value) {
        if(value < 30) {
            System.out.println("The value is less than 30");
        }else if(value <= 40) {
            System.out.println("The value is greater than 30, but less than or equal to 40.");
        }else {
            System.out.println("The value is greater than 40.");
        } // end if else chain
    }// end basic if else chain example

    // This method shows how to use the and/or statement with if
    public void basicIfAndOrExample(int num) {
        if(num > 100 || num < 50) {
            System.out.println("The value is less than 50 or greater than 100.");
        }// end if
        if(num % 2 == 0 && num > 30) {
            System.out.println("The value is greater than 30 and an even number.");
        }
    } // end method basicIfAndOrExample

    // This method shows how a switch statement is used
    public void basicSwitchExample(int day) {
        switch(day) {
            case 1:
                System.out.println("day = 1");
                break;
            case 2:
            case 3:
                System.out.println("day is either 2 or 3");
                break;
            default:
                System.out.println("day is greater than 3");
                break;
        } // end switch
    } // end of method basicSwitchExample

    // This method shows how to do a while loop
    public void basicWhileExample() {
        int val = 0; // initialized value
        while(val < 10) {
            System.out.println(val);
            val++;
        }
    } // end while loop

    // This method shows how to do a do while loop
    public void basicDoWhileExample() {
        int num = 0;
        do {
            if(num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        } while(num < 24);
    }

    // This method shows how to do a for loop
    public void basicForLoopExample() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    // This method shows the branching statements of continue and break
    public void basicBranchExample() {
        for(int i = 0; i < 10; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 4) {
                System.out.println("Loop breaks");
                break;
            }
            System.out.println(i);
        }
        System.out.println("End of loop");
    }
} // end class

