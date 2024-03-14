import java.util.ArrayList;
import java.util.List;

public class Fakultas {
    private String nama;
    private int jumlahDosen;
    private Staff pimpinan;
    private List<Mahasiswa> daftarMahasiswa;

    // Konstruktor
    public Fakultas(String nama, int jumlahDosen, Staff pimpinan) {
        this.nama = nama;
        this.jumlahDosen = jumlahDosen;
        this.pimpinan = pimpinan;
        this.daftarMahasiswa = new ArrayList<>();
    }

    // Metode untuk mengatur jadwal
    public void aturJadwal(Jadwal jadwal) {
        System.out.println("Jadwal telah diatur.");
    }

    // Metode untuk memberikan penasehat akademik
    public void beriPenasehatAkademik(Mahasiswa mahasiswa, Dosen dosen) {
        System.out.println("Penasehat akademik diberikan kepada mahasiswa " + mahasiswa.getNama() + " oleh dosen " + dosen.getNama());
    }

    // Metode untuk menghitung rata-rata IPK
    public double hitungRataRataIPK() {
        double totalIPK = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            totalIPK += mahasiswa.getIPK();
        }
        return totalIPK / daftarMahasiswa.size();
    }

    // Metode untuk menambahkan mahasiswa
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    // Metode untuk menampilkan daftar mahasiswa
    public void tampilkanDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNIM());
        }
    }

    // Metode untuk menghapus mahasiswa
    public void hapusMahasiswa(String NIM) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNIM().equals(NIM)) {
                daftarMahasiswa.remove(mahasiswa);
                System.out.println("Mahasiswa dengan NIM " + NIM + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + NIM + " tidak ditemukan.");
    }
}
