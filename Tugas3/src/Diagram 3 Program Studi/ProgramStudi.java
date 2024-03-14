import java.util.Scanner;

public class ProgramStudi {
    private String namaProgramStudi;
    private int jumlahMahasiswa;
    private int jumlahDosen;
    private String akreditasi;

    public ProgramStudi(String namaProgramStudi, int jumlahMahasiswa, int jumlahDosen, String akreditasi) {
        this.namaProgramStudi = namaProgramStudi;
        this.jumlahMahasiswa = jumlahMahasiswa;
        this.jumlahDosen = jumlahDosen;
        this.akreditasi = akreditasi;
    }

    public void kelolaKurikulum() {
        System.out.println("Melakukan pengelolaan kurikulum");
    }

    public void pengembanganKurikulum() {
        System.out.println("Melakukan pengembangan kurikulum");
    }

    public void penelitianPengabdian(String bidangPenelitian) {
        System.out.println("Melakukan penelitian dan pengabdian di bidang " + bidangPenelitian);
    }

    public void kerjasamaKemitraan(String institusi) {
        System.out.println("Melakukan kerjasama kemitraan dengan " + institusi);
    }
}
