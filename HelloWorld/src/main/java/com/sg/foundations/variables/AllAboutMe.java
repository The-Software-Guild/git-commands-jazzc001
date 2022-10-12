/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.variables;

import java.util.Scanner;

/**
 *
 * @author jasminecheung
 */
public class AllAboutMe {
    public static void main(String[] args) {
        String name;
        String favFood;
        int numOfPets;
        String accommodation;
        boolean canWhisle;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = myScanner.nextLine();
        
        System.out.println("What is your favourite food?");
        favFood = myScanner.nextLine();
        
        System.out.println("How many pets do you have?");
        numOfPets = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("Where do you live?");
        accommodation = myScanner.nextLine();
        
        System.out.println("Can you whisle?");
//        canWhisle = myScanner.nextLine();
        
        
        
    }
}
