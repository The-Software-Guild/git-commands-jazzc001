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
public class CoinFlipper {
    public static void main(String[] args) {
        Random coinFlip = new Random();
        
        String[] coin = {"HEADS", "TAILS"};
        
        int coinResult = coinFlip.nextInt(coin.length);
        
        System.out.println("Ready, Set, Flip...!!");
        System.out.println("You got "+ coin[coinResult]);
    }
}
