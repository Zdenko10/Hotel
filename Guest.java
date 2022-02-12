package com.engeto.lekce2;


import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate dayOfBirth;

    public Guest (String name, String surname, LocalDate dayOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getDescription() {
        return "Guest: " + name + " " + surname + " " + " (" + dayOfBirth.toString() + ")";
    }

    public String getFullName() {
        return getName()+" "+getSurname();
    }

}

