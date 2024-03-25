public class MainBEM {
    public static void main(String[] args) {
        // Membuat objek menggunakan constructor overloading
        BEM bem1 = new BEM("Kabinet 1", "Andhika Satria", "Visi 1", "Misi 1");
        BEM bem2 = new BEM("Kabinet 2", "Ryan");
        BEM bem3 = new BEM("Kabinet 3");

        // Memanggil method overloading dari salah satu objek
        bem1.ajukanProposal("Proposal 1", "Deskripsi Proposal 1");
        bem1.ajukanProposal("Proposal 2");
    }
}
