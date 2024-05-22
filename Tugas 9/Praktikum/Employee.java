public class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public String toString() {
        StringBuilder invoiceDetails = new StringBuilder();
        for (Invoice invoice : invoices) {
            invoiceDetails.append("\n").append(invoice.toString());
        }
        return String.format("Registration Number: %d, Name: %s, Salary Per Month: %d\nInvoice Details:%s\nTotal Salary After Deduction: %.2f", 
                             registrationNumber, name, salaryPerMonth, invoiceDetails.toString(), getPayableAmount());
    }
}

