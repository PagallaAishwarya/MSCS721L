package com.MARIST;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RoomShedulerTest3 {

	@Test
	public void testremoveRoom() {
		Room r0 = new Room("011",4);
		ArrayList<Room> rooms = new ArrayList<Room>();
		RoomSheduler r1 = new RoomSheduler();
		r1.addRoom(rooms);
		String result = r1.removeRoom(rooms);
		org.junit.Assert.assertEquals("Room '011'removed successfully! ",result);
	}

}
