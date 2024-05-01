import java.time.LocalDate;
import java.text.DecimalFormat;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, LocalDate tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getTunjangan() {
        return 0.1 * super.getGaji();
    }

    public double getPendapatan() {
        return super.getPendapatan() + getTunjangan();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.0");
        return super.toString() + "\ndepartemen : " + departemen;
    }
}
