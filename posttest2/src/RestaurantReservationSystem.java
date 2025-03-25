import service.reservationservice;
import java.util.Scanner;

public class RestaurantReservationSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            reservationservice service = new reservationservice();

            while (true) {
                System.out.println("\n=== Sistem Reservasi Restoran ===");
                System.out.println("1. Tambah Reservasi");
                System.out.println("2. Lihat Semua Reservasi");
                System.out.println("3. Update Reservasi");
                System.out.println("4. Hapus Reservasi");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Masukkan nama pelanggan: ");
                        String name = scanner.nextLine();
                        System.out.print("Masukkan nomor meja: ");
                        int tableNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan tanggal reservasi (YYYY-MM-DD): ");
                        String date = scanner.nextLine();
                        service.addReservation(name, tableNumber, date);
                        break;
                    case 2:
                        service.viewReservations();
                        break;
                    case 3:
                        System.out.print("Masukkan ID reservasi yang diupdate: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan nama baru: ");
                        String newName = scanner.nextLine();
                        System.out.print("Masukkan nomor meja baru: ");
                        int newTable = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Masukkan tanggal baru (YYYY-MM-DD): ");
                        String newDate = scanner.nextLine();
                        service.updateReservation(updateId, newName, newTable, newDate);
                        break;
                    case 4:
                        System.out.print("Masukkan ID reservasi yang dihapus: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine();
                        service.deleteReservation(deleteId);
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan sistem reservasi.");
                        System.exit(0);
                    default:
                        System.out.println("Pilihan tidak valid. Coba lagi.");
                }
            }
        }
    }
}
