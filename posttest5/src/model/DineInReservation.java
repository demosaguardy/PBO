package model;

public class DineInReservation extends Reservation {
    private int tableNumber;
    private int numberOfGuests;

    public DineInReservation(int id, String customerName, String reservationDate, int tableNumber, int numberOfGuests) {
        super(id, customerName, reservationDate);
        this.tableNumber = tableNumber;
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public String toString() {
        return super.getBasicInfo() +
               ", Tipe: " + getReservationType() +
               ", Meja: " + tableNumber + ", Jumlah Tamu: " + numberOfGuests;
    }

    @Override
    public String getReservationType() {
        return "Dine-In";
    }
}
