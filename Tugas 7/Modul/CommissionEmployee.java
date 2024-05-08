import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double grossSales; // Penjualan per minggu
    private double commissionRate; // Komisi

    public CommissionEmployee(String name, String noKTP, LocalDate birthDate, double sales, double rate){
        super(name, noKTP, birthDate);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales){
        grossSales = sales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setCommissionRate(double rate){
        commissionRate = rate;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("Commission employee:\n%s\ngross sales: %.2f\ncommission rate: %.2f", super.toString(), getGrossSales(), getCommissionRate());
    }
}
