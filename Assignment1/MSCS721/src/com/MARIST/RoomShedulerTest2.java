package com.MARIST;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RoomShedulerTest2 {

	@Test
	public void testRemoveRoom() {
		Room r0 = new Room("011",4);
		ArrayList<Room> rooms = new ArrayList<Room>();
		RoomSheduler r1 = new RoomSheduler();
		String result = r1.removeRoom(rooms);
		org.junit.Assert.assertEquals("Invalid Room",result);		
	}

}
