import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] usernames = {"Mark Lee", "Yessi Zamira"};
    static String[] passwords = {"horanghae", "pacarmarklee"};
    static String[][] biodatas = {
        {"Mark Lee", "25", "Jalan Kenangan Nomor 23"},
        {"Yessi Zamira", "18", "Jalan Terusan Cikampek Nomor 2"}
    };
    static String[][] schedules = new String[2][5]; // Jadwal kuliah untuk setiap pengguna

    public static void main(String[] args) {
        fillSchedules();
        login();
    }

    public static void login() {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = false;
        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                isAuthenticated = true;
                System.out.println("Login berhasil!");
                showMenu(i);
                break;
            }
        }
        if (!isAuthenticated) {
            System.out.println("Username atau password salah. Silakan coba lagi.");
            login();
        }
    }

    public static void showMenu(int index) {
        System.out.println("Menu:");
        System.out.println("1. Tampilkan Biodata");
        System.out.println("2. Tampilkan Jadwal Kuliah");
        System.out.println("3. Keluar");

        System.out.print("Pilih menu: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        
        switch (choice) {
            case 1:
                showBiodata(index);
                break;
            case 2:
                showSchedule(index);
                break;
            case 3:
                System.out.println("Terima kasih telah menggunakan SIAM UB.");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                showMenu(index);
                break;
        }
    }

    public static void showBiodata(int index) {
        System.out.println("Biodata:");
        System.out.println("Nama: " + biodatas[index][0]);
        System.out.println("Umur: " + biodatas[index][1]);
        System.out.println("Alamat: " + biodatas[index][2]);
        showMenu(index);
    }

    public static void showSchedule(int index) {
        System.out.println("Jadwal Kuliah:");
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        for (int i = 0; i < schedules[index].length; i++) {
            System.out.println(days[i] + ": " + schedules[index][i]);
        }
        showMenu(index);
    }

    public static void fillSchedules() {
        schedules[0] = new String[]{"Pemograman Berorientasi Objek", "Bahasa Indonesia", "Teori Belajar dan Mengajar", "Manajemen Kurikulum dan Bidang Studi", "Sistem Operasi"};
        schedules[1] = new String[]{"Sistem Operasi", "Teori Belajar dan Mengajar", "Pemograman Berorientasi Objek", "Manajemen Kurikulum dan Bidang Studi", "Bahasa Indonesia"};
    }
}
