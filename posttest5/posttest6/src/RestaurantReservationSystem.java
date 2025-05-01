import service.ReservationService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaurantReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationService service = new ReservationService();

        while (true) {
            try {
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
                        System.out.print("Nama Pelanggan: ");
                        String name1 = scanner.nextLine();
                        System.out.print("Tanggal Reservasi (YYYY-MM-DD): ");
                        String date1 = scanner.nextLine();
                        System.out.print("Nomor Meja: ");
                        int table = scanner.nextInt();
                        System.out.print("Jumlah Tamu: ");
                        int guests = scanner.nextInt();
                        scanner.nextLine();
                        service.addDineIn(name1, date1, table, guests);
                        break;
                    case 2:
                        System.out.print("Nama Pelanggan: ");
                        String name2 = scanner.nextLine();
                        System.out.print("Tanggal Reservasi (YYYY-MM-DD): ");
                        String date2 = scanner.nextLine();
                        System.out.print("Waktu Ambil (HH:MM): ");
                        String time = scanner.nextLine();
                        service.addTakeAway(name2, date2, time);
                        break;
                    case 3:
                        service.viewReservations();
                        break;
                    case 4:
                        service.viewReservations();
                        System.out.print("ID reservasi yang dihapus: ");
                        int delId = scanner.nextInt();
                        scanner.nextLine();
                        service.deleteReservation(delId);
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan sistem reservasi.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak sesuai. Harap masukkan angka dengan benar.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
    }
}
