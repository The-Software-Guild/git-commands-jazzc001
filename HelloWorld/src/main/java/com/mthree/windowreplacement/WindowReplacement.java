/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mthree.windowreplacement;

import java.util.Scanner;

/**
 *
 * @author jasminecheung
 * @email jazzcheung212@gmail.com
 * date: 12/10/2022
 * purpose: Window Master Exercise 
 */
public class WindowReplacement {
    
    public static void main(String[] args) {
    //declare the string variable for height and width
    float height;
    float width;
    
    //declare and initialize String (text) variables to hold the
    //value that the user types in - the Console only accepts
    //text, it know nothing about numbers;
    String heightConsole;
    String widthConsole;
    
    //declare other variables
    float areaOfWindow;
    float cost;
    float perimeterOfWindow;
    
    
    //delare and initilaize a Scanner object - the Scanner reads
    //input from the console
    Scanner myScanner = new Scanner(System.in);
    
    // ask the user to input the height;
    System.out.println("Please enter window height: ");
    
    //assign the window height to heightConsole
    heightConsole = myScanner.nextLine();
    System.out.println("Please enter window width: ");
    widthConsole = myScanner.nextLine();
    
    //convert the string to height and width to float values
    height = Float.parseFloat(heightConsole);
    width = Float.parseFloat(widthConsole);
    
    //calculate the area of the Window
    areaOfWindow = height * width;
    
    //calculate the perimeter of the window
    perimeterOfWindow = 2*(height + width);
    
    //calculate the cost of the Window
    cost = (3.50f * areaOfWindow) + (2.25f * perimeterOfWindow);
    
    
    //display the results to the user
    System.out.println("Window height =" + heightConsole);
    System.out.println("Window width =" + widthConsole);
    System.out.println("Window area =" + areaOfWindow);
    System.out.println("Window perimeter =" + perimeterOfWindow);
    System.out.println("Total Cost =" + cost);
    
    }
    
    
    
}
