package com.maveric.hotelManagement.util;

import com.maveric.hotelManagement.model.Guest;
import com.maveric.hotelManagement.model.Room;
import com.maveric.hotelManagement.model.RoomType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataHelper {
    private static Room[][] rooms=new Room[8][4];

    static {
        rooms[0][0]=new Room(101,1,
                new Guest(1,"Karthik","Kante","kkk@gmail.com"),
                RoomType.NORMAL,2000);
        rooms[0][2]=new Room(103,1,
                new Guest(2,"Mahesh","Karri","mahesh@gmail.com"),
                RoomType.DELUXE,4000);
        rooms[1][0]=new Room(201,2,
                new Guest(3,"Sampath","Kondapuram","sampath@gmail.com"),
                RoomType.NORMAL,2000);
        rooms[1][1]=new Room(202,2,
                new Guest(4,"Asish","Gopan","asish@gmail.com"),
                RoomType.DELUXE,2000);
        rooms[2][2]=new Room(303,3,
                new Guest(5,"Amaresh","Giri","giri@gmail.com"),
                RoomType.NORMAL,2000);
        rooms[7][1]=new Room(701,7,
                new Guest(6,"Govind","P","govind@gmail.com"),
                RoomType.DELUXE,3000);
    }

    public static Room[][] getAllRoomsInfo(){
        return rooms;
    }

    public static List<Integer> getAvailableRoomsNumbers(){
        List<Integer> availableRooms=new ArrayList<>();
        for (int i=0;i<8;i++){
            for (int j=0;j<4;j++){
                if(rooms[i][j]==null)
                    availableRooms.add(getRoomNumber(i,j));
            }
        }
        return availableRooms;
    }

    public static List<Integer> getFilledRoomsNumers(){
        List<Integer> filledRooms=new ArrayList<>();
        for (int i=0;i<8;i++){
            for (int j=0;j<4;j++){
                if(rooms[i][j]!=null)
                    filledRooms.add(getRoomNumber(i,j));
            }
        }
        return filledRooms;
    }

    public static void checkOutHotel(int checkOutRoom){

        if(checkValidRoomOrNot(checkOutRoom)){
            rooms[(checkOutRoom/100)-1][(checkOutRoom%100)-1]=null;
            System.out.println("Checked Out Successfully...");
        }else
            System.out.println("InValid Room Number");
    }
    private static Integer getRoomNumber(int i, int j) {
        return 100*(i+1)+(j+1);
    }

    public static void printAllRoomsInfo(){
       for (int i=0;i<8;i++){
           for (int j=0;j<4;j++){
               System.out.printf(rooms[i][j]+"\t\t");
           }
           System.out.println();
       }
    }

    public static boolean checkValidRoomOrNot(int checkOutRoom) {
        if(checkOutRoom>=101&&checkOutRoom<104||checkOutRoom>=201&&checkOutRoom<204||
                checkOutRoom>=301&&checkOutRoom<304||checkOutRoom>=401&&checkOutRoom<404||
                checkOutRoom>=501&&checkOutRoom<504||checkOutRoom>=601&&checkOutRoom<604||
                checkOutRoom>=701&&checkOutRoom<704||checkOutRoom>=801&&checkOutRoom<804)
            return true;
        else
            return false;
    }

    public static void checkInHote(int checkinRoom) {
        Optional<Integer> res=getAvailableRoomsNumbers().stream()
                .filter(roomNum->roomNum==checkinRoom)
                .findFirst();
        if (res.get()!=0 && rooms[(res.get()/100)-1][(res.get()%100-1)]==null){
            rooms[(res.get()/100)-1][(res.get()%100-1)]=new Room(501,5,
                    new Guest(7,"Suresh","Marekanam","suresh@gmail.com"),
                    RoomType.DELUXE,3000);
            System.out.println("Successfull");
        }
        else
            System.out.println("Entered Wrong Room Number");
    }

    public static Room[] getRooms(){
        Room[] rooms=new Room[24];
        rooms[0]=new Room(101,1,
                new Guest(1,"Karthik","Kante","kkk@gmail.com"),
                RoomType.NORMAL,2000);
        rooms[5]=new Room(103,1,
                new Guest(2,"Mahesh","Karri","mahesh@gmail.com"),
                RoomType.DELUXE,4000);
        rooms[15]=new Room(201,2,
                new Guest(3,"Sampath","Kondapuram","sampath@gmail.com"),
                RoomType.NORMAL,2000);
        rooms[17]=new Room(202,2,
                new Guest(4,"Asish","Gopan","asish@gmail.com"),
                RoomType.DELUXE,2000);
        rooms[20]=new Room(303,3,
                new Guest(5,"Amaresh","Giri","giri@gmail.com"),
                RoomType.NORMAL,2000);
        rooms[22]=new Room(701,7,
                new Guest(6,"Govind","P","govind@gmail.com"),
                RoomType.DELUXE,3000);
        return rooms;
    }
}
