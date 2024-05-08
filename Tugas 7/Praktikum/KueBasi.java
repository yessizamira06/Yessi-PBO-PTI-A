class KueBasi extends Kue {
    // Atribut
    private int lamaHari;

    // Constructor
    public KueBasi(String nama, double harga, int lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    // Implementasi abstract method
    @Override
    public double hitungHarga() {
        return harga - (lamaHari * (harga * 0.1));
    }

    // Method toString
    @Override
    public String toString() {
        return super.toString() + " - Lama Hari: " + lamaHari;
    }
}
