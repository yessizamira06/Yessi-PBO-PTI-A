import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // Gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, LocalDate birthDate, double sales, double rate, double salary) {
        super(name, noKTP, birthDate, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("Base-Salaried employee:\n%s\nbase salary: %.2f", super.toString(), getBaseSalary());
    }
}
