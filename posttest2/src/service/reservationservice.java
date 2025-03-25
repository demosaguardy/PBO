package service;

import model.reservation;
import java.util.ArrayList;

public class reservationservice {
    protected ArrayList<reservation> reservations = new ArrayList<>();
    private int idCounter = 1;

    public void addReservation(String customerName, int tableNumber, String reservationDate) {
        reservations.add(new reservation(idCounter++, customerName, tableNumber, reservationDate));
        System.out.println("Reservasi berhasil ditambahkan!");
    }
    public void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Belum ada reservasi.");
        } else {
            for (reservation r : reservations) {
                System.out.println(r);
            }
        }
    }
    public void updateReservation(int id, String customerName, int tableNumber, String reservationDate) {
        for (reservation r : reservations) {
            if (r.getId() == id) {
                r.setCustomerName(customerName);
                r.setTableNumber(tableNumber);
                r.setReservationDate(reservationDate);
                System.out.println("Reservasi berhasil diupdate!");
                return;
            }
        }
        System.out.println("Reservasi dengan ID " + id + " tidak ditemukan.");
    }
    public void deleteReservation(int id) {
        if (reservations.removeIf(r -> r.getId() == id)) {
            System.out.println("Reservasi berhasil dihapus!");
        } else {
            System.out.println("Reservasi dengan ID " + id + " tidak ditemukan.");
        }
    }
}