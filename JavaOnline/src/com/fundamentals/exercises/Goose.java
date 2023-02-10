package com.fundamentals.exercises;

public class Goose extends WaterBirds {

    public Goose(int waterBirdCount) {
        super(waterBirdCount);
    }

    /*
        public void drinksWater(int waterBirdCount) {
        System.out.println("The " + waterBirdCount + "geese, drank water.");
        }
        */

    @Override
    public void eatsFish() {
        System.out.println("Geese ate fish");
    }

    @Override
    public void drinksWater() {
        System.out.println("Birds drank water");
    }

    public void birdsFlyAway() {
        System.out.println("The geese flew away");
    }
}
