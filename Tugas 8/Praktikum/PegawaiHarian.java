class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    @Override
    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            int jamNormal = 40;
            int jamLembur = totalJam - jamNormal;
            return (upahPerJam * jamNormal) + (jamLembur * upahPerJam * 1.5);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nUpah/jam: Rp " + upahPerJam + "\nTotal jam kerja: " + totalJam + " jam" + "\nPendapatan: Rp " + gaji();
    }
}