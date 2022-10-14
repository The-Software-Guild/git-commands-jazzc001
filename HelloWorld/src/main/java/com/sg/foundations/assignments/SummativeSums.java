/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.assignments;



/**
 *
 * @author jasminecheung
 * email: jazzcheung212@gmail.com
 * date: 14/10/2022
 * purpose:
   Write a static method that takes in an array of ints, adds them together, and returns the result.
 */
public class SummativeSums {
    public static void main(String[] args) {
        int[] arr1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] arr2 = { 999, -60, -77, 14, 160, 301 };
        int[] arr3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
        140, 150, 160, 170, 180, 190, 200, -99 };
        int[][] allArr = {arr1, arr2, arr3};
        
        int[] sum = new int[3];
        for (int i = 0; i < allArr.length; i++ ) {
            for (int j = 0; j < allArr[i].length; j++ ) {
            sum[i] += allArr[i][j];
            }
            System.out.println("#" + (i+1) + " Array Sum: " + sum[i]);
        }
        
        
    }
}
