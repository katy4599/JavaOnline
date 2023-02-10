package com.fundamentals.exercises;

public class Duck extends WaterBirds {
    public Duck(int waterBirdCount) {
        super(waterBirdCount);
    }


    public void drinksWater() {
        System.out.println("Ducks drank");
    }

    @Override
    public void eatsFish() {
        System.out.println("Birds ate fish");
    }




    //public void eatsFish(int waterBirdCount) {
        //System.out.println("The " + waterBirdCount + "birds, ate fish.");
    //}


    public void birdsFlyAway() {
        System.out.println("The ducks flew away");
    }
}
