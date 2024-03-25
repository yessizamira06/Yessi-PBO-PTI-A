package Student;
import java.util.Scanner;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    private static int count = 0;

    public Student() {
        count++;
        name = "";
        address = "";
        age = 0;
    }

    public Student(String n, String a, int ag) {
        count++;
        name = n;
        address = a;
        age = ag;
    }

    public Student(String n, String a, int ag, double math, double english, double science) {
        count++;
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(double math) {
        mathGrade = math;
    }

    public void setEnglish(double english) {
        englishGrade = english;
    }

    public void setScience(double science) {
        scienceGrade = science;
    }

    private double getAverage() {
        return (mathGrade + scienceGrade + englishGrade) / 3;
    }

    public boolean statusAkhir() {
        return getAverage() >= 61;
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata-rata " + getAverage());
        System.out.println("Status: " + (statusAkhir() ? "Lolos" : "Remidi"));
    }

    public static void jumlahObjek() {
        System.out.println("Jumlah objek Student yang dibuat: " + count);
    }
}