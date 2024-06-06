package batap8;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private  int employeeAge;
    private boolean sex;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int employeeAge, boolean sex, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.sex = sex;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public  void inputData(Scanner scanner){
        System.out.print("nhập id: ");
        this.employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên: ");
        this.employeeName = scanner.nextLine();
        System.out.println("nhập tuổi:");
        this.employeeAge = Integer.parseInt(scanner.nextLine());
        System.out.println("giới tính true = nam/false = nữ:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("điền năng xuất:");
        this.rate = Double.parseDouble(scanner.nextLine());
    }

    public void displayData(){
        System.out.printf("ID:%d - tên: %s - tuổi: %d \n", this.employeeId, this.employeeName, this.employeeAge);
        System.out.printf("sex: %s - rate: %.0f - lương: %.0f\n",this.sex ? "nam" : "nữ",this.rate,this.salary);
    }

    public void calsalary (){
        salary = rate * 1300000;
    }
}
