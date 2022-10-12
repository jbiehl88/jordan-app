package com.jordan.Example1;

public class WashingMachine {
    public void switchOn() {
        System.out.println("The washing machine is on!");
    }
    public void acceptClothes(int numOfClothes) {
        System.out.println(numOfClothes + " pieces of clothing have been added to the washing machine.");
    }
    public void acceptDetergent(){
        System.out.println("Detergent has been added to the washing machine.");
    }
    public void switchOff() {
        System.out.println("The washing machine is off!");
    };

    public static void main (String [] args) {
        WashingMachine laundry = new WashingMachine();
        laundry.switchOn();
        laundry.acceptClothes(5);
        laundry.acceptDetergent();
        laundry.switchOff();
    }

}
