package com.demo;

import java.util.HashSet;
import java.util.Set;

public class ArraysExample {
    static{
        System.out.println("Inside static block.....");
    }
    public ArraysExample(){
        System.out.println("Inside constructor......");
    }

    /**
     * Method to remove duplicates in an Array
     */
    public void removeDuplicateElements(){
        int[] intArr = {10,20,10,30,40,50,60,50,90,100,80,100};
        Set<Integer> intSet = new HashSet<Integer>();
        for(int x : intArr){
            if(!intSet.add(x)){
                System.out.println("Duplicate element is:= "+x);
            }
        }
    }

    public static void main(String[] args) {
        ArraysExample example = new ArraysExample();
        example.removeDuplicateElements();
    }
}
