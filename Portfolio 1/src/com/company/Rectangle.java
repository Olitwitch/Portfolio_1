package com.company;

import java.util.Scanner;

public class Rectangle extends Shape {
    public static void main(String[] args) {
        new Rectangle().getData();
    }

    public void area(){
        area = length * breadth;
        System.out.println("Area is " + area);
    }
    public void circumference(){
        circumference = 2 * (length + breadth);
        System.out.println("Circumference is " + circumference);
    }
}
