package model;

public class TakeAwayReservation extends Reservation {
    private String pickupTime;

    public TakeAwayReservation(int id, String customerName, String reservationDate, String pickupTime) {
        super(id, customerName, reservationDate);
        this.pickupTime = pickupTime;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    @Override
    public void displayReservation() {
        System.out.println("TAKE-AWAY | ID: " + getId() + ", Nama: " + getCustomerName() + 
            ", Tanggal: " + getReservationDate() + ", Waktu Ambil: " + pickupTime);
    }

    @Override
    public String getReservationType() {
        return "Take-Away";
    }
}
