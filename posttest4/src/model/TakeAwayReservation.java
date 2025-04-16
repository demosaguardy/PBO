package model;

public class TakeAwayReservation extends Reservation {
    private String pickupTime;

    public TakeAwayReservation(int id, String customerName, String reservationDate, String pickupTime) {
        super(id, customerName, reservationDate);
        this.pickupTime = pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Waktu Pengambilan: " + pickupTime;
    }
}
