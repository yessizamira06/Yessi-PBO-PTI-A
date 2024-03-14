public class Jadwal {
    private String hari;
    private String waktu;

    // Konstruktor
    public Jadwal(String hari, String waktu) {
        this.hari = hari;
        this.waktu = waktu;
    }

    // Metode getter dan setter
    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
