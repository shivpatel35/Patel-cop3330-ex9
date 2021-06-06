package org.example;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        final float one_gal = 350;

        //Scanner declaration for user input
        Scanner l = new Scanner(System.in);
        Scanner w = new Scanner(System.in);

        //Statement for user input of length and width
        System.out.println("What is the length of the room in feet?");
        int length = l.nextInt();

        System.out.println("What is the width of the room in feet?");
        int width = w.nextInt();

        float area = length * width;
        float gallons_needed = area/one_gal;

        System.out.println("You will need to purchase " + Math.ceil(gallons_needed) + " gallons to cover " + area + " square feet.");


    }
}
