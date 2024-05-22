package latihaninterface;

import java.util.Scanner;

public class Manusia implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta nama dari pengguna
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Meminta umur dari pengguna
        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        // Menginstansiasi objek Manusia dengan nama dan umur yang dimasukkan pengguna
        Manusia anda = new Manusia(nama, umur);

        // Menampilkan informasi nama dan umur yang dimasukkan pengguna
        System.out.println("Nama: " + anda.nama);
        System.out.println("Umur: " + anda.umur);

        scanner.close();
    }

    @Override
    public void tampilkanNama() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilkanNama'");
    }

    @Override
    public void tampilkanUmur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tampilkanUmur'");
    }

    @Override
    public void makan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makan'");
    }

    @Override
    public void berjalan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'berjalan'");
    }

    @Override
    public void bersuara() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'bersuara'");
    }
}
