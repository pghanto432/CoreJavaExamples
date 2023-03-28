package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Program to print maxCharacter in a String
 */
public class StringExample {
    public static void main(String[] args) {
        String str="Pradeep";
        char[] charArr = str.toCharArray();

        Map<Character,Integer> charMap = new LinkedHashMap<Character,Integer>();

        for(char c : charArr){
            if(!charMap.containsKey(c)){
                charMap.put(c,1);
            }else{
                Integer val = charMap.get(c);
                charMap.put(c,val+1);
            }
        }

        int maxCount=0;
        char maxChar=' ';

        for(Map.Entry<Character,Integer> me: charMap.entrySet()){
            if(maxCount < me.getValue()){
                maxCount = me.getValue();
                maxChar = me.getKey();
            }
        }

        System.out.println("MaxChar is:= "+maxChar+" with maxCount:= "+maxCount);
        System.out.println("################");
    }
}
