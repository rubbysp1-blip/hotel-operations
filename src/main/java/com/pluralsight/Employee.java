package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
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
        if(hoursWorked >= 40){
            return 40;
        }
        return hoursWorked;
    }

    public double getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }else {
            return 0;
        }
    }

    public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate *1.5);
    }

    public void punchIn(int time){
        this.startTime = time;
    }

    public void punchOut(int time){
        hoursWorked += time - startTime;
    }

    public void punchIn(){
        this.startTime = getCurrentTime();
    }

    public void punchOut(){
        hoursWorked += (getCurrentTime() - startTime);
    }

    public double getCurrentTime(){
        LocalDateTime time = LocalDateTime.now();
        return time.getHour() + (time.getMinute() / 60.0);
    }
}
