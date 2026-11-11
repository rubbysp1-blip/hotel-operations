package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchIn_should_ExpectFourHours_WhenPunchOut(){
        //arrange
        Employee employee = new Employee(12345, "Ruby", "Sales", 22.00, 0);
        //act
        employee.punchIn(10);
        employee.punchOut(14);
        //assert
        assertEquals(4, employee.getHoursWorked());
    }

    @Test
    public void punchIn_should_ExpectTenHours_WhenPunchOut(){
        //arrange
        Employee employee = new Employee(12345, "Ruby", "Sales", 22.00, 8);
        //act
        employee.punchIn(13);
        employee.punchOut(15);
        //assert
        assertEquals(10, employee.getHoursWorked());
    }
}