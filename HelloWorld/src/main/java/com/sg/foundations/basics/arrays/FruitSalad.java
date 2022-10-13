/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.basics.arrays;

/**
 *
 * @author jasminecheung
 */
public class FruitSalad {
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad;
        
        String[] apple;
        String[] orange;
        
        String[] berry;
        
        
        for (String item: fruit) {
            if (item.contains("Apple")) {
                System.arraycopy(args, 0, item, 0, 0);
            }
        }
    }
}
