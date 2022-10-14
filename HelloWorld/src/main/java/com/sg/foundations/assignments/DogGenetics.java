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
 * Ever heard of those places that you can mail in some of your dogs hair, 
 * and they’ll send back a report after doing a genetic analysis on it to tell 
 * you what kind of dogs are in your most believe pet’s ancestry
 */
public class DogGenetics {
    public static void main(String[] args) {
       Scanner answer = new Scanner(System.in);
       Random randBreed = new Random();
       
       String name;
       String[] breed  = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
       final int BREEDTOTAL = 100;
       int firstNum, secondNum, thirdNum, forthNum, fifthNum;
       thirdNum = 0;
       forthNum =0;
       fifthNum = 0;
       int[] breedNum = {thirdNum, forthNum, fifthNum};
       
       System.out.println("What is your dog's name?");
       name = answer.nextLine();
       System.out.println(name + " is:");
       
       firstNum = randBreed.nextInt(100);
       secondNum = 100 - firstNum;
       
       
       int accValue = firstNum + secondNum;
       for (int i = 0; i < breedNum.length; i++) {
           breedNum[i] = 100 - accValue;
           if (breedNum[i] < 0) {
               breedNum[i] = 0;
           } else {
               accValue += breedNum[i];
           }
       }
        
        
       System.out.println(firstNum + "% " + breed[0]);
       System.out.println(secondNum+"% " + breed[1]);
       System.out.println(breedNum[0]+"% " + breed[2]);
       System.out.println(breedNum[1]+"% " + breed[3]);
       System.out.println(breedNum[2]+"% " + breed[4]);
       
       System.out.println("Wow, that's QUITE the dog!");
       
    }
}
