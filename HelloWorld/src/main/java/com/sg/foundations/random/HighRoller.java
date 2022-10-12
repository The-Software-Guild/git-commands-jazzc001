/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.random;

import java.util.Random;

/**
 *
 * @author jasminecheung
 */
public class HighRoller {
    public static void main(String[] args) {
        Random diceRoller = new Random();
        
        int rollResult = diceRoller.nextInt(6) + 1;
        
        System.out.println("TIME TO ROOOOOOLL THE DICEC!");
        System.out.println("I rolled a " + rollResult);
        
        if (rollResult == 1) {
            System.out.println("You rolled a critical failure");
        }
    }
}
