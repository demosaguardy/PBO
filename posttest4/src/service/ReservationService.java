package service;

import model.Reservation;
import model.DineInReservation;
import model.TakeAwayReservation;

import java.util.ArrayList;

public class ReservationService {
    private ArrayList<Reservation> reservations = new ArrayList<>();
    private int idCounter = 1;

    public void addReservation(String customerName, String reservationDate, int tableNumber, int numberOfGuests) {
        reservations.add(new DineInReservation(idCounter++, customerName, reservationDate, tableNumber, numberOfGuests));
        System.out.println("Reservasi Dine-In berhasil ditambahkan!");
    }

    public void addReservation(String customerName, String reservationDate, String pickupTime) {
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
        boolean removed = reservations.removeIf(r -> r.getId() == id);
        if (removed) {
            System.out.println("Reservasi berhasil dihapus!");
        } else {
            System.out.println("Reservasi dengan ID " + id + " tidak ditemukan.");
        }
    }
}
