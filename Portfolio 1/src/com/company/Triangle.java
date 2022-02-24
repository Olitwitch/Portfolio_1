package com.company;

import java.util.Scanner;

public class Triangle extends Shape {
    public static void main(String[] args) {
        new Triangle().getData();
    }
    public void area(){
        area = (0.5* length * breadth);
        System.out.println("Area is " + area);
    }
    public void circumference(){
        //circumference = a + b + c;
        //System.out.println("Circumference is " + circumference);
    }
}
