package model;

public class Reservation {
    protected int id;
    protected String customerName;
    protected String reservationDate;

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

    public String getReservationDate() {
        return reservationDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + customerName + ", Tanggal: " + reservationDate;
    }
}
