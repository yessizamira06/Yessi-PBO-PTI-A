public class Test {
    public static void main(String [] args) {
    Student s1=new Student();
    s1.setName("Enkapsulasi");
    //Pada baris 12, parameter yang diterima oleh method setMark
    // adalah tipe data int, namun dalam pemanggilannya pada baris 10, nilai yang
    // diberikan adalah String ("90"). Ini akan menyebabkan kesalahan kompilasi karena
    // tipe data yang tidak sesuai.
    s1.setMark(90);
    // Pada baris 14, saat mencoba mencetak nilai dari name dan mark,
    // variabel-variabel ini tidak dideklarasikan di dalam class Test,
    // sehingga akan menyebabkan kesalahan kompilasi.
    System.out.println("s1Name is "+s1.getName());
    System.out.println("s1Mark is "+s1.getMark());

    }
   }
   