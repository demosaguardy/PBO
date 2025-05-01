package service;

import model.*;
import java.util.ArrayList;

public class ReservationService {
    private final ArrayList<Reservation> reservations = new ArrayList<>();
    private int idCounter = 1;

    public void addDineIn(String name, String date, int table, int guests) {
        reservations.add(new DineInReservation(idCounter++, name, date, table, guests));
        System.out.println("Reservasi Dine-In berhasil!");
    }

    public void addTakeAway(String name, String date, String time) {
        reservations.add(new TakeAwayReservation(idCounter++, name, date, time));
        System.out.println("Reservasi Take-Away berhasil!");
    }

    public void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Belum ada reservasi.");
        } else {
            for (Reservation r : reservations) {
                r.displayReservation(); // Polymorphism - override
            }
            Reservation.showTotalReservations(); // Static method call
        }
    }

    public void deleteReservation(int id) {
        boolean found = reservations.removeIf(r -> r.getId() == id);
        if (found) {
            System.out.println("Reservasi berhasil dihapus.");
        } else {
            System.out.println("Reservasi dengan ID " + id + " tidak ditemukan.");
        }
    }
}
