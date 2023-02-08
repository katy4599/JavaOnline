package com.fundamentals.lessons;
/*
* This class demonstrates a subclass of an abstract class
* */
public class Lesson15Sub extends Lesson15Base {

    public Lesson15Sub(int volume, int[] keys, String screen) {
        super(volume, keys, screen);
    }
    @Override
    public void receiveCall() {
        System.out.println("Receive a call");
    }

    @Override
    public void sendCall() {
        System.out.println("Sent a call");
    }

    @Override
    public void endCall() {
        System.out.println("Ended a call");
    }
    @Override
    public void takePicture() {
        System.out.println("Picture taken");
    }
}
