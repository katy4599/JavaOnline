package com.fundamentals;

public class Puppy extends Dog{
    private String name;

    public Puppy() {
        System.out.println("Default condo constructor");
    }

    public void Puppy(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sit() {
        System.out.println("The dog sat.");
    }
}

