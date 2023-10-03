package com.maveric.hotelManagement.model;

public class Room {
    int roomNumber;
    int floor;
    Guest checkedInGuest;
    RoomType roomType;
    double pricePerDay;

    public Room(int roomNumber, int floor, Guest checkedInGuest, RoomType roomType, double pricePerDay) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.checkedInGuest = checkedInGuest;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", floor=" + floor +
                ", checkedInGuest=" + checkedInGuest +
                ", roomType=" + roomType +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
