import java.util.Scanner;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan; // Diganti menjadi double untuk mengakomodasi kecepatan dalam m/s
    private double waktu; // Ditambahkan variabel waktu untuk menyimpan waktu dalam detik

    public void setNoPlat(String s){
        noPlat = s;
    }

    public void setWarna(String s){
        warna = s;
    }

    public void setManufaktur(String s){
        manufaktur = s;
    }

    public void setKecepatan(double i){ // Diganti menjadi double
        kecepatan = i;
    }

    public void setWaktu(double waktu) {
        // Konversi jam menjadi detik
        double detik = waktu * 3600;
        // Simpan waktu dalam variabel waktu
        this.waktu = detik;
    }

    private void rubahSekon(double waktu) {
        // Konversi jam menjadi detik
        double detik = waktu * 3600;
        // Simpan waktu dalam variabel waktu
        this.waktu = detik;
    }

    private void rubahKecepatan(double kecepatanKmh) {
        // Konversi kecepatan dari km/h ke m/s
        double kecepatanMs = kecepatanKmh * 1000 / 3600;
        // Simpan kecepatan dalam variabel kecepatan
        this.kecepatan = kecepatanMs;
    }

    public double hitungJarak() {
        // Hitung jarak yang dapat ditempuh oleh mobil (dalam kilometer)
        double jarak = kecepatan * waktu / 1000;
        return jarak;
    }

    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan+" m/s");
        System.out.println("Jarak yang dapat ditempuh adalah " + hitungJarak() + " km");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mobil m1 = new Mobil();
        System.out.println("Masukkan kecepatan mobil m1 (km/h): ");
        double kecepatan1 = input.nextDouble();
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
        double kecepatan2 = input.nextDouble();
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
