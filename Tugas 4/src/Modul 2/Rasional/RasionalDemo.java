public class RasionalDemo {
    public static void main(String[] args) {
        Rasional R1 = new Rasional(1, 2);
        Rasional R2 = new Rasional(1, 3);

        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R2.isRasional());

        System.out.println("R1 > R2 : " + R1.lebihBesarDari(R2));

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();

        R1.sederhana();
        R2.sederhana();

        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();

        System.out.println("Setelah dilakukan Cast ke double menjadi : ");
        System.out.println("R1 : " + R1.cast());
        System.out.println("R2 : " + R2.cast());

        R1.negasi();
        System.out.print("Unary- dari R1 : ");
        R1.cetak();

        R1.unaryPlus(R2);
        System.out.print("Nilai dari 'R1 += R2' : ");
        R1.cetak();
    }
}
