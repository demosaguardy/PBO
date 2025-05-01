package model;

import interface_.Reservable;

public abstract class Reservation implements Reservable {
    private final int id;
    private String customerName;
    private String reservationDate;

    public static int totalReservations = 0; // Static variable

    public Reservation(int id, String customerName, String reservationDate) {
        this.id = id;
        this.customerName = customerName;
        this.reservationDate = reservationDate;
        totalReservations++;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setReservationDate(String date) {
        this.reservationDate = date;
    }

    public static void showTotalReservations() {
        System.out.println("Total reservasi: " + totalReservations);
    }

    public abstract void displayReservation(); // Abstract method
}
