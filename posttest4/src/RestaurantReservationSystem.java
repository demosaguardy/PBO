import service.ReservationService;
import java.util.Scanner;

public class RestaurantReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationService service = new ReservationService();

        while (true) {
            System.out.println("\n=== Sistem Reservasi Restoran ===");
            System.out.println("1. Tambah Reservasi Dine-In");
            System.out.println("2. Tambah Reservasi Take-Away");
            System.out.println("3. Lihat Semua Reservasi");
            System.out.println("4. Hapus Reservasi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nama pelanggan: ");
                    String dineName = scanner.nextLine();
                    System.out.print("Tanggal reservasi (YYYY-MM-DD): ");
                    String dineDate = scanner.nextLine();
                    System.out.print("Nomor meja: ");
                    int tableNum = scanner.nextInt();
                    System.out.print("Jumlah tamu: ");
                    int guests = scanner.nextInt();
                    scanner.nextLine();
                    service.addReservation(dineName, dineDate, tableNum, guests);
                    break;
                case 2:
                    System.out.print("Nama pelanggan: ");
                    String takeName = scanner.nextLine();
                    System.out.print("Tanggal reservasi (YYYY-MM-DD): ");
                    String takeDate = scanner.nextLine();
                    System.out.print("Waktu pengambilan (HH:MM): ");
                    String pickupTime = scanner.nextLine();
                    service.addReservation(takeName, takeDate, pickupTime);
                    break;
                case 3:
                    service.viewReservations();
                    break;
                case 4:
                    System.out.print("Masukkan ID reservasi yang ingin dihapus: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    service.deleteReservation(deleteId);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem reservasi.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}
