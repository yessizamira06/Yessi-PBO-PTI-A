public class Main {
    public static void main(String[] args) {
    //casting
    //double angka = 5.4;
    //int angka_int = (int)angka;
    //System.out.println(angka_int);
    //Object dengan class HeroIntel
    HeroIntel hero1 = new HeroIntel("Ucup",100);
    hero1.display();
    // //upcasting
    // Hero heroUp = (Hero)hero1;
    // heroUp.display();
    // //System.out.println(heroUp.getType()); //ini error
    // //Object dgn class Hero
    // Hero heroReg = new Hero("Boy",100);
    // heroReg.display();
    // //downcasting
    // //HeroAgility heroDown = (HeroAgility) heroReg; //ini error
    // //heroDown.display();
    // //heroUp dikembalikan ke hero1
    // HeroIntel hero2 = (HeroIntel) heroUp;
    // hero2.display(); //ini berhasil downcasting
    // HeroAgility hero3 = (HeroAgility) heroUp;
    // hero3.display();
    // Mengakses atribut 'type' secara langsung dari kelas Main
    // System.out.println(hero1.type);

    // Hero heroUp = (Hero)hero1;
    // heroUp.display();

    // Hero heroReg = new Hero("Boy",100);
    // heroReg.display();

    // HeroIntel hero2 = (HeroIntel) heroUp;
    // hero2.display();
    HeroMagic heroMagic = new HeroMagic("Merlin", 150);
    heroMagic.display();

    // Upcasting
    Hero heroUp = (Hero) heroMagic;
    heroUp.display();

    // Downcasting
    HeroMagic heroMagic2 = (HeroMagic) heroUp;
    heroMagic2.display();
     }
    }