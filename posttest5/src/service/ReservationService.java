package service;

import model.*;

import java.util.ArrayList;

public final class ReservationService { 
    private ArrayList<Reservation> reservations = new ArrayList<>();
    private int idCounter = 1;

    public void addDineIn(String customerName, String reservationDate, int tableNumber, int guests) {
        reservations.add(new DineInReservation(idCounter++, customerName, reservationDate, tableNumber, guests));
        System.out.println("Reservasi Dine-In berhasil ditambahkan!");
    }

    public void addTakeAway(String customerName, String reservationDate, String pickupTime) {
        reservations.add(new TakeAwayReservation(idCounter++, customerName, reservationDate, pickupTime));
        System.out.println("Reservasi Take-Away berhasil ditambahkan!");
    }

    public void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Belum ada reservasi.");
        } else {
            for (Reservation r : reservations) {
                System.out.println(r);
            }
        }
    }

    public void deleteReservation(int id) {
        reservations.removeIf(r -> r.getId() == id);
        System.out.println("Reservasi berhasil dihapus!");
    }
}
