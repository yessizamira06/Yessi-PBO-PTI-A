package praktikumpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan warna kotak: ");
        String warnaKotak = scanner.nextLine();
        
        Rectangle kotak1 = new Rectangle(warnaKotak);
        Rectangle kotak2 = new Rectangle();
        Rectangle kotak3 = new Rectangle();
        
        kotak1.howToColor();
        kotak2.howToColor();
        
        System.out.print("Masukkan kategori kotak: ");
        int kategoriKotak = scanner.nextInt();
        kotak3.compareTo(kategoriKotak);
        
        scanner.close();
    }
}
