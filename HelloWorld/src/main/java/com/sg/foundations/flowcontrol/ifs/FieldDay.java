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
public class FieldDay {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        String lastName;
        String team = "";
        String a = "baggins";
        String b = "dresden";
        String c = "howl";
        String d = "potter";
        String e = "vimes";
        
        
        System.out.println("What's your last name?");
        lastName = answer.nextLine().toLowerCase();
        if (lastName.compareTo(e) >= 0) {
            team = "Black Holes";
        } else if (lastName.compareTo(e) < 0 && lastName.compareTo(d) >=0) {
            team = "Night Guards";
        } else if (lastName.compareTo(d) < 0 && lastName.compareTo(c) >=0) {
            team = "Golden Snitches";
        } else if (lastName.compareTo(c) < 0 && lastName.compareTo(b) >=0) {
            team = "Moving Castles";
        } else if (lastName.compareTo(b) < 0 && lastName.compareTo(a) >=0) {
            team = "Dark Wizards";
        } else if (lastName.compareTo(a) < 0) {
            team = "Red Dragons";
        }
        
        System.out.println("Aha! You're on the team "+team+"!");
        System.out.println("Good luck in the games!");
    }
}
