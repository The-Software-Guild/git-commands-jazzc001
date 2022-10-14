/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.assignments;

import java.util.*;


/**
 *
 * @author jasminecheung
 * email: jazzcheung212@gmail.com
 * Purpose:
 * Make a simple calculator that asks the user for their age. Then calculate 
   the healthy heart rate range for that age, and display it.
    Their maximum heart rate should be 220 - their age.
    The target heart rate zone is the 50 - 85% of the maximum.
 */
public class HealthyHearts {
    public static void main(String[] args) {
        final int MAXHR = 220;
        final int LOWERHRZONE = 50;
        final int HIGHHRZONE = 85;
        int maxHR, age, lowerBound, higherBound;
        
        Scanner answer = new Scanner(System.in);
        
        
        System.out.println("What is your age?");
        age = Integer.parseInt(answer.nextLine());
        maxHR = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute");
        lowerBound = (maxHR * LOWERHRZONE)/100;
        higherBound = (maxHR * HIGHHRZONE)/100;
        
        System.out.println("Your target HR Zone is " + lowerBound + " - " + higherBound + " beats per minute");
    }
}
