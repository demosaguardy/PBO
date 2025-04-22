package model;

public class TakeAwayReservation extends Reservation {
    private String pickupTime;

    public TakeAwayReservation(int id, String customerName, String reservationDate, String pickupTime) {
        super(id, customerName, reservationDate);
        this.pickupTime = pickupTime;
    }

    @Override
    public String toString() {
        return super.getBasicInfo() +
               ", Tipe: " + getReservationType() +
               ", Waktu Ambil: " + pickupTime;
    }

    @Override
    public String getReservationType() {
        return "Take-Away";
    }
}
