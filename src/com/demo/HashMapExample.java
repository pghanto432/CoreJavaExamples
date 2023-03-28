package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> deptMap = new HashMap<>();
        deptMap.put("ACE",10);
        deptMap.put("BCE",20);
        deptMap.put("CCE",30);
        deptMap.put("DCE",40);
        deptMap.put("ECE",50);

        // CASE-1 Using forEach
        System.out.println("Using forEach loop to traverse the department Map:");
        System.out.println("###########################################");
        deptMap.forEach((key,value)->{
            System.out.println(key+"<-->"+value);
        });

        // CASE-2 Using for loop
        System.out.println("Using for loop to traverse the department Map:");
        System.out.println("###########################################");
        for(Map.Entry<String,Integer> entry : deptMap.entrySet()){
            System.out.println(entry.getKey()+"<-->"+entry.getValue());
        }

        // CASE-3 Using Iterator
        System.out.println("Using Iterator to traverse the department Map:");
        System.out.println("###########################################");
        Iterator itr = deptMap.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry<String, Integer>) itr.next();
            System.out.println(entry.getKey()+"<-->"+entry.getValue());
        }
    }
}
