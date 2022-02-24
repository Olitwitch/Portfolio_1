package com.company;

import java.util.Scanner;

public class Circle extends Shape{
    public static void main(String[] args) {
        new Circle().getData();
    }

    public void area(){
        area = (radius * radius) * Math.PI;
        System.out.println("Area is " + area);
    }
    public void circumference(){
        circumference = (Math.PI * 2) * radius;
        System.out.println("Circumference is " + circumference);
    }
}
