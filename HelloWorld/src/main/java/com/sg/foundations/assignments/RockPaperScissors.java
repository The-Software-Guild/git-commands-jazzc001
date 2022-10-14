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
    public static final int MIN = 1;
    public static final int MAX = 10;
    public static void main(String[] args) {
        String[] result = {"tie", "user win", "computer win"};
        String[] rps = {"Rock", "Paper", "Scissors"};
        int userChoice;
        int robotChoice;
        int userChoiceIndx;
        int robotChoiceIndx;
        
        int round;
        
        Scanner answer = new Scanner(System.in);
        Random robot = new Random();
        
        System.out.println("How many round do you want to play? Maximum: 10, Minimum: 1");
        round = Integer.parseInt(answer.nextLine());
        
        while (round >= MIN && round < MAX) {
            System.out.println("What is your choice? 1:Rock, 2:Paper or 3:Scissors?");
            userChoice = Integer.parseInt(answer.nextLine());
            robotChoice = robot.nextInt(3) + 1;
            userChoiceIndx = userChoice -1;
            robotChoiceIndx = robotChoice -1;
            
            System.out.println(resultsComparison(robotChoice, userChoice, result));
            
            System.out.println("Robot choice is :" + rps[robotChoiceIndx]);
            
            System.out.println("Your choice is :" + rps[userChoiceIndx]);
            
            
            
            round--;
            
        }        
    }
    /*
        This is the logic to compare the robotChoice and user Choice
        parameters: int choice1, int choice2, String[] result
        return: 
    */
    public static String resultsComparison(int choice1, int choice2, String[] result) {
        
            if (choice1 == choice2 ) {
                return result[0];
            } else if (choice1 == 1 && choice2 == 2) {
                return result[2];
            } else if (choice1 == 2 && choice2 == 3) {
                return result[2];
            } else if (choice1 == 3 && choice2 == 1) {
                return result[2];
            } else {
                return result[1];
            }
    }
}
