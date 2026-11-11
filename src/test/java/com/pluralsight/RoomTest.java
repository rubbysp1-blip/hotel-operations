package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_markRoomOccupiedAndDirty(){
        //arrange
        Room room = new Room(2, 150.00, false, false);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkOut_shouldLeave_NotOccupiedDirtyAndNotAvailable(){
        //arrange
        Room room = new Room(2,150.00,true, true);
        //act
        room.checkOut();
        //assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    public void cleanRoom_should_MakeRoomAvailableEmptyDirtyRoom(){
        //arrange
        Room room = new Room(2,150.00,true, true);
        room.checkOut();
        //act
        room.cleanRoom();
        //assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }
}