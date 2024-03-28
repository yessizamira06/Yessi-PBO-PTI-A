import java.util.Scanner;

class Pelanggan {
    private String nomorAkun;
    private String nama;
    private double saldo;
    private int pin;
    private int percobaanLogin;

    public Pelanggan(String nomorAkun, String nama, double saldo, int pin) {
        this.nomorAkun = nomorAkun;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.percobaanLogin = 0;
    }

    public String getNomorAkun() {
        return nomorAkun;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }

    public boolean beli(double jumlah, int pin) {
        if (this.pin != pin || percobaanLogin >= 3) {
            System.out.println("PIN salah atau akun terkunci.");
            return false;
        }

        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
            return false;
        }

        saldo -= jumlah;
        System.out.println("Transaksi berhasil.");
        return true;
    }

    public void topUp(double jumlah, int pin) {
        if (this.pin != pin || percobaanLogin >= 3) {
            System.out.println("PIN salah atau akun terkunci.");
            return;
        }

        saldo += jumlah;
        System.out.println("Top-up berhasil. Saldo baru: Rp" + saldo);
    }

    public String getJenisAkun() {
        if (nomorAkun.startsWith("38")) {
            return "Silver";
        } else if (nomorAkun.startsWith("56")) {
            return "Gold";
        } else if (nomorAkun.startsWith("74")) {
            return "Platinum";
        } else {
            return "Unknown";
        }
    }

    
     public double hitungCashback(double jumlah) {
        String jenisAkun = getJenisAkun();
        double cashback = 0.0;

        if (jumlah > 1000000) {
            if (jenisAkun.equals("Silver")) {
                cashback = jumlah * 0.05;
            } else if (jenisAkun.equals("Gold")) {
                cashback = jumlah * 0.07;
            } else if (jenisAkun.equals("Platinum")) {
                cashback = jumlah * 0.10;
            }
        }

        return cashback;
    }



    public boolean isAkunTerkunci() {
        return percobaanLogin >= 3;
    }

    public void tambahPercobaanLogin() {
        percobaanLogin++;
    }
}
