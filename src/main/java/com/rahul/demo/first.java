package com.rahul.demo;
import org.apache.commons.lang3.StringUtils;
public class first {
    public int countWords(String words){
        String separatewords[] = StringUtils.split(words,' ');
        return (separatewords==null)?0:separatewords.length;
    }
    public first() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	first app = new first();
    int count = app.countWords("i have an apple");
    System.out.println("number of words is: "+count);
    }
}