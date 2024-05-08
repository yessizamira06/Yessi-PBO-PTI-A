class KueJadi extends Kue {
    // Atribut
    double jumlah;

    // Constructor
    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    // Implementasi abstract method
    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }

    // Method toString
    @Override
    public String toString() {
        return super.toString() + " - Jumlah: " + jumlah;
    }
}
