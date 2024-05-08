import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate danielBirthDate = LocalDate.of(1990, 5, 15); // Tanggal lahir Daniel
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", danielBirthDate, 800.00);

        LocalDate karinaBirthDate = LocalDate.of(1995, 7, 20); // Tanggal lahir Karina
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", karinaBirthDate, 16.75, 40);

        LocalDate keanuBirthDate = LocalDate.of(1980, 9, 2); // Tanggal lahir Keanu
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", keanuBirthDate, 10000, 0.06);

        LocalDate bondanBirthDate = LocalDate.of(1985, 12, 10); // Tanggal lahir Bondan
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", bondanBirthDate, 5000, 0.04, 300);

        LocalDate riniBirthDate = LocalDate.of(1993, 3, 25); // Tanggal lahir Rini
        ProductionWorker productionWorker = new ProductionWorker("Rini", "678", riniBirthDate, 2.5, 1000);

        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee, productionWorker};

        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            double earnings = currentEmployee.earnings();
            System.out.printf("Pendapatan: $%,.2f\n\n", earnings);
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
