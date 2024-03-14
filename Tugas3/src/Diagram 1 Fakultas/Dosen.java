public class Dosen {
    private String nama;
    private String NIP;

    // Konstruktor
    public Dosen(String nama, String NIP) {
        this.nama = nama;
        this.NIP = NIP;
    }

    // Metode getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
}
