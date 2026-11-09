package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Room room = new Room(2, 124.00, true, true);

        System.out.println(room.isAvailable());
        System.out.println(room.isDirty());
        System.out.println(room.isOccupied());
    }
}
