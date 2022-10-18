/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.exercise;

import java.util.Scanner;

/**
 *
 * @author jasminecheung
 */
public class Factorizer {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        int num;
        int numCount = 0;
        
        System.out.println("What number would you like to factor?");
        num = Integer.parseInt(answer.nextLine());
        
        System.out.println("The factors of "+num+" are:");
        for (int i = 1; i<=num ; ++i) {
            if (num % i == 0) {
                System.out.println( i + " ");
                numCount +=1;
            }
        }
        
        if (numCount >2) {
            System.out.println(num +" is a perfect number.");
            System.out.println(num +" is not a prime number.");
        } else {
            System.out.println(num +" is a not perfect number.");
            System.out.println(num +" is a prime number.");
        }
        
        
        
    }
}
