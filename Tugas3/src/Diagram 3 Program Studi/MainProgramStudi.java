import java.util.Scanner;

public class MainProgramStudi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaFakultas;
        int jumlahMahasiswa;
        int jumlahDosen;
        String akreditasi;

        System.out.println("Masukkan nama Program Studi:");
        namaFakultas = scanner.nextLine();

        System.out.println("Masukkan jumlah mahasiswa:");
        jumlahMahasiswa = Integer.parseInt(scanner.nextLine());

        System.out.println("Masukkan jumlah dosen:");
        jumlahDosen = Integer.parseInt(scanner.nextLine());

        System.out.println("Masukkan akreditasi:");
        akreditasi = scanner.nextLine();

        ProgramStudi programStudi = new ProgramStudi(namaFakultas, jumlahMahasiswa, jumlahDosen, akreditasi);

        System.out.println("\nPilih operasi yang ingin dilakukan:");
        System.out.println("1. Kelola Kurikulum");
        System.out.println("2. Pengembangan Kurikulum");
        System.out.println("3. Penelitian dan Pengabdian");
        System.out.println("4. Kerjasama dan Kemitraan");
        System.out.print("Pilihan: ");
        int pilihan = Integer.parseInt(scanner.nextLine());

        switch (pilihan) {
            case 1:
                programStudi.kelolaKurikulum();
                break;
            case 2:
                programStudi.pengembanganKurikulum();
                break;
            case 3:
                System.out.println("Masukkan bidang penelitian:");
                String bidangPenelitian = scanner.nextLine();
                programStudi.penelitianPengabdian(bidangPenelitian);
                break;
            case 4:
                System.out.println("Masukkan nama institusi kemitraan:");
                String institusi = scanner.nextLine();
                programStudi.kerjasamaKemitraan(institusi);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
