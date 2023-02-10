package com.fundamentals.lessons;

import com.fundamentals.DaysOfTheWeek;

/*
* This class is used for Lesson 16: Enumerations
* */
public class Lesson16 {


    public enum IceCreamFlavors {
        VANILLA, CHOCOLATE, STRAWBERRY, ROCKY_ROAD
    }

    public void showEnum() {
        DaysOfTheWeek d1 = DaysOfTheWeek.TUE;
        System.out.println(d1);

        System.out.println(IceCreamFlavors.CHOCOLATE);
        System.out.println(DaysOfTheWeek.FRI);
    }

    public void myFavoriteFlavor(IceCreamFlavors flavors) {
        String message = "My favorite flavor is ";
        switch (flavors) {
            case VANILLA:
                message += "Vanilla";
                break;
            case CHOCOLATE:
                message += "Chocolate";
                break;
            case STRAWBERRY:
                message += "Strawberry";
                break;
            default:
                message += "Rocky Road";
                break;
        }
        System.out.println(message);
    }
}
