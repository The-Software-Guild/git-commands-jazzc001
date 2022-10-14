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
 * The rules of the game are as follows:
    Each player chooses Rock, Paper, or Scissors.
    If both players choose the same thing, the round is a tie.
    Otherwise:
    Paper wraps Rock to win
    Scissors cut Paper to win
    Rock breaks Scissors to win
 */
public class RockPaperScissors {
    
   
    //Initial new Scanner
    public static Scanner answer = new Scanner(System.in);
    
    public static void main(String[] args) {
        game();
        playAgain();
        System.out.println("Thanks for playing!");
    }
    /*
        This is the logic to compare the robotChoice and user Choice
        parameters: int choice1, int choice2, String[] result
        return: 
    */
    public static String resultsComparison(int choice1, int choice2, String[] resultString) {
        
            if (choice1 == choice2 ) {
                return resultString[0];
            } else if (choice1 == 1 && choice2 == 2) {
                return resultString[2];
            } else if (choice1 == 2 && choice2 == 3) {
                return resultString[2];
            } else if (choice1 == 3 && choice2 == 1) {
                return resultString[2];
            } else {
                return resultString[1];
            }
    }
    
    public static void game() {
        
         //Constant variable minimum:1 and maximum:10
        final int MIN = 1;
        final int MAX = 10;
        
        //Initiate variables and strings
        String[] rps = {"Rock", "Paper", "Scissors"};
        int userChoice;
        int robotChoice;
        int userChoiceIndx;
        int robotChoiceIndx;
        
        int tie = 0;
        int userWin = 0;
        int computerWin = 0;
        
        String[] resultString = {"tie", "userWin", "computerWin"};
        int round;
        
        
        
        
        //Initial new Random
        Random robot = new Random();
        
        System.out.println("How many round do you want to play? Maximum: 10, Minimum: 1");
        round = Integer.parseInt(answer.nextLine());
        
        while (round >= MIN && round < MAX) {
            
            //Ask for userChoice
            System.out.println("What is your choice? 1:Rock, 2:Paper or 3:Scissors?");
            
            //Store userChoice to variable userChoice
            userChoice = Integer.parseInt(answer.nextLine());
            
            // Generate random robot choice and store it to variable robotChoice
            robotChoice = robot.nextInt(3) + 1;
            
            // Store user and robot choices index variable to display result
            userChoiceIndx = userChoice -1;
            robotChoiceIndx = robotChoice -1;
            String winning = resultsComparison(robotChoice, userChoice, resultString);
            System.out.println(winning);            
            System.out.println("Robot choice is :" + rps[robotChoiceIndx]);          
            System.out.println("Your choice is :" + rps[userChoiceIndx]);
            if (winning == "tie") {
                tie++;
            } else if (winning == "userWin") {
                userWin++;
            } else {
                computerWin++;
            }
            System.out.println("Tie: " + tie );
            System.out.println("User Won: "+ userWin);
            System.out.println("Computer Won:" + computerWin);
            
            round--;
            
        }
    }
    
    public static void playAgain() {
        System.out.println("Do you want to play again? 0: yes, 1: no");
        int isAgain = Integer.parseInt(answer.nextLine());
        if (isAgain == 0) {
            game();
            playAgain();
        }
    }
    
    
}
