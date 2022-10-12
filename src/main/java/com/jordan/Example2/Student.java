package com.jordan.Example2;

public class Student {
    public void average(int exam1, int exam2, int exam3) {
        int total = exam1 + exam2 + exam3;
        int avg = total / 3;
        if (avg > 50) {
            System.out.println("Student has passed");
        } else {
            System.out.println("Student did not pass");
        }
    }
    public void studentName(String name) {
        System.out.println(name);
    }

    public static void main (String [] args) {
        Student Steve = new Student();
        Steve.average(90, 80, 70);
        Steve.studentName("Steve");
    }

}
