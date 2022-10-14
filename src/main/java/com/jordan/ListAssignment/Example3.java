package com.jordan.ListAssignment;

import java.util.*;

//Write a Java program to iterate through all elements in a linked 
//list starting at the specified position?

public class Example3 {
    public static void main (String[]args) {
        LinkedList<Integer> newLL = new LinkedList<Integer>();

        newLL.add(new Integer(8));
        newLL.add(new Integer(404));
        newLL.add(new Integer(505));
        newLL.add(new Integer(1));
        newLL.add(new Integer(999));

        System.out.println("Before iteration: " + newLL);

        Iterator<Integer> second = newLL.listIterator(1);
        
        while(second.hasNext()){
        System.out.println("After iteration: " + second.next());
        }
    }
}
