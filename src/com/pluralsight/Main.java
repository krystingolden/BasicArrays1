package com.pluralsight;

public class Main {
    /*
    https://programmingbydoing.com/
    Basic arrays 1 - Assignment #139
     */

    public static void main(String[] args) {

        Integer[] integers = new Integer[10];

        int index;

        for (index = 0; index < integers.length; index++){
            integers[index] = -133;
            System.out.println("Slot " + (index + 1) + " contains a " + integers[index]);
        }


    }
}
