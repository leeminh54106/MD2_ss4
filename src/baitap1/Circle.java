package baitap1;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;
    //constructor

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //phương thức tính chu vi và diện tích
    public double perimeter (){
        return 2*Math.PI*this.radius;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
