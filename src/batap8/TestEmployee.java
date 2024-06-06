package batap8;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
     emp.inputData(sc);
     emp.calsalary();
     emp.displayData();

        Employee emp1 = new Employee();
        emp1.inputData(sc);
        emp1.calsalary();
        emp1.displayData();

        Employee emp2 = new Employee();
        emp2.inputData(sc);
        emp2.calsalary();
        emp2.displayData();

        Employee emp3 = new Employee();
        emp3.inputData(sc);
        emp3.calsalary();
        emp3.displayData();

        Employee emp4 = new Employee();
        emp4.inputData(sc);
        emp4.calsalary();
        emp4.displayData();

        Employee emp5 = new Employee();
        emp5.inputData(sc);
        emp5.calsalary();
        emp5.displayData();
    }
}
