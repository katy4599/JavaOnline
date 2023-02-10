package com.fundamentals.lessons;

import com.fundamentals.House;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/*
*The java.util.* should not be used in favor of individual imports due to memory limitations.
* You don't need imports of classes you will never use.
* This class goes over Lesson 17: Collections Framework
* */
public class Lesson17 {

    // This method will show an ArrayList of String
    public void exampleArrayList1() {
        List<String>  list = new ArrayList<>();
        list.add("Happy");
        list.add("Friday");
        list.add("Not Monday");
        list.add("Where\'s Saturday");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    // This method will show an ArrayList of House
    public void exampleArrayList2() {
        ArrayList<House> myHouses = new ArrayList<>();
        myHouses.add(new House("red"));
        myHouses.add(new House("green"));
        myHouses.add(new House("blue"));
        myHouses.add(new House("white"));

        for(int i = 0; i < myHouses.size(); i++) {
            System.out.println(myHouses.get(i).getDoorColor());
        }
    }

    // This method will show a HashSet example
    public void exampleHashSet() {
        HashSet<String> myHash = new HashSet<>();
        myHash.add("Firecrackers");
        myHash.add("Sparklers");
        myHash.add("Fountains");

        Iterator<String> iterate = myHash.iterator();
        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }

    // This method will show a map example
    public void exampleHashMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(10,"Happy");
        myMap.put(20,"Days");
        myMap.put(30,"Are Here");
        myMap.put(40,"Happy");

        for(Map.Entry<Integer,String> map : myMap.entrySet()) {
            System.out.println(map.getKey() +" = "+map.getValue());
        }
    }
}
