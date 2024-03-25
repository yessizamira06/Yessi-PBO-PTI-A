package Student;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student david = new Student("Mark Lee", "Canada", 19, 90, 85, 88);
        david.displayMessage();

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        Student[] students = new Student[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan data untuk siswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String name = scanner.next();
            System.out.print("Alamat: ");
            String address = scanner.next();
            System.out.print("Umur: ");
            int age = scanner.nextInt();
            System.out.print("Nilai Matematika: ");
            double mathGrade = scanner.nextDouble();
            System.out.print("Nilai Bahasa Inggris: ");
            double englishGrade = scanner.nextDouble();
            System.out.print("Nilai IPA: ");
            double scienceGrade = scanner.nextDouble();

            students[i] = new Student(name, address, age, mathGrade, englishGrade, scienceGrade);
        }

        for (Student siswa : students) {
            siswa.displayMessage();
            System.out.println();
        }

        Student.jumlahObjek();
    }
}
