package com.fundamentals.lessons;

import com.fundamentals.House;

/*
* This class content is for Lesson 18: Exceptions and Exception Handling
* */
public class Lesson18 {
    String myString;
    House myHouse;
    // This method shows a basic try/catch/finally
    public void exampleException() {
        try {
            System.out.println(myHouse.equals(myString));
            System.out.println(myString);
            System.out.println("Try block ran");
        } catch (NullPointerException e) {
            System.out.println("Null exception thrown "+ e.getMessage());
        } finally {
            System.out.println("Finally block called");
        }
    }

    //This method will show a try with multiple catches and a finally
    public void myArrayException() {
        String[] names = {"Dave","Matt","Jody"};
        String[] values = {"24", "42", "38"};
        int hmm = Integer.MAX_VALUE;

        try {
            byte b = Byte.parseByte(values[1]);
            int total = Math.addExact(b, hmm);
            System.out.println(total);
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least 1 argument");
        } catch(NumberFormatException nf) {
            System.out.println("That is not a number");
        } catch(ArithmeticException ae) {
            System.out.println("You have given me more than I need");
        } catch(Exception e) {
            System.out.println("I dunno what you did" + e.toString());
        } finally {
            System.out.println("Finally my number didn't work");
        }
    }

}
