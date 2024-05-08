abstract class Kue {
    // Atribut
    protected String nama;
    protected double harga;

    // Abstract method
    public abstract double hitungHarga();

    // Constructor
    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method toString
    @Override
    public String toString() {
        return "Kue " + nama + " - Harga: " + hitungHarga();
    }
}