package com.fundamentals;

import com.fundamentals.lessons.*;
import com.fundamentals.exercises.*;


public class Main {

    public static int num = 0;

    static {
        System.out.println("Static block 1");
        num = 42;
    } // End static block

    static {
        System.out.println("Static block 2");
        num = 52;
    }
    public static void main(String[] args) {

        //System.out.println("Hello Java");

        //House myHouse = new House();
        //lesson5Examples();
        //lesson5Exercises();
        //lesson6Examples();
        //lesson6Exercises();
        //lesson7Examples();
        //lesson7Exercises();
        //lesson8Examples();
        //lesson8Exercises();
        //lesson9Examples();
        //lesson9Exercises();
        //lesson10Examples();
        //lesson11Examples();
        //lesson13Examples();
        //lesson14Example();
        //lesson14Exercises();
        //lesson15Examples();
        //lesson16Examples();
        //lesson16Exercises();
        //lesson17Examples();
        //lesson17Exercises();
        lesson18Examples();
    } // end main method

    public static void lesson18Examples() {
        Lesson18 myLesson18 = new Lesson18();
        //myLesson18.exampleException();
        myLesson18.myArrayException();
    }

    public static void mylesson17Exercises() {
        Lesson17Exercises myLesson17Exercises = new Lesson17Exercises();
        myLesson17Exercises.televisions();
        myLesson17Exercises.houses();
    }

    public static void lesson17Examples() {
        Lesson17 myLesson17 = new Lesson17();
        //myLesson17.exampleArrayList1();
        //myLesson17.exampleArrayList2();
        //myLesson17.exampleHashSet();
        myLesson17.exampleHashMap();
    }

    public static void lesson16Exercises() {
        Lesson16Exercises myLesson16Exercises = new Lesson16Exercises();
        myLesson16Exercises.myFavoriteGenre(Lesson16Exercises.movieGenres.COMEDY);
    }

    public static void lesson16Examples() {
        Lesson16 myLesson16 = new Lesson16();
        myLesson16.showEnum();
        myLesson16.myFavoriteFlavor(Lesson16.IceCreamFlavors.ROCKY_ROAD);

        DaysOfTheWeek d1[] = DaysOfTheWeek.values();
        for(DaysOfTheWeek day: d1) {
            System.out.println(day +" at index "+day.ordinal());
        }

        DaysOfTheWeek d3 = DaysOfTheWeek.WED;
        d3.enumMethod();

        Lesson16Lab[] labs = Lesson16Lab.values();

        for(Lesson16Lab lab : labs) {
            System.out.println("Labrador Color: "+lab.name() + " registration code: "+
                    lab.getAction());
        }
    }

    public static void lesson15Examples() {
        int[] myInt = {1,2,3,4};
        int myWaterBirdCount = 12;
        Lesson15Base myBase = new Lesson15Sub(10,myInt,"turned off");
        Lesson15Sub mySub = new Lesson15Sub(10,myInt,"turned one");
        mySub.receiveCall();
        mySub.takePicture();
        WaterBirds myWaterBirds = new Duck(12);
        Duck myDuck = new Duck(12);
        WaterBirds myOtherWaterBirds = new Goose(15);
        Goose myGoose = new Goose(15);
        myDuck.drinksWater();
        myGoose.eatsFish();
        myDuck.birdsFlyAway();
        myGoose.birdsFlyAway();
    }
    public static void lesson14Exercises() {
        Lesson14Exercises.ohmsLawV(25, 4);
        Lesson14Exercises.ohmsLawR(100, 4);
        Lesson14Exercises.ohmsLawI(100, 25);
    }


    public static void lesson14Example() {
        // Can not change value of a final
        //Lesson14.MY_FIRST_FINAL = 10;

        int total = Lesson14.MY_FIRST_FINAL * 35; //2145 * 35
        System.out.println(total);

        //Can change value of a non-final static
        Lesson14.myFirstStatic = 98; //Originally was 25
        System.out.println(Lesson14.myFirstStatic);

        Lesson14.myFirstStaticMethod(10);

        System.out.println("Block number was " +num);
    }

    public static void lesson13Examples() {
        House myHouse = new House("blue");
        Condo myCondo = new Condo("medium");
        Dog myDog = new Dog();
        Puppy myPuppy = new Puppy();
        myHouse.doorOpenClose(myHouse.getDoorColor());
        myCondo.doorOpenClose(myCondo.getDoorColor());
        myDog.dogShake();
        myDog.dogShake("husky");
        myPuppy.dogShake();

        House myNewHouse = new Condo();
        myNewHouse.doorOpenClose();

    }

    public static void lesson11Examples() {
       House myHouse = new House();
       House myOtherHouse = new House("Red");
       Dog myDog = new Dog();
       Dog myOtherDog = new Dog("mutt");
       Television myTelevision = new Television(70, 400, 3, true);
       myTelevision.turnOn();
    }


    public static void lesson10Examples() {
        Lesson10 myLesson10 = new Lesson10();
        //myLesson10.myMethod(); //method is private
        Lesson10Ext myExt = new Lesson10Ext();
        //myLesson10.myDefaultMethod(); // Method is default, outside this package
        myExt.methodFromOtherClass();
        //myLesson10.myProtectedMethod(); // method is protected and is not subclassed and outside this package.
    }

    public static void lesson9Exercises() {
        Lesson9Exercises myLesson9Exercises = new Lesson9Exercises();
        myLesson9Exercises.iceCreamArray();
        myLesson9Exercises.scores2019Chiefs();
    }

    public static void lesson9Examples() {
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();
    }

    public static void lesson8Exercises() {
        Lesson8Exercises myLesson8Exercises = new Lesson8Exercises();
        myLesson8Exercises.compareTwoStrings("Good Morning","Good Morning");
        myLesson8Exercises.charSwitchStatement('E');
        myLesson8Exercises.forLoopModulus();
    }

    public static void lesson8Examples() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,5);
        myLesson8.basicIfElseExample(12,17);
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(108);
        myLesson8.basicSwitchExample(2);
        myLesson8.basicWhileExample();
        myLesson8.basicDoWhileExample();
        myLesson8.basicForLoopExample();
        myLesson8.basicBranchExample();
    }

    public static void lesson7Examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        //myLesson7.addTwoNumber();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
    }
    public static void lesson7Exercises() {
        Lesson7Exercises myLesson7Exercises = new Lesson7Exercises();
        myLesson7Exercises.exerciseModulus(50);
        myLesson7Exercises.exerciseDoubleData(45.658, 2.87);
        myLesson7Exercises.exerciseMysteryMath();
    }
    public static void lesson6Examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleEquals("Happy");
        String myStr1 = myLesson6.exampleLowercase();
        System.out.println(myStr1);
        System.out.println(myLesson6.exampleUppercase());
        myLesson6.exampleLength();
        myLesson6.exampleBuilder("pizza", 3);
        myLesson6.exampleChar();
        myLesson6.exampleEscape();
    } // end method lesson6Examples

    public static void lesson5Examples() {
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10,15);
        int value = myLesson5.showLocalWithReturn(25,19);
        System.out.println(value);
        System.out.println(myLesson5.showLocalWithReturn(5,8));
        myLesson5.showInstanceVariable();
        myLesson5.showConversions();
    } // end lesson5Example method

    public static void lesson5Exercises() {
        Lesson5Exercises myLesson5Exercises = new Lesson5Exercises();
        myLesson5Exercises.showNumber();
        myLesson5Exercises.showConversions();

    }

    public static void lesson6Exercises() {
        Lesson6Exercises myLesson6Exercises = new Lesson6Exercises();
        String myStr1 = myLesson6Exercises.exampleLowercase();
        System.out.println(myStr1);
        myLesson6Exercises.exampleChar();
        myLesson6Exercises.exampleBuilder();
    }



} // end class