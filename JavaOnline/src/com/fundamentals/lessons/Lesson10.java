package com.fundamentals.lessons;

/*
* This class will go over Lesson 10 content: Access Modifiers
* */
public class Lesson10 {

    // This method demonstrates a use of the private access modifier
    private void myMethod() {
        System.out.println("myMethod is a private method");
    }

    // This method demonstrates a use of the default access modifier
    void myDefaultMethod() {
        System.out.println("Method from a default access modifier");
        System.out.println("The next statement comes from a private method");
        myMethod();
    }

    // This method demonstrates use of the protected modifier
    protected void myProtectedMethod() {
        System.out.println("My protected method is using the protected modifier.");
    }

}
