import java.util.Scanner;

public class MainBEM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama kabinet:");
        String namaKabinet = scanner.nextLine();
        System.out.println("Masukkan nama ketua BEM:");
        String ketuaBEM = scanner.nextLine();
        System.out.println("Masukkan visi:");
        String visi = scanner.nextLine();
        System.out.println("Masukkan misi:");
        String misi = scanner.nextLine();

        BEM bem = new BEM(namaKabinet, ketuaBEM, visi, misi);

        System.out.println("\nMenu:");
        System.out.println("1. Ajukan Proposal");
        System.out.println("2. Event BEM");
        System.out.println("3. Koordinasi Tim");
        System.out.println("4. Keluar");

        while (true) {
            System.out.print("\nPilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan judul proposal:");
                    String judulProposal = scanner.nextLine();
                    System.out.println("Masukkan deskripsi proposal:");
                    String deskripsi = scanner.nextLine();
                    bem.ajukanProposal(judulProposal, deskripsi);
                    break;
                case 2:
                    System.out.println("Masukkan nama event:");
                    String namaEvent = scanner.nextLine();
                    System.out.println("Masukkan tanggal event:");
                    String tanggal = scanner.nextLine();
                    System.out.println("Masukkan tempat event:");
                    String tempat = scanner.nextLine();
                    bem.eventBEM(namaEvent, tanggal, tempat);
                    break;
                case 3:
                    System.out.println("Masukkan jenis koordinasi:");
                    String jenisKoordinasi = scanner.nextLine();
                    bem.koordinasiTim(jenisKoordinasi);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    return; // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
