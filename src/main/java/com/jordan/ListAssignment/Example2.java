package com.jordan.ListAssignment;
import java.util.*;
//Write a Java program of swap two elements in an array list

public class Example2 {
        public static void main (String[]args) {
            ArrayList<Integer> newAL = new ArrayList<Integer>();
    
            newAL.add(new Integer(8));
            newAL.add(new Integer(404));
            newAL.add(new Integer(505));
            newAL.add(new Integer(1));
            newAL.add(new Integer(999));
    
            System.out.println("Before swap: " + newAL);
    
            Collections.swap(newAL, 0, 3);
            
            System.out.println("After swap: " + newAL);
        }
    }
