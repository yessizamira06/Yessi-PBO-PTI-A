public class Main {
    public static void main(String[] args) {
    
        Invoice invoice1 = new Invoice("Barang 1", 2, 10);
        Invoice invoice2 = new Invoice("Barang 2", 3, 15);
        Invoice[] invoices = {invoice1, invoice2};


        Employee employee = new Employee(123, "Mark Lee", 2000, invoices);

        System.out.println(employee);
    }
}

