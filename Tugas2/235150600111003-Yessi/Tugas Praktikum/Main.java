import java.util.*;

class Penulis {
    private String nama;

    public Penulis(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Buku {
    private String judul;
    private Penulis penulis;
    private String kategori;

    public Buku(String judul, Penulis penulis, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public String getKategori() {
        return kategori;
    }
}

class Perpustakaan {
    private static String nama;
    private static List<Buku> koleksiBuku;

    public Perpustakaan(String nama) {
        Perpustakaan.nama = nama;
        koleksiBuku = new ArrayList<>();
        // Inisialisasi koleksi buku disini
        inisialisasiKoleksiBuku();
    }

    // Inisialisasi koleksi buku (Contoh)
    private void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    private void inisialisasiKoleksiBuku() {
        tambahBukuTeknologi();
        tambahBukuFilsafat();
        tambahBukuSejarah();
        tambahBukuAgama();
        tambahBukuPsikologi();
        tambahBukuPolitik();
        tambahBukuFiksi();
    }

    private void tambahBukuTeknologi() {
        Penulis penulis1 = new Penulis("Mark Lee");
        Penulis penulis2 = new Penulis("Lee Haechan");
        Penulis penulis3 = new Penulis("Lee Jeno");
        Penulis penulis4 = new Penulis("Na Jaemin");
        Penulis penulis5 = new Penulis("Huang Renjun");

        tambahBuku(new Buku("Java Programming", penulis1, "Teknologi"));
        tambahBuku(new Buku("Python Programming", penulis2, "Teknologi"));
        tambahBuku(new Buku("C++ Programming", penulis3, "Teknologi"));
        tambahBuku(new Buku("HTML Programming", penulis4, "Teknologi"));
        tambahBuku(new Buku("JavaScript Programming", penulis5, "Teknologi"));
    }

    private void tambahBukuFilsafat() {
        Penulis penulis1 = new Penulis("Zhong Chenle");
        Penulis penulis2 = new Penulis("Park Jisung");
        Penulis penulis3 = new Penulis("Jeong Jaehyun");
        Penulis penulis4 = new Penulis("Lee Taeyong");
        Penulis penulis5 = new Penulis("Kim Jungwoo");

        tambahBuku(new Buku("Berfilsafat Bikin Gila", penulis1, "Filsafat"));
        tambahBuku(new Buku("How to Argue Like a Silly Person", penulis2, "Filsafat"));
        tambahBuku(new Buku("The Philosophy of Potato Chips", penulis3, "Filsafat"));
        tambahBuku(new Buku("Filosofi Kopi dan Gelas Pecah", penulis4, "Filsafat"));
        tambahBuku(new Buku("Merenungkan Keberanian Melalui Sambal dan Kejujuran", penulis5, "Filsafat"));
    }

    private void tambahBukuSejarah() {
        Penulis penulis1 = new Penulis("Na Yuta");
        Penulis penulis2 = new Penulis("Kim Doyoung");
        Penulis penulis3 = new Penulis("Moon Taeil");
        Penulis penulis4 = new Penulis("Johhny Suh");
        Penulis penulis5 = new Penulis("Ten lee");

        tambahBuku(new Buku("Sejarah Bersama Mantan", penulis1, "Sejarah"));
        tambahBuku(new Buku("Ngga Ada Sejarahnya Aku Sama Kamu Jadi Pacar", penulis2, "Sejarah"));
        tambahBuku(new Buku("Kisah Manis-Menyebalkan dari Masa Lampau", penulis3, "Sejarah"));
        tambahBuku(new Buku("Tragedi Romantis di FILKOM UB", penulis4, "Sejarah"));
        tambahBuku(new Buku("Kisah Mantan yang Tak Terlupakan", penulis5, "Sejarah"));
    }

    private void tambahBukuAgama() {
        Penulis penulis1 = new Penulis("Yangyang");
        Penulis penulis2 = new Penulis("Hendery");
        Penulis penulis3 = new Penulis("Kun");
        Penulis penulis4 = new Penulis("Xiaojun");
        Penulis penulis5 = new Penulis("Winwin");

        tambahBuku(new Buku("Cara Masuk Islam", penulis1, "Agama"));
        tambahBuku(new Buku("Pacarku Kristen, tapi Aku Muslim", penulis2, "Agama"));
        tambahBuku(new Buku("Surga atau Neraka", penulis3, "Agama"));
        tambahBuku(new Buku("Kisah 25 Nabi", penulis4, "Agama"));
        tambahBuku(new Buku("Ayo Login Dijamin Masuk Surga", penulis5, "Agama"));
    }

    private void tambahBukuPsikologi() {
        Penulis penulis1 = new Penulis("Choi Seungcheol");
        Penulis penulis2 = new Penulis("Yoon Jeonghan");
        Penulis penulis3 = new Penulis("Hong Joshua");
        Penulis penulis4 = new Penulis("Moon Junhui");
        Penulis penulis5 = new Penulis("Jeon Wonwoo");

        tambahBuku(new Buku("Kuliah Bikin Gila?", penulis1, "Psikologi"));
        tambahBuku(new Buku("Info Alamat Psikiater", penulis2, "Psikologi"));
        tambahBuku(new Buku("10 Psikiater Sakti", penulis3, "Psikologi"));
        tambahBuku(new Buku("Ayo Pakai Dukun Saja", penulis4, "Psikologi"));
        tambahBuku(new Buku("NGODING BIKIN GILA? ASLI NO FEK FEK!", penulis5, "Psikologi"));
    }

    private void tambahBukuPolitik() {
        Penulis penulis1 = new Penulis("Lee Woozi");
        Penulis penulis2 = new Penulis("Kwon Hoshi");
        Penulis penulis3 = new Penulis("Lee Dokyeom");
        Penulis penulis4 = new Penulis("Kim Mingyu");
        Penulis penulis5 = new Penulis("The 8");

        tambahBuku(new Buku("Pilih 02? Rill Kah Min?", penulis1, "Politik"));
        tambahBuku(new Buku("Tips Jadi Pejabat dalam Satu Malam", penulis2, "Politik"));
        tambahBuku(new Buku("Cara Tidak Korupsi", penulis3, "Politik"));
        tambahBuku(new Buku("Joowi 3 Periode", penulis4, "Politik"));
        tambahBuku(new Buku("Politik Dinasti", penulis5, "Politik"));
    }

    private void tambahBukuFiksi() {
        Penulis penulis1 = new Penulis("Boo Seungkwan");
        Penulis penulis2 = new Penulis("Chwe Vernon");
        Penulis penulis3 = new Penulis("Lee Dino");
        Penulis penulis4 = new Penulis("Harry Styles");
        Penulis penulis5 = new Penulis("Zayn Malik");

        tambahBuku(new Buku("Heri Poter", penulis1, "Fiksi"));
        tambahBuku(new Buku("Kehidupan Setelah Meninggal", penulis2, "Fiksi"));
        tambahBuku(new Buku("Peri Kecil Ayah", penulis3, "Fiksi"));
        tambahBuku(new Buku("Adek Mau jadi Bidadari", penulis4, "Fiksi"));
        tambahBuku(new Buku("Mark Jadi Pacar Yessi", penulis5, "Fiksi"));
    }

    public static void tampilkanKoleksi() {
        System.out.println("Daftar Buku dalam Perpustakaan:");
        for (Buku buku : koleksiBuku) {
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Penulis: " + buku.getPenulis().getNama());
            System.out.println("Kategori: " + buku.getKategori());
            System.out.println();
        }
    }

    public static void tampilkanBukuPerKategori(String kategori) {
        System.out.println("Daftar Buku dalam Kategori " + kategori + ":");
        int count = 0;
        for (Buku buku : koleksiBuku) {
            if (buku.getKategori().equalsIgnoreCase(kategori)) {
                System.out.println("Judul: " + buku.getJudul());
                System.out.println("Penulis: " + buku.getPenulis().getNama());
                System.out.println();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Tidak ada buku dalam kategori " + kategori);
        }
    }

    public static void cariBuku(String judul) {
        boolean found = false;
        System.out.println("Daftar Buku yang Ditemukan dengan Judul '" + judul + "':");
        for (Buku buku : koleksiBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Judul: " + buku.getJudul());
                System.out.println("Penulis: " + buku.getPenulis().getNama());
                System.out.println("Kategori: " + buku.getKategori());
                System.out.println();
                found = true;
                break; // Menghentikan pencarian setelah buku ditemukan
            }
        }
        if (!found) {
            System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaanX = new Perpustakaan("Perpustakaan Kampus X");

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Perpustakaan NEO SVT 1D");
            System.out.println("Selamat Datang di Perpustakan NEO SVT 1D!");
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Semua Buku");
            System.out.println("2. Tampilkan Buku per Kategori");
            System.out.println("3. Cari Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    Perpustakaan.tampilkanKoleksi();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Masukkan kategori buku: ");
                    String kategori = scanner.nextLine();
                    Perpustakaan.tampilkanBukuPerKategori(kategori);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    Perpustakaan.cariBuku(judul);
                    break;
                case 4:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}
