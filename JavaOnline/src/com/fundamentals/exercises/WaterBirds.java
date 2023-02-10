package com.fundamentals.exercises;

public abstract class WaterBirds implements MovementInterface {

    private int waterBirdCount;

    public WaterBirds(int waterBirdCount){
        this.waterBirdCount = waterBirdCount;
    }

    public int getWaterBirdCount() {
        return waterBirdCount;
    }

    public void birdsFlyAway() {
        System.out.println("The birds flew away");
    }

    public abstract void drinksWater();
    @Override
    public abstract void eatsFish();
}
