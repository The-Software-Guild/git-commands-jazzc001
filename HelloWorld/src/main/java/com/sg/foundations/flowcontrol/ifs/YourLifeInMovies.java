/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author jasminecheung
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        String name;
        int year;
        
        System.out.println("Hey, let's play a game! What's your name?");
        name = answer.nextLine();
        System.out.println("Ok, "+name+", when were you born?");
        year = Integer.parseInt(answer.nextLine());
        System.out.println("Well "+name+"...");
        
        if (year < 2005 ) {
            System.out.println("Pixar's 'Up' came out over a decade ago");
        }
        if (year < 1995) {
            System.out.println("the first Harry Potter came out over 15 years ago.");
        }
        if (year < 1985) {
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
        }
        if (year < 1975) {
            System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if (year < 1965) {
            System.out.println("the MASH TV series has been around for almost half a century!");
        }
        
    }
}
