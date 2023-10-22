/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sems3;

/**
 *
 * @author EKA
 */
public class circle {
    public double r;

    public circle(double r) {
        this.r = r;
    }
    
    public static void main(String[] args) {
        circle circle = new circle(2.5);
        System.out.println("Radius : "+circle.r);
        System.out.println("Area : " +PHI * circle.r * circle.r);
    }
    private static final double PHI = 3.14;
}
