package com.fundamentals.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson17Exercises {

    public void televisions() {
        List<String> televisions = new ArrayList<>();
        televisions.add("Samsung");
        televisions.add("Sony");
        televisions.add("JVC");
        televisions.add("TCL");

        for(int i = 0; i < televisions.size(); i++) {
            System.out.println(televisions.get(i));
        }
    }

    public void houses() {
        Map<Integer, String> myHouses = new HashMap<>();
        myHouses.put(1,"Condo");
        myHouses.put(2,"Shack");
        myHouses.put(3,"Mansion");
        myHouses.put(4,"Casa");

        for(Map.Entry<Integer,String> map : myHouses.entrySet()) {
            System.out.println(map.getKey() +" = "+map.getValue());
        }
    }
}
