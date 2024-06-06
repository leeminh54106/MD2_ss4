package baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("nhập vào bán kính");
        c.setRadius(Double.parseDouble(sc.nextLine()));
        System.out.println("nhập màu");
        c.setColor(sc.nextLine());

        System.out.println("chu vi:" + c.perimeter());
        System.out.println("diện tích:" +c.perimeter());
        System.out.println("màu: " + c.getColor());
    }
}
