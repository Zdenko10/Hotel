package com.engeto.lekce2;


import java.util.ArrayList;
import java.util.List;

public class ListOfBookings {
    private List<Reservation> listOfBookings = new ArrayList<Reservation>();

    public void addReservation(Reservation newReservation) {
        listOfBookings.add(newReservation);
    }

    public void printListOfBookings() {
        for (Reservation reservation : listOfBookings) {
            System.out.println(reservation.getDescription());
        }
    }
}


