import java.time.LocalDate;

public class ProductionWorker extends Employee {
    private double wagePerPiece; // Upah per barang
    private int quantityProduced; // Jumlah barang yang diproduksi

    public ProductionWorker(String name, String noKTP, LocalDate birthDate, double wagePerPiece, int quantityProduced) {
        super(name, noKTP, birthDate);
        setWagePerPiece(wagePerPiece);
        setQuantityProduced(quantityProduced);
    }

    public void setWagePerPiece(double wagePerPiece) {
        this.wagePerPiece = wagePerPiece;
    }

    public double getWagePerPiece() {
        return wagePerPiece;
    }

    public void setQuantityProduced(int quantityProduced) {
        this.quantityProduced = quantityProduced;
    }

    public int getQuantityProduced() {
        return quantityProduced;
    }

    public double earnings() {
        return getWagePerPiece() * getQuantityProduced();
    }

    @Override
    public String toString() {
        return String.format("Production Worker:\n%s\nwage per piece: %.2f\nquantity produced: %d", super.toString(), getWagePerPiece(), getQuantityProduced());
    }
}
