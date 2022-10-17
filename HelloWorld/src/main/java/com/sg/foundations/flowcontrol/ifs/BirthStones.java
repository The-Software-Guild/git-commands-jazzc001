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
public class BirthStones {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        int num;
        String birthStone = "";
        String month = "";
        String def ="";
        
        System.out.println("What month's birthstone do you want to know?");
        num = Integer.parseInt(answer.nextLine());
        
        switch (num) {
            case 1:
                month = "January";
                birthStone = "Garnet";
                break;
            case 2:
                month = "February";
                birthStone = "Amethyst"; 
                break;
            case 3:
                month = "March";
                birthStone = "Aquamarine";
                break;
            case 4:
                month = "April";
                birthStone = "Diamond";
                break;
            case 5:
                month = "May";
                birthStone = "Emerald"; 
                break;
            case 6:
                month = "June";
                birthStone = "Pearl";    
                break;
            case 7:
                month = "July";
                birthStone = "Ruby";
                break;
            case 8:
                month = "August";
                birthStone = "Peridot";  
                break;
            case 9:
                month = "September";
                birthStone = "Sapphire"; 
                break;
            case 10:
                month = "October";
                birthStone = "Opal";  
                break;
            case 11:
                month = "November";
                birthStone = "Topaz";  
                break;
            case 12:
                month = "December";
                birthStone = "Turquoise";  
                break;
            default:
                def = "I think you must be confused, "+num+" doesn't match a month.";
                
        }
        if (num <=12 ) {
            System.out.println(month+"'s birthstone is "+birthStone + ".");
        } else {
            System.out.println(def);
        }
        
    }
}
