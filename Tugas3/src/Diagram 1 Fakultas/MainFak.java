import java.util.Scanner;

public class MainFak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fakultas fakultas = new Fakultas("Ilmu Komputer", 20, new Staff("Dr. John Doe", "Dekan"));

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Tampilkan Rata-rata IPK Mahasiswa");
            System.out.println("5. Atur Jadwal");
            System.out.println("6. Beri Penasehat Akademik");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String NIM = scanner.nextLine();
                    System.out.print("Masukkan IPK Mahasiswa: ");
                    double IPK = scanner.nextDouble();
                    scanner.nextLine(); // Mengonsumsi newline

                    Mahasiswa mahasiswa = new Mahasiswa(nama, NIM, IPK);
                    fakultas.tambahMahasiswa(mahasiswa);
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;
                case 2:
                    fakultas.tampilkanDaftarMahasiswa();
                    break;
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nim = scanner.nextLine();
                    fakultas.hapusMahasiswa(nim);
                    break;
                case 4:
                    double rataRataIPK = fakultas.hitungRataRataIPK();
                    System.out.println("Rata-rata IPK Mahasiswa: " + rataRataIPK);
                    break;
                case 5:
                    System.out.println("Jadwal berhasil diatur.");
                    break;
                case 6:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String NIMMahasiswa = scanner.nextLine();
                    System.out.print("Masukkan Nama Dosen Penasehat: ");
                    String namaDosen = scanner.nextLine();
                    // Lakukan sesuai kebutuhan untuk metode beriPenasehatAkademik
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
