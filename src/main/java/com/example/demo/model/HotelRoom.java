package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class HotelRoom {
    private Map<String, List<Room>> availableRooms = new HashMap<>();

    public HotelRoom() {
        initializeRooms();
    }

    private void initializeRooms() {
        String[] types = {
            "Single room", "Standard double room", "Standard twin room",
            "Deluxe double room", "Studio room", "Junior suite",
            "Executive suite", "Presidential suite"
        };

        String[] descriptions = {
            "A cozy single room with a comfortable bed, perfect for solo travelers.",
            "A standard double room with a king-size bed, suitable for couples.",
            "A standard twin room with two single beds, ideal for friends or siblings.",
            "A deluxe double room with premium furnishings and a king-size bed.",
            "A spacious studio room with a kitchenette and a comfortable seating area.",
            "A junior suite with a separate living area and a luxurious bathroom.",
            "An executive suite with an office space, living room, and premium amenities.",
            "The presidential suite offers ultimate luxury with multiple rooms and top-notch services."
        };

        int[] prices = {1000, 1500, 1800, 2000, 2200, 2500, 3000, 4000};

        for (int i = 0; i < types.length; i++) {
            List<Room> rooms = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                int roomNumber = (i + 1) * 100 + j;
                rooms.add(new Room(roomNumber, types[i], descriptions[i], prices[i], false));
            }
            availableRooms.put(types[i], rooms);
        }
    }

 // Return all rooms of a specific type (including both booked and unbooked)
    public List<Room> getRoomsByType(String type) {
        return availableRooms.getOrDefault(type, new ArrayList<>());
    }

    // Return all rooms of all categories
    public List<Room> getAllRooms() {
        List<Room> allRooms = new ArrayList<>();
        for (List<Room> rooms : availableRooms.values()) {
            allRooms.addAll(rooms);
        }
        return allRooms;
    }

    // Book a room of a specific type
    public Room bookRoom(String type) {
        List<Room> rooms = availableRooms.get(type);
        if (rooms == null || rooms.isEmpty()) {
            return null;
        }
        Room roomToBook = null;
        for (Room room : rooms) {
            if (!room.isBooked()) {
                room.setBooked(true);
                roomToBook = room;
                break;
            }
        }
        return roomToBook;
    }
}
