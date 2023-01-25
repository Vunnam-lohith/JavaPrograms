
import java.util.ArrayList;
import java.util.*;
 class ArrayLists {
 
    public static void main(String[] args) {
 
        // 1. List of Strings
        ArrayList<String> stringsWithCommas = new ArrayList<String>();
 
 
        // 1.1 add strings to List
        stringsWithCommas.add("Improve your Habits");
        stringsWithCommas.add("I have no idea");
        stringsWithCommas.add("The matter is clear");
        stringsWithCommas.add("You are a Glutton");
        stringsWithCommas.add("It's up to you");
 
 
        // 1.2 print to console
        System.out.println("Original List of String :- \n");
        stringsWithCommas.forEach(str -> System.out.println(str));
 
 
        // 2. count length of last word using String.length() method
        System.out.println("\n\nLength of last word :- \n");
        stringsWithCommas
        .stream() // get stream
        .map(str -> str.split("\\s")) // split & convert to String[]
        .peek(strArr -> System.out.print(strArr[strArr.length-1]))
        .map(strArr -> strArr[strArr.length-1].length()) // get length of last word
        .forEach(strLength -> System.out.println("\t\t" + strLength)); // print to console
    }
}