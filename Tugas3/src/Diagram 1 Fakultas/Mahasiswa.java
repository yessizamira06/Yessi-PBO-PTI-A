public class Mahasiswa {
    private String nama;
    private String NIM;
    private double IPK;

    // Konstruktor
    public Mahasiswa(String nama, String NIM, double IPK) {
        this.nama = nama;
        this.NIM = NIM;
        this.IPK = IPK;
    }

    // Metode getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
}
