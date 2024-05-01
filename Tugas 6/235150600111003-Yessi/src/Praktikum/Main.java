import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Manusia
        Manusia manusiaA = new Manusia("Jeon Wonwoo", "111", true, true);
        Manusia manusiaB = new Manusia("Jennie Kim", "222", false, true);
        Manusia manusiaC = new Manusia("Lee Haechan", "333", true, false);

        System.out.println(manusiaA);
        System.out.println();
        System.out.println(manusiaB);
        System.out.println();
        System.out.println(manusiaC);
        System.out.println();

        // MahasiswaFILKOM
        MahasiswaFILKOM mahasiswaA = new MahasiswaFILKOM("235150700111033", 2.5, "M Zaidan Azizi", "232323232323", true, true);
        MahasiswaFILKOM mahasiswaB = new MahasiswaFILKOM("235150600111003", 3.2, "Yessi Zamira", "1313131313", false, true);
        MahasiswaFILKOM mahasiswaC = new MahasiswaFILKOM("225150200111032", 3.8, "Malik Wartana", "3333333333", true, false);

        System.out.println(mahasiswaA);
        System.out.println();
        System.out.println(mahasiswaB);
        System.out.println();
        System.out.println(mahasiswaC);
        System.out.println();

        // Pekerja
        Pekerja pekerjaA = new Pekerja(2000, LocalDate.of(2019, 1, 1), 2, "Kim Mingyu", "111", true, true);
        Pekerja pekerjaB = new Pekerja(3000, LocalDate.of(2013, 1, 1), 0, "Lisa Manoban", "222", false, false);
        Pekerja pekerjaC = new Pekerja(4000, LocalDate.of(2000, 1, 1), 10, "Lee Jeno", "333", true, true);

        System.out.println(pekerjaA);
        System.out.println();
        System.out.println(pekerjaB);
        System.out.println();
        System.out.println(pekerjaC);
        System.out.println();

        // Manager
        Manager managerA = new Manager("HRD", 5000, LocalDate.of(2005, 1, 1), 3, "Bareska Harsacandra", "444", true, true);
        Manager managerB = new Manager("Finance", 7500, LocalDate.of(2010, 1, 1), 2, "Rose Park", "555", false, true);
        Manager managerC = new Manager("Marketing", 10000, LocalDate.of(1999, 1, 1), 5, "Mark Lee", "666", true, false); 

        System.out.println(managerA);
        System.out.println();
        System.out.println(managerB);
        System.out.println();
        System.out.println(managerC);
        System.out.println();
    }
}
