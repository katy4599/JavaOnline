package com.fundamentals.exercises;

public class Television {
    private int screenSize;
    private int price;
    private int ports;
    private boolean isMountable;
    //private turnOn();

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int setPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public boolean isMountable() {
        return isMountable;
    }

    public void setMountable(boolean mountable) {
        isMountable = mountable;
    }

    public void turnOn() {
        System.out.println("The tv is turned on.");
    }
    public Television(int screenSize, int price, int ports, boolean isMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.ports = ports;
        this.isMountable = isMountable();
        System.out.println("The tv cost $" + price);
    }


}
