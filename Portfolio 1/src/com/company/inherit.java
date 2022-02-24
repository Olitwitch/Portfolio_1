package com.company;

import java.util.Scanner;

public class inherit extends Shape {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rectangle/Triangle = (x, x, 0)\nCircle = (0, 0, x)");
        System.out.println("1. Area og Triangle\n2. Area of Rectangle\n3. Area of Circle");
        ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("The Area of the Triangle is");
                Triangle triangle = new Triangle();
                triangle.getData();
                triangle.area();
                System.out.println("The Circumference of the Triangle is");
                //triangle.circumference;
                break;
            case 2:
                System.out.println("The Area of the Rectangle is");
                Rectangle rectangle = new Rectangle();
                rectangle.getData();
                rectangle.area();
                System.out.println("The Circumference of the Rectangle is");
                rectangle.circumference();
                break;
            case 3:
                System.out.println("The Area of the Circle is");
                Circle circle = new Circle();
                circle.getData();
                circle.area();
                System.out.println("The Circumference of the Circle is");
                circle.circumference();

                break;
        }
    }







}
