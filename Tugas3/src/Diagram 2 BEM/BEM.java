public class BEM {
    private String namaKabinet;
    private String ketuaBEM;
    private String visi;
    private String misi;

    public BEM(String namaKabinet, String ketuaBEM, String visi, String misi) {
        this.namaKabinet = namaKabinet;
        this.ketuaBEM = ketuaBEM;
        this.visi = visi;
        this.misi = misi;
    }

    public void ajukanProposal(String judulProposal, String deskripsi) {
        System.out.println("Proposal dengan judul '" + judulProposal + "' telah diajukan.");
        System.out.println("Deskripsi: " + deskripsi);
    }

    public void eventBEM(String namaEvent, String tanggal, String tempat) {
        System.out.println("Event dengan nama '" + namaEvent + "' sedang direncanakan.");
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Tempat: " + tempat);
    }

    public void koordinasiTim(String jenisKoordinasi) {
        System.out.println("Koordinasi tim untuk " + jenisKoordinasi + " sedang dilakukan.");
    }

    // Getter dan setter lainnya sesuai kebutuhan
}
