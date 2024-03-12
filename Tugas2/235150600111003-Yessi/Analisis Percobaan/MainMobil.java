import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Mobil m1 = new Mobil();
        System.out.println("Masukkan kecepatan mobil m1 (km/h): ");
        int kecepatan1 = input.nextInt();
        m1.setKecepatan(kecepatan1);
        System.out.println("Masukkan manufaktur mobil m1: ");
        String manufaktur1 = input.next();
        m1.setManufaktur(manufaktur1);
        System.out.println("Masukkan nomor plat mobil m1: ");
        String noPlat1 = input.next();
        m1.setNoPlat(noPlat1);
        System.out.println("Masukkan warna mobil m1: ");
        String warna1 = input.next();
        m1.setWarna(warna1);
        
        Mobil m2 = new Mobil();
        System.out.println("Masukkan kecepatan mobil m2 (km/h): ");
        int kecepatan2 = input.nextInt();
        m2.setKecepatan(kecepatan2);
        System.out.println("Masukkan manufaktur mobil m2: ");
        String manufaktur2 = input.next();
        m2.setManufaktur(manufaktur2);
        System.out.println("Masukkan nomor plat mobil m2: ");
        String noPlat2 = input.next();
        m2.setNoPlat(noPlat2);
        System.out.println("Masukkan warna mobil m2: ");
        String warna2 = input.next();
        m2.setWarna(warna2);
        
        System.out.println("================");
        m1.displayMessage();
        System.out.println("================");
        m2.displayMessage();
        
        input.close();
    }
}
