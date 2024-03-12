public class BookCounter {
    public int halamanBuku;
    public int kataPerHari;
    public int banyakHari;
    public void banyakHari() {
        banyakHari = halamanBuku * 4; 
        System.out.println("Hari yang dibutuhkan untuk membaca 1 buku adalah " + banyakHari + " hari");
}
}