import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate birthDate; // Tambah atribut tanggal lahir

    public Employee(String name, String noKTP, LocalDate birthDate){ // Tambah parameter birthDate di konstruktor
        this.name = name;
        this.noKTP = noKTP;
        this.birthDate = birthDate;
    }

    public String getName(){
        return name;
    }

    public String getNoKTP(){
        return noKTP;
    }
    
    // Accessor dan mutator untuk atribut birthDate
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP : "+getNoKTP());
    }

    public abstract double earnings(); // Method untuk menghitung pendapatan

}
