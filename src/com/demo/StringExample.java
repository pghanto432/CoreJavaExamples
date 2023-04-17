package com.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringExample {

    /**
     * ######### METHOD-1 :: To print max character in a String
     */
    public static void printMaxCharInString() {
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

        System.out.println("MaxChar in given String:= "+str+" is := "+maxChar+" with maxCount:= "+maxCount);
        System.out.println("################");
    }


    /**
     * ######### METHOD-2 :: To print the String in reverse order with exact spaces
     * @param
     */

    public static void printStringInReverseOrderWithSpaces() {
        String str = "abcd efgh";
        StringBuffer sb = new StringBuffer(str.replaceAll(" ",""));
        sb.reverse();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.insert(i, " ");
            }
        }
        System.out.println("Given String:= "+str+"\nReversed String:="+sb);
    }

    /**
     * ######### METHOD-3 :: Find the non-repeated character in the String
     */
    public static void printNonRepeatedCharInString(){
        String str = "Java Hungry Blog Alive Is Awesome";
        Character result = str.chars()
                .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()==1L)
                .map(entry->entry.getKey())
                .findFirst()
                .get();

        System.out.println("Non Repeating Character is:= "+ result);
    }

    public static void main(String[] args) {
        printMaxCharInString();
        printStringInReverseOrderWithSpaces();
        printNonRepeatedCharInString();
    }
}
