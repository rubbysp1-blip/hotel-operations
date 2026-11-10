package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Room room = new Room(2, 124.00, false, true);
        Room room2 = new Room(2, 124.00, false, false);
        Room room3 = new Room(2, 124.00, true, false);

        System.out.println("Clean room available: " + room.isAvailable());
        System.out.println("Clean room available: " + room2.isAvailable());
        System.out.println("Clean room available: " + room3.isAvailable());

        Room room4 = new Room(2, 124.00, false, false);
        System.out.println("Room 4 availability: " + room4.isAvailable());

        room4.checkOut();
        System.out.println("Availability of Room 4: " + room4.isAvailable());

        Reservation reservation = new Reservation("king", 3, true);
        Reservation reservation2 = new Reservation("double", 3, false);

        System.out.printf("Reservation Total: $%.2f%n", reservation.getReservationTotal());
        System.out.printf("Reservation Total: $%.2f%n", reservation2.getReservationTotal());

        Employee employee = new Employee(1234, "Ruby", "IT", 20.00, 45);
        System.out.printf("Employee Total Pay (45 hrs): $%.2f%n", employee.getTotalPay());

        Employee employee2 = new Employee(1234, "Ruby", "IT", 20.00, 20);
        System.out.printf("Employee Total Pay (40 hrs): $%.2f%n", employee2.getTotalPay());
    }
}
