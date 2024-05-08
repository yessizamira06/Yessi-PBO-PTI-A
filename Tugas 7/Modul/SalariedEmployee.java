import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary; // Gaji per bulan

    public SalariedEmployee(String name, String noKTP, LocalDate birthDate, double salary) {
        super(name, noKTP, birthDate);
        setMonthlySalary(salary);
    }

    public void setMonthlySalary(double salary) {
        monthlySalary = salary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double earnings() {
        double earnings = getMonthlySalary();
        LocalDate currentDate = LocalDate.now();
        // Cek apakah bulan ini adalah ulang tahun karyawan
        if (currentDate.getMonthValue() == getBirthDate().getMonthValue()) {
            // Jika bulan ini adalah bulan ulang tahun karyawan, tambahkan 100.000 ke pendapatan
            earnings += 100000;
        }
        return earnings;
    }

    public String toString() {
        return String.format("Salaried employee: " + super.toString() +
                             "\nmonthly salary: $" + getMonthlySalary());
    }
}
