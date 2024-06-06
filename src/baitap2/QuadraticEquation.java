package baitap2;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;
//construction
    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //get/set

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getdelta(){
        return b*b - 4*a*c;
    }

    public double getRoot1(){
        return (-b - Math.sqrt(getdelta()))/(2*a);
    }

    public  double getRoot2(){
        return (-b + Math.sqrt(getdelta()))/(2*a);
    }

}


