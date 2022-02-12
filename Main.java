package com.engeto.lekce2;


import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Guest first = new Guest("Adéla","Malíková",LocalDate.of(1993,3,13));
        Guest second = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));

        Room roomOne = new Room(1,1,true,true,BigDecimal.valueOf(1000));
        Room roomTwo = new Room(2,1,true,true,BigDecimal.valueOf(1000));
        Room roomThree = new Room(3,3,false,true,BigDecimal.valueOf(2400));


        ListOfBookings listOfBookings = new ListOfBookings();


        Reservation reservation = new Reservation(first,roomOne,LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26),PurposeOfHoliday.HOLIDAY);
        listOfBookings.addReservation(reservation);

        reservation = new Reservation(first,roomThree,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),PurposeOfHoliday.WORKING);
        reservation.addGuest(second);
        listOfBookings.addReservation(reservation);


        System.out.println(first.getDescription());
        System.out.println(second.getDescription());

        System.out.println(roomOne.getDescription());
        System.out.println(roomTwo.getDescription());
        System.out.println(roomThree.getDescription());

        listOfBookings.printListOfBookings();
    }
}
