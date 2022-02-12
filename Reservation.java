package com.engeto.lekce2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private Guest mainGuest;
    private List <Guest> otherGuests = new ArrayList<>();
    private Room room;
    private LocalDate start;
    private LocalDate over;
    private PurposeOfHoliday purpose;

    public Reservation(Guest mainGuest, Room room, LocalDate start, LocalDate over, PurposeOfHoliday purpose) {
        this.mainGuest = mainGuest;
        this.room = room;
        this.start = start;
        this.over = over;
        this.purpose = purpose;
    }

    public Reservation(Guest mainGuest, Room room) {
        this(mainGuest,room,LocalDate.now(),LocalDate.now().plusDays(7),PurposeOfHoliday.HOLIDAY);
    }

    public void addGuest(Guest newGuest) {
        otherGuests.add(newGuest);
    }
    public void removeGuest(Guest guest) {
        otherGuests.remove(guest);
    }
    public void clearOtherGuests() {
        otherGuests.clear();
    }

    public Guest getMainGuest() {
        return mainGuest;
    }

    public void setMainGuest(Guest mainGuest) {
        this.mainGuest = mainGuest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getOver() {
        return over;
    }

    public void setOver(LocalDate over) {
        this.over = over;
    }

    public PurposeOfHoliday getPurpose() {
        return purpose;
    }

    public void setPurpose(PurposeOfHoliday purpose) {
        this.purpose = purpose;
    }

    public String getDescription() {
        StringBuilder result = new StringBuilder("Booking for "+mainGuest.getFullName()+" ("+purpose
                +") from " + start.toString() + " to " + over.toString() + " other guests: ");
        for (Guest guest : otherGuests) {
            result.append(guest.getFullName()).append(", ");
        }
        return result.toString();
    }

}
