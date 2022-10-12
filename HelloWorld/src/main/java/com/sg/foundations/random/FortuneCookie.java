/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.random;

import java.util.Random;

/**
 *
 * @author jasminecheung
 */
public class FortuneCookie {
    
    
    
    public static void main(String[] args) {
        Random randomizer = new Random();
        String[] messages = {"Those aren't the droids you're looking for.",
            "Never go in against a Sicilian when death is on the line!",
            "Goonies never say die.",
            "With great power, there must also come — great responsibility.",
            "Never argue with the data.",
            "Try not. Do, or do not. There is no try.",
            "You are a leaf on the wind, watch how you soar.",
            "Do absolutely nothing, and it will be everything that you thought it could be.",
            "Kneel before Zod.", "Make it so."};
        
        int randomNumber = randomizer.nextInt(messages.length);
        
        System.out.println("Your Geek Fortune: "+ messages[randomNumber]);
    }
}
