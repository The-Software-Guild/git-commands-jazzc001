/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author jasminecheung
 * email: jazzcheung212@gmail.com
 * purpose:
 * John has $500 to invest. Sue knows of a mutual fund plan that pays 10% 
 * interest annually, compounded quarterly. That is, every three months, 
 * the principal is multiplied by 2.5% (the 10% annual rate divided by 4 
 * because it is compounded 4 times per year) and the result is added to 
 * the principal.
 */
public class InterestCalculator {
    public static void main(String[] args) {
        double annualIntRate, initAmt; 
        int numYear;
        double annualIntCom;
        
        Scanner questions = new Scanner(System.in);
        
        System.out.println("How much do you want to invest?");
        initAmt = Integer.parseInt(questions.nextLine());
        System.out.println("How many years are investing?");
        numYear = Integer.parseInt(questions.nextLine());
        System.out.println("What is the annual interest rate % growth?");
        annualIntRate = Integer.parseInt(questions.nextLine());
        
        annualIntCom = Math.pow((1+(annualIntRate/100)/4), 4) -1;
        DecimalFormat f = new DecimalFormat("##.00");
        
        for (int i = 1; i <= numYear; i++) {
            
            double annualInt = initAmt * annualIntCom;
            double total = annualInt + initAmt;
            
            System.out.println();
            System.out.println("Year" + i + ":");
            System.out.println("Begin with $" + f.format(initAmt));           
            System.out.println("Earned $" + f.format(annualInt));
            System.out.println("Ended with $" + f.format(total));
            System.out.println();
            initAmt = total;
            
        }
        
        
        
        
    }
    
}
