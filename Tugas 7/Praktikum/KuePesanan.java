class KuePesanan extends Kue {
    // Atribut
    double berat;

    // Constructor
    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    // Implementasi abstract method
    @Override
    public double hitungHarga() {
        return harga * berat;
    }

    // Method toString
    @Override
    public String toString() {
        return super.toString() + " - Berat: " + berat + " kg";
    }
}