public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    public boolean isRasional() {
        return (penyebut != 0);
    }

    public void sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;

        for (; B != 0;) {
            temp = A % B;
            A = B;
            B = temp;
        }

        pembilang /= A;
        penyebut /= A;
    }

    public double cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    public boolean lebihKecilDari(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }
    
    public boolean lebihKecilSamaDengan(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }
    
    public boolean lebihBesarSamaDengan(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    public void kurang(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    
    public void kali(Rasional A) {
        pembilang *= A.pembilang;
        penyebut *= A.penyebut;
    }
    
    public void bagi(Rasional A) {
        pembilang *= A.penyebut;
        penyebut *= A.pembilang;
    }
    

    public void negasi() {
        pembilang = -pembilang;
    }

    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
