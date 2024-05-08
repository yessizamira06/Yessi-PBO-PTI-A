import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Buat array untuk menyimpan kue
        Kue[] kueArray = new Kue[20];

        // Isi array dengan objek kue
        kueArray[0] = new KuePesanan("Brownies", 15000, 0.5);
        kueArray[1] = new KuePesanan("Donat", 10000, 0.3);
        kueArray[2] = new KuePesanan("Roti Bakar", 20000, 0.4);
        kueArray[3] = new KuePesanan("Kue Lapis", 18000, 0.6);
        kueArray[4] = new KueJadi("Kue Lumpur", 12000, 10);
        kueArray[5] = new KueJadi("Kue Bolu", 25000, 5);
        kueArray[6] = new KueJadi("Kue Tart", 30000, 3);
        kueArray[7] = new KueJadi("Kue Pandan", 20000, 8);
        kueArray[8] = new KuePesanan("Kue Sus", 18000, 0.5);
        kueArray[9] = new KuePesanan("Kue Cubit", 5000, 0.2);
        kueArray[10] = new KuePesanan("Kue Lumpur", 15000, 0.6);
        kueArray[11] = new KuePesanan("Kue Bolu", 22000, 0.4);
        kueArray[12] = new KuePesanan("Kue Pandan", 17000, 0.7);
        kueArray[13] = new KueJadi("Brownies", 20000, 8);
        kueArray[14] = new KueJadi("Donat", 15000, 10);
        kueArray[15] = new KueJadi("Roti Bakar", 25000, 5);
        kueArray[16] = new KueJadi("Kue Lapis", 30000, 3);
        kueArray[17] = new KueJadi("Kue Sus", 18000, 12);
        kueArray[18] = new KueJadi("Kue Cubit", 6000, 15);
        kueArray[19] = new KueJadi("Kue Tart", 35000, 2);

        // Menu Interaktif
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan semua kue dan jenis kuenya");
            System.out.println("2. Hitung total harga yang didapat dari semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Menampilkan semua kue dan jenis kuenya
                    System.out.println("\nDaftar Semua Kue:");
                    for (Kue kue : kueArray) {
                        System.out.println(kue);
                    }
                    break;
                case 2:
                    // Menghitung total harga yang didapat dari semua jenis kue
                    double totalHargaSemua = 0;
                    for (Kue kue : kueArray) {
                        totalHargaSemua += kue.hitungHarga();
                    }
                    System.out.println("\nTotal Harga Semua Kue: " + totalHargaSemua);
                    break;
                case 3:
                    // Menghitung total harga dan total berat dari KuePesanan
                    double totalHargaPesanan = 0;
                    double totalBeratPesanan = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KuePesanan) {
                            totalHargaPesanan += kue.hitungHarga();
                            totalBeratPesanan += ((KuePesanan) kue).berat;
                        }
                    }
                    System.out.println("\nTotal Harga Kue Pesanan: " + totalHargaPesanan);
                    System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan + " kg");
                    break;
                case 4:
                    // Menghitung total harga dan total jumlah dari KueJadi
                    double totalHargaJadi = 0;
                    double totalJumlahJadi = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueJadi) {
                            totalHargaJadi += kue.hitungHarga();
                            totalJumlahJadi += ((KueJadi) kue).jumlah;
                        }
                    }
                    System.out.println("\nTotal Harga Kue Jadi: " + totalHargaJadi);
                    System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);
                    break;
                case 5:
                    // Menampilkan informasi kue dengan harga terbesar
                    double hargaTerbesar = 0;
                    Kue kueTerbesar = null;
                    for (Kue kue : kueArray) {
                        if (kue.hitungHarga() > hargaTerbesar) {
                            hargaTerbesar = kue.hitungHarga();
                            kueTerbesar = kue;
                        }
                    }
                    System.out.println("\nKue dengan Harga Terbesar:");
                    System.out.println(kueTerbesar);
                    break;
                case 6:
                    // Keluar dari program
                    isRunning = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}