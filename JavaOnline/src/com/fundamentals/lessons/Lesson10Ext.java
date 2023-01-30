package com.fundamentals.lessons;

/*
* This class, along with Lesson10, will demonstrate
* access modifiers
* */
public class Lesson10Ext {

    // This method will demonstrate how to call a default method from another class in same package
    public void methodFromOtherClass() {
        System.out.println("This method is public and from the ext");
        Lesson10 lesson10 = new Lesson10();
        lesson10.myDefaultMethod();
        lesson10.myProtectedMethod();
    }

}
