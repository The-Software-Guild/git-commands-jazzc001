/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.exercise;

import java.util.*;

/**
 *
 * @author jasminecheung
 * email: jazzcheung212@gmail.com
 * The rules of the game are:
    Each round, the program rolls a virtual pair of dice for the user.
    If the sum of the two dice is equal to 7, the player wins $4; otherwise, the player loses $1. 
 * 
 */
public class LuckySevens {
    public static void main(String[] args) {
        Scanner questions = new Scanner(System.in);
        Random rollDice = new Random();
        int initDollars;
        int numBet = 0;
        int maxTotal = 0;
        int maxRoll = 0;
        
        
        
        System.out.println("How many dollars do you have?");
        initDollars = Integer.parseInt(questions.nextLine());
        while (initDollars >0) {
            int result1 = rollDice.nextInt(6)+1;
            int result2 = rollDice.nextInt(6) +1;
            int sum = result1 + result2;
            if (sum == 7) {
                initDollars +=4;
            } else {
                initDollars -=1;
            }
            numBet++;
            if (initDollars > maxTotal) {
                maxTotal = initDollars;
            }
            
            if (maxTotal == initDollars) {
                maxRoll = numBet;
            }
        }
        System.out.println("You are broke after"+numBet+"rolls.");
        System.out.println("You should have quit after " + maxRoll + " rolls when you had $" + maxTotal + ".");
        
        
        
    }
}
