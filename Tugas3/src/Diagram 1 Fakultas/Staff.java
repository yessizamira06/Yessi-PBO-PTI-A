public class Staff {
    private String nama;
    private String jabatan;

    // Konstruktor
    public Staff(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    // Metode getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
