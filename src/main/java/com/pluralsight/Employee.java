package com.pluralsight;

public class Employee {

    private double employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(double employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours(){
        return hoursWorked;
    }

    public double getOvertimeHours(){
        if(hoursWorked > 40){
            return 40 - hoursWorked;
        }else {
            return 0;
        }
    }

    public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * 1.5);
    }
}
