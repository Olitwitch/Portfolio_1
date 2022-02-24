package com.company;

import java.util.Scanner;

abstract class Shape {
    double length = 0;
    double breadth = 0;
    double radius = 0;
    double area;
    double circumference;


    public void getData(){
        System.out.println("Enter values");
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        radius = sc.nextDouble();

    }
    public void area(){

    }
    public void circumference(){

    }




}
