/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author jasminecheung
 */
public class StayPositive {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Counting down...");
        while(num >=0) {
            System.out.println(num);
            num --;
        }
        System.out.println("Blast off!");
    }
}
