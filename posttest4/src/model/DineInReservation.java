package model;

public class DineInReservation extends Reservation {
    private int tableNumber;
    private int numberOfGuests;

    public DineInReservation(int id, String customerName, String reservationDate, int tableNumber, int numberOfGuests) {
        super(id, customerName, reservationDate);
        this.tableNumber = tableNumber;
        this.numberOfGuests = numberOfGuests;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public String toString() {
        return super.toString() + ", Meja: " + tableNumber + ", Jumlah Tamu: " + numberOfGuests;
    }
}
