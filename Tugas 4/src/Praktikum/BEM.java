public class BEM {
    private String namaKabinet;
    private String ketuaBEM;
    private String visi;
    private String misi;

    // Constructor overloading
    public BEM(String namaKabinet, String ketuaBEM, String visi, String misi) {
        this.namaKabinet = namaKabinet;
        this.ketuaBEM = ketuaBEM;
        this.visi = visi;
        this.misi = misi;
    }

    public BEM(String namaKabinet, String ketuaBEM) {
        this.namaKabinet = namaKabinet;
        this.ketuaBEM = ketuaBEM;
        this.visi = "";
        this.misi = "";
    }

    public BEM(String namaKabinet) {
        this.namaKabinet = namaKabinet;
        this.ketuaBEM = "";
        this.visi = "";
        this.misi = "";
    }

    // Method overloading
    public void ajukanProposal(String judulProposal, String deskripsi) {
        System.out.println("Proposal " + judulProposal + " diajukan dengan deskripsi: " + deskripsi);
    }

    public void ajukanProposal(String judulProposal) {
        System.out.println("Proposal " + judulProposal + " diajukan");
    }

    public void eventBEM(String namaEvent, String tanggal, String tempat) {
        System.out.println("Event " + namaEvent + " pada tanggal " + tanggal + " di " + tempat);
    }

    public void koordinasiTim(String jenisKoordinasi) {
        System.out.println("Koordinasi tim untuk " + jenisKoordinasi);
    }

    // Method instance yang mengembalikan tipe data class itu sendiri
    public BEM getThis() {
        return this;
    }
}
