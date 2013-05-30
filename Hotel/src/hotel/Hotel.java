/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class Hotel {
    private int capacity;
    private int roomsOccupied;
    private int nextReservation = 0;
    private int nextReservationID = 1;
    private final int maximumReservations = 3;
    private RoomReservation[] reservations;
    
    public Hotel()
    {
        this.capacity = 10;
        reservations = new RoomReservation[maximumReservations];
    }
    
    public void displayReservationDetails(RoomReservation item)
    {
        System.out.println("Your room reservation details are:");
        System.out.format("%1$14s %2$-25s %3$s\n", "Reservation ID"
                , "Customer Name", "Number of rooms booked");
        System.out.println("------------------------------------------------"
                + "------------");
        System.out.format("%1$-14d %2$-25s %3$d\n", item.reservationID
                , item.customerName, item.roomsBooked);
    }
    
    public void setCapacity()
    {
        Scanner input = new Scanner(System.in);
        
        int temp = 0;
        
        try{
            System.out.println("Enter new capacity of the hotel:");
            temp = input.nextInt();

            if(temp <= 0)
            {
                throw new Exception("Enter a non-zero positive number for capacity.");
            }

            this.capacity += temp;
        }catch(InputMismatchException e){
            System.out.println("Enter a non-zero positive number for capacity");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void bookRooms()
    {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.print("Enter customer name: ");
            String customerName = input.nextLine();

            System.out.print("How many rooms do you want to book? ");
            int rooms = input.nextInt();

            if(rooms <= 0)
            {
                throw new Exception("Please enter a positive non-zero value "
                        + "for number of rooms.");
            }

            int available = capacity - roomsOccupied;

            if(rooms > available)
            {
                throw new RoomsNotAvailableException(available);
            }
            else
            {
                RoomReservation item = new RoomReservation();

                item.reservationID = nextReservationID++;
                item.customerName = customerName;
                item.roomsBooked = rooms;

                reservations[nextReservation++] = item;

                roomsOccupied += rooms;

                System.out.println("Room booked successfully.");
                displayReservationDetails(item);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred - Could not book a room. "
                    + "The reservations are full.");
        }catch(RoomsNotAvailableException e){
            System.out.println("Exception occurred - " + e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Exception occurred - Data type mismatch. "
                    + "Enter non-zero numberic value.");
        }catch(Exception e){
            System.out.println("Exception occurred - " + e.getMessage());
        }
    }
}
