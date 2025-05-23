package model;

public class reservation {
    private int id;
    private String customerName;
    private int tableNumber;
    private String reservationDate;

    public reservation(int id, String customerName, int tableNumber, String reservationDate) {
        this.id = id;
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.reservationDate = reservationDate;
    }

    public int getId() {
        return id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + customerName + ", Meja: " + tableNumber + ", Tanggal: " + reservationDate;
    }
}