package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Room room = new Room(2, 124.00, true, true);

        System.out.println("Clean room available: " + room.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
        Reservation reservation2 = new Reservation("double", 3, false);

        System.out.printf("Reservation Total: $%.2f%n", reservation.getReservationTotal());
        System.out.printf("Reservation Total: $%.2f%n", reservation2.getReservationTotal());

        Employee employee = new Employee(1234, "Ruby", "IT", 20.00, 45);
        System.out.println("Employee Total Pay: " + employee.getTotalPay());

        Employee employee2 = new Employee(1234, "Ruby", "IT", 20.00, 20);
        System.out.println("Employee Total Pay: " + employee2.getTotalPay());
    }
}
