package model;

public final class DineInReservation extends Reservation {
    private int tableNumber;
    private int guestCount;

    public DineInReservation(int id, String customerName, String reservationDate, int tableNumber, int guestCount) {
        super(id, customerName, reservationDate);
        this.tableNumber = tableNumber;
        this.guestCount = guestCount;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getGuestCount() {
        return guestCount;
    }

    @Override
    public void displayReservation() {
        System.out.println("DINE-IN | ID: " + getId() + ", Nama: " + getCustomerName() + 
            ", Meja: " + tableNumber + ", Jumlah Tamu: " + guestCount + ", Tanggal: " + getReservationDate());
    }

    @Override
    public String getReservationType() {
        return "Dine-In";
    }
}
