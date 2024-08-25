/*
1. Create a program that demonstrates the usage of ArrayList and LinkedList.

Add elements to the list, remove elements, and iterate over the list to display its contents.
Compare the performance of adding/removing elements in ArrayList and LinkedList.
*/

/*
Implement a program that uses HashSet, LinkedHashSet, and TreeSet.

Add a series of elements to each set and observe the order in which elements are stored.
Compare the output and note the differences in how each set maintains its elements.
*/

/*
Write a program that uses HashMap, LinkedHashMap, and TreeMap.

Store a collection of key-value pairs (e.g., names and ages).
Retrieve and display the elements from each map, observing the order of elements in each case.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

class HelloWorld {
    public static void main(String[] args) {
        // 1
        ArrayList<String> l = new ArrayList<>();
        l.add("Hi");
        l.add("There");
        l.add("I");
        l.add("am");
        l.add("learning");
        l.add("java");
        System.out.println("List: " + l);
        l.remove("There");
        System.out.println("After removed: " + l);
        
        // 2
        LinkedHashSet<String> h = new LinkedHashSet<>();
        h.add("1");
        h.add("3");
        h.add("2");
        System.out.println("HashSet: " + h);
        
        // 3
        LinkedHashMap<String, Integer> h2 = new LinkedHashMap<>();
        h2.put("c", 3);
        h2.put("a", 2);
        h2.put("t", 1);
        System.out.println("HashMap: " + h2);
        
    }
}
