public class Main {
    public static void main(String[] args) {
        // Objek Pegawai Tetap
        Pegawai pegawai1 = new PegawaiTetap("Scoups", "1234567890", 5000000);
        PegawaiTetap pegawai2 = new PegawaiTetap("Jeonghan", "0987654321", 6000000);
        PegawaiTetap pegawai3 = new PegawaiTetap("Joshua", "1357924680", 5500000);

        // Objek Pegawai Harian
        Pegawai pegawai4 = new PegawaiHarian("Hoshi", "2468013579", 50000, 45);
        PegawaiHarian pegawai5 = new PegawaiHarian("Wonwoo", "9876543210", 60000, 35);
        PegawaiHarian pegawai6 = new PegawaiHarian("Woozi", "0123456789", 55000, 50);

        // Objek Sales
        Pegawai pegawai7 = new Sales("Jun", "5678901234", 10000000, 0.1);
        Pegawai pegawai8 = new Sales("Mingyu", "6789012345", 12000000, 0.12);
        Pegawai pegawai9 = new Sales("Deokyom", "7890123456", 15000000, 0.15);

        // Upcasting dan downcasting
        PegawaiTetap pegawaiTetap = (PegawaiTetap) pegawai1;
        PegawaiHarian pegawaiHarian = (PegawaiHarian) pegawai4;
        Sales sales = (Sales) pegawai7;

        // Output
        System.out.println("Pegawai Tetap:");
        System.out.println(pegawai1);
        System.out.println("\nPegawai Tetap:");
        System.out.println( pegawai2);
        System.out.println("\nPegawai Tetap:");
        System.out.println(pegawai3);

        System.out.println("\nPegawai Harian:");
        System.out.println(pegawai4);
        System.out.println("\nPegawai Harian:");
        System.out.println(pegawai5);
        System.out.println("\nPegawai Harian:");
        System.out.println(pegawai6);

        System.out.println("\nSales:");
        System.out.println(pegawai7);
        System.out.println("\nSales:");
        System.out.println(pegawai8);
        System.out.println("\nSales:");
        System.out.println(pegawai9);
    }
}