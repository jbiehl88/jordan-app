package com.jordan.ListAssignment;
import java.util.*;

//Write a Java program to replace an element in a linked list?

public class Example4 {
    public static void main (String[]args) {
        LinkedList<Integer> newLL = new LinkedList<Integer>();

        newLL.add(new Integer(8));
        newLL.add(new Integer(404));
        newLL.add(new Integer(505));
        newLL.add(new Integer(1));
        newLL.add(new Integer(999));

        System.out.println("Before replace: " + newLL);

        newLL.set(1, 5);
        
        System.out.println("After replace: " + newLL);
    }
}
