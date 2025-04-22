package model;

public abstract class Reservation {
    private final int id; 
    private String customerName;
    private String reservationDate;

    public Reservation(int id, String customerName, String reservationDate) {
        this.id = id;
        this.customerName = customerName;
        this.reservationDate = reservationDate;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public final String getBasicInfo() {
        return "ID: " + id + ", Nama: " + customerName + ", Tanggal: " + reservationDate;
    }

    public abstract String getReservationType();

    @Override
    public String toString() {
        return getBasicInfo();
    }
}
