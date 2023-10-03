package com.maveric.hotelManagement.model;

import com.maveric.hotelManagement.util.DataHelper;

public class Hotel {
    String name;
    Room rooms[]=new Room[24];

    public Hotel(String name, Room[] rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public Guest findGuestCheckedInRoom(int roomId){

        for (Room room:rooms){
            if(room!=null && room.roomNumber==roomId && room.checkedInGuest!=null)
                return room.checkedInGuest;
        }
        return null;
        //Using 2D-array
//        Room rooms[][]= DataHelper.getAllRoomsInfo();
//        for (int i=0;i<8;i++){
//            for (int j=0;j<4;j++){
//                if(rooms[i][j]!=null && rooms[i][j].checkedInGuest!=null && rooms[i][j].roomNumber==roomId){
//                    return rooms[i][j].checkedInGuest;
//                }
//            }
//        }
//        return null;
    }

    public int getGuestCount(){
        int count=0;
        for (Room room:rooms){
            if(room!=null && room.checkedInGuest!=null)
                    count++;
        }
        return count;
        //Using 2D-array
//        Room rooms[][]= DataHelper.getAllRoomsInfo();
//        for (int i=0;i<8;i++){
//            for (int j=0;j<4;j++){
//                if(rooms[i][j]!=null && rooms[i][j].checkedInGuest!=null){
//                    count++;
//                }
//            }
//        }
//        return count;
    }

    public double getEarningToday(){
        int count=0;
        for (Room room:rooms){
            if(room!=null && room.checkedInGuest!=null)
                    count+=room.pricePerDay;
        }
        return count;
        //Using 2D-array
//        Room rooms[][]= DataHelper.getAllRoomsInfo();
//        for (int i=0;i<8;i++){
//            for (int j=0;j<4;j++){
//                if(rooms[i][j]!=null && rooms[i][j].checkedInGuest!=null){
//                    count+=rooms[i][j].pricePerDay;
//                }
//            }
//        }
//        return count;
    }

    public Guest[] findAllGuests(){
        Guest[] guests= new Guest[24];
        int index=0;
        for (Room room:rooms){
            if(room!=null && room.checkedInGuest!=null){
                    guests[index++]=room.checkedInGuest;
                }
        }
        return guests;
        //Using 2D-array
//        Room rooms[][]= DataHelper.getAllRoomsInfo();
//        for (int i=0;i<8;i++){
//            for (int j=0;j<4;j++){
//                if(rooms[i][j]!=null && rooms[i][j].checkedInGuest!=null){
//                    guests[index++]=rooms[i][j].checkedInGuest;
//                }
//            }
//        }
//        return guests;
    }
}