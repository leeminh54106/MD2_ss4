package baitap2;

public class TestQuadraticEquation {
        public static void main(String[] args) {
                QuadraticEquation eq = new QuadraticEquation();
                eq.setA(1);
                eq.setB(-2);
                eq.setC(1);
                System.out.println(eq.getdelta());
                System.out.println("nghiem 1 là " +eq.getRoot1());
                System.out.println("nghiem 2 la " +eq.getRoot2());
        }
}
