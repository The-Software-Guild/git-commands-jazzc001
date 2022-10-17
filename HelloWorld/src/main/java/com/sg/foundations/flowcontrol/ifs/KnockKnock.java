/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author jasminecheung
 */
import java.util.Scanner;

public class KnockKnock {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();
        
        //== checks if both objects point to the same memory location whereas . equals() evaluates to the comparison of values in the objects.
        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
        
        //What happens if you don't type it in the right capitalization? How might you fix that?
        //use string manupliation , use '.toLowerCase()' to compare the user input to the statement
    }
}