/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.arrays;

/**
 *
 * @author jasminecheung
 */
public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        
        for (String fruit: fruitBasket){
            if (fruit == "Orange") {
                numOranges++;
            } else if (fruit == "Apple") {
                numApples++;
            } else if (fruit != "Orange" && fruit != "Apple") {
                numOtherFruit++;
            }
        }
        
        System.out.println("Number of Apples:" + numApples);
        System.out.println("Number of Oranges:" + numOranges);
        System.out.println("Number of Other Fruit:" + numOtherFruit);
    }
}
