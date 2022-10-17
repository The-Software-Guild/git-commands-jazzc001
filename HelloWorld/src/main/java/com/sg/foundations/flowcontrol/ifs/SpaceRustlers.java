/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author jasminecheung
 */
public class SpaceRustlers {
    public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 9;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        // if statement execute "Wow, way to plan ahead! JUST enough room for all these walking hamburgers!" when cows equals to spaceships
        // else if execute the condition if the number of cows bigger than the number of spaceship, it will execute "Dangit! I don't how we're going to fit all these cows in here!"
        //if remove else from else if, in case cows < spaceship, it will not execute "Too many ships! Not enough cows."
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if(aliens > cows) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        }else if (aliens <= cows){
            System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
        }
    }
}
