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
public class TriviaNight {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        int answ1, answ2, answ3;
        
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println("");
        
        
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1) Source Code		2) Assembly Language");
        System.out.println("3) C#				4) Machine Code");
        answ1 = Integer.parseInt(answer.nextLine());
        System.out.println("");
        System.out.println("YOUR ANSWER: "+answ1);
        System.out.println("");
        
        System.out.println("SECOND QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper		2) Alan Turing");
        System.out.println("3) Charles Babbage		4) Larry Page");
        answ2 = Integer.parseInt(answer.nextLine());
        System.out.println("");
        System.out.println("YOUR ANSWER: "+answ2);
        System.out.println("");
        
        System.out.println("LAST QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1) Serenity			2) The Battlestar Galactica");
        System.out.println("3) The USS Enterprise	4) The Millennium Falcon");
        answ3 = Integer.parseInt(answer.nextLine());
        System.out.println("");
        System.out.println("YOUR ANSWER: "+answ3);
        System.out.println("");
        
        
        if (answ1 == 4 && answ2 == 2 && answ3 ==3) {
            System.out.println("Nice job - you got 3 correct!");
        } else if (answ1 == 4 && answ2 != 2 && answ3 !=3) {
          System.out.println("You have only got first question right");
        } else if (answ1 == 4 && answ2 == 2 && answ3 !=3) {
          System.out.println("You have only got last question wrong");
        } else if (answ1 != 4 && answ2 == 2 && answ3 !=3) {
          System.out.println("You have only got second question right");
        }else if (answ1 != 4 && answ2 != 2 && answ3 ==3) {
          System.out.println("You have only got third question right");
        } else if (answ1 == 4 && answ2 != 2 && answ3 ==3) {
          System.out.println("You have only got second question wrong");
        } else if (answ1 != 4 && answ2 == 2 && answ3 ==3) {
          System.out.println("You have only got first question wrong");
        } else {
            System.out.println("You have got all quesitons wrong");
        }
    }
}
