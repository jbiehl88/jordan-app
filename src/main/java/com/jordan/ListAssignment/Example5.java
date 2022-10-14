package com.jordan.ListAssignment;

import java.util.*;

public class Example5 {
    public static void main (String[]args) {
        HashSet<Integer> newHS = new HashSet<Integer>();

        newHS.add(new Integer(8));
        newHS.add(new Integer(404));
        newHS.add(new Integer(505));
        newHS.add(new Integer(1));
        newHS.add(new Integer(999));

        System.out.println("Before convert: " + newHS);

        Integer arr[] = new Integer[newHS.size()];

        Integer[] newArr = newHS.toArray(arr);
        
        System.out.println("After convert: " + Arrays.toString(newArr));
    }
}
