package com.engeto.lekce2;


import java.math.BigDecimal;

public class Room {
    private int numberOfRoom;
    private int numberOfBeds;
    private boolean balcony;
    private boolean viewToSea;
    private BigDecimal pricePerNight;

    public Room (int numberOfRoom, int numberOfBeds, boolean balcony, boolean viewToSea, BigDecimal pricePerNight) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.viewToSea = viewToSea;
        this.pricePerNight = pricePerNight;
    }


    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isViewToSea() {
        return viewToSea;
    }

    public void setViewToSea(boolean viewToSea) {
        this.viewToSea = viewToSea;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {
        return "Number of room: " + numberOfRoom + "    Number of beds: " + numberOfBeds + "    Balcony: " + balcony +
                "   View to sea: " + viewToSea + "  Price per night: " + pricePerNight + " Kč";
    }
}

