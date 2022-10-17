/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jasminecheung
 */
public class GuessMe {
    public static void main(String[] args) {
        Random number = new Random();
        Scanner guess = new Scanner(System.in);
        
        int max = 100;
        int min = -100;
        int numberGuessed;
        
        // random number from -100 to 100
        int numberFromBoot = number.nextInt((max - min) + 1) + min ;
        
        
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        
        
        numberGuessed = Integer.parseInt(guess.nextLine());
        System.out.println("Your guess: " + numberGuessed);
        
       for (int i = 0; i< 1; i++) {
           if (numberFromBoot > numberGuessed) {
                System.out.println("Ha, nice try - too low! I chose " + numberFromBoot);
               
            }
            else if (numberFromBoot < numberGuessed) {
                    System.out.println("Too bad, way too high. I chose " + numberFromBoot);
                    
                }
            else {
                System.out.println("Wow, nice guess! That was it!");
            }
       }
    }
            
}
