public class Mobil {
    private String merek;

    public Mobil(String merek) {
        this.merek = merek;
    }

    public void maju() {
        System.out.println(merek + " maju ke depan");
    }

    public void mundur() {
        System.out.println(merek + " mundur ke belakang");
    }

    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");
        mobil.maju();
        mobil.mundur();
    }
}
