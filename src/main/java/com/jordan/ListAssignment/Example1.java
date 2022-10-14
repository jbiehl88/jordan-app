package com.jordan.ListAssignment;

import java.util.*;

//Write a Java program to reverse elements in a array list

public class Example1 {
    public static void main (String[]args) {
        ArrayList<Integer> newAL = new ArrayList<Integer>();

        newAL.add(new Integer(8));
        newAL.add(new Integer(404));
        newAL.add(new Integer(505));
        newAL.add(new Integer(1));
        newAL.add(new Integer(999));

        System.out.println("Before reverse: " + newAL);

        Collections.reverse(newAL);
        
        System.out.println("After reverse: " + newAL);
    }
}
