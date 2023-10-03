import com.maveric.hotelManagement.model.Guest;
import com.maveric.hotelManagement.model.Hotel;
import com.maveric.hotelManagement.model.Room;
import com.maveric.hotelManagement.util.DataHelper;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Hotel hotel=new Hotel("Taj",DataHelper.getRooms());
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Find Guest Details In Room        2.Find Guests' Count");
            System.out.println("3.Get Today's Earning               4.Find All Guests");
            System.out.println("5.Check In Hotel                    6.Check Out Hotel");
            System.out.println("7.Get Available Rooms               8.Get Filled Rooms");
            System.out.println("9.Logout");
            System.out.print("Enter Your Choice:");
            choice=sc.nextInt();
            switch (choice){
                case 1:{
                    Guest guest=hotel.findGuestCheckedInRoom(201);
                    if(guest!=null){
                        System.out.println("*******Guest Details**********");
                        System.out.println(guest);}
                    else
                        System.out.println("*********Room: "+201+" Is empty********");
                    break;
                }case 2:{
                    System.out.println("********"+hotel.getGuestCount()+" guests are staying in the hotel**********");
                    break;
                }case 3:{
                    System.out.println("*********Today's Earning :"+hotel.getEarningToday()+"***********");
                    break;
                }case 4:{
                    System.out.println("CheckedIn Guests' Details");
                    Guest[] guests=hotel.findAllGuests();
                    for (int i=0;i<guests.length;i++){
                        if(guests[i]!=null)
                            System.out.println(guests[i]);
                    }
                    break;
                }case 5:{
                    System.out.println("*********This service is Temperarly stopped*********");
//                    List<Integer> availableRooms=DataHelper.getAvailableRoomsNumbers();
//                    System.out.println("Available Rooms In The Hotel");
//                    for (Integer room:availableRooms){
//                        System.out.print(room+" ");
//                    }
//                    System.out.println();
//                    System.out.print("Enter The Room Number You Want To Check In:");
//                    int checkinRoom=sc.nextInt();
//                    DataHelper.checkInHote(checkinRoom);
                    break;
                }case 6:{
                    System.out.println("*********This service is Temperarly stopped*********");
//                    System.out.println("Enter the Room number you want to checkout");
//                    int checkOutRoom=sc.nextInt();
//                    DataHelper.checkOutHotel(checkOutRoom);
                    break;
                }case 7:{
                    System.out.println("*********This service is Temperarly stopped*********");
//                    System.out.println("Available Rooms In The Hotel");
//                    List<Integer> availableRooms=DataHelper.getAvailableRoomsNumbers();
//                    for(Integer availRoom:availableRooms){
//                        System.out.print(availRoom+" ");
//                    }
//                    System.out.println();
                    break;
                }case 8:{
                    System.out.println("*********This service is Temperarly stopped*********");
//                    List<Integer> filledRooms=DataHelper.getFilledRoomsNumers();
//                    System.out.println("Filled Rooms");
//                    for(Integer room:filledRooms){
//                        System.out.print(room+" ");
//                    }
//                    System.out.println();
                    break;
                }case 9:{
                    System.out.println("*********LoggedOut*********");
                    break;
                } default:
                    System.out.println("Invalid Option");
            }
        }while (choice!=9);
    }
}