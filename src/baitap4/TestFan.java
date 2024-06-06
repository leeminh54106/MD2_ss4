package baitap4;

public class TestFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(3);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);

        fan.toString();
        System.out.println(fan.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(1);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        fan2.toString();
        System.out.println(fan2.toString());
    }

}
