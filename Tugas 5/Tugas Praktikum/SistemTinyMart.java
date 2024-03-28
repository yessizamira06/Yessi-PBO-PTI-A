import java.util.Scanner;

public class SistemTinyMart {
    public static void main(String[] args) {
        Pelanggan pelanggan1 = new Pelanggan("3812345678", "Mark Lee", 10000000, 1234);
        Pelanggan pelanggan2 = new Pelanggan("5612345678", "Kim Mingyu", 50000000, 5678);
        Pelanggan pelanggan3 = new Pelanggan("7412345678", "Jeon Wonwoo", 200000000, 9876);

        Scanner scanner = new Scanner(System.in);

        boolean pinBenar = false;
        Pelanggan pelanggan = null;
        int percobaanLogin = 0;

        while (!pinBenar && percobaanLogin < 3) {
            System.out.print("Masukkan PIN Anda: ");
            int pin = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            if (pin == pelanggan1.getPin()) {
                pelanggan = pelanggan1;
                pinBenar = true;
            } else if (pin == pelanggan2.getPin()) {
                pelanggan = pelanggan2;
                pinBenar = true;
            } else if (pin == pelanggan3.getPin()) {
                pelanggan = pelanggan3;
                pinBenar = true;
            } else {
                percobaanLogin++;
                if (percobaanLogin < 3) {
                    System.out.println("PIN salah. Silakan coba lagi.");
                } else {
                    System.out.println("Anda telah melakukan 3 kali kesalahan dalam memasukkan PIN. Akun Anda terkunci.");
                    System.exit(0);
                }
            }
        }

        // Program akan berlanjut ke bagian selanjutnya jika PIN sudah benar
        // Tampilkan informasi akun
        System.out.println("Selamat datang, " + pelanggan.getNama());
        System.out.println("Nomor Akun: " + pelanggan.getNomorAkun());
        System.out.println("Jenis Akun: " + pelanggan.getJenisAkun());
        System.out.println("Saldo: Rp" + pelanggan.getSaldo());

        boolean selesai = false;
        while (!selesai) {
            System.out.println("\nPilih jenis transaksi:");
            System.out.println("1. Beli");
            System.out.println("2. Top-up");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    // Lakukan transaksi beli
                    System.out.print("Masukkan jumlah belanja: Rp");
                    double jumlahBeli = scanner.nextDouble();
                    scanner.nextLine(); // Konsumsi newline

                    if (jumlahBeli <= 0) {
                        System.out.println("Jumlah belanja tidak valid.");
                        break;
                    }

                    if (pelanggan.beli(jumlahBeli, pelanggan.getPin())) {
                        double cashback = pelanggan.hitungCashback(jumlahBeli);
                        double saldoSetelahCashback = pelanggan.getSaldo() + cashback;
                        System.out.println("Cashback yang didapat: Rp" + cashback + " (" + (cashback / jumlahBeli * 100) + "% dari jumlah belanja)");
                        System.out.println("Saldo baru setelah cashback: Rp" + saldoSetelahCashback);
                    }
                    break;
                case 2:
                    // Lakukan transaksi top-up
                    System.out.print("Masukkan jumlah top-up: Rp");
                    double jumlahTopUp = scanner.nextDouble();
                    scanner.nextLine(); // Konsumsi newline

                    if (jumlahTopUp <= 0) {
                        System.out.println("Jumlah top-up tidak valid.");
                        break;
                    }

                    pelanggan.topUp(jumlahTopUp, pelanggan.getPin());
                    break;
                case 3:
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        scanner.close();
    }
}