public class Buku extends ItemPerpustakaan implements DapatDipinjam {
    private String pengarang;
    
    public Buku(String kodeItem, String judul, int tahunTerbit, String pengarang) {
        super(kodeItem, judul, tahunTerbit);
        this.pengarang = pengarang;
    }

    void info() {
        System.out.println("BUKU " + judul + "(" + kodeItem + ")" + " oleh " + pengarang +", " + tahunTerbit);
    }

    public void pinjam() { System.out.println("Buku \"" + judul + "\" dipinjam."); }
    public void kembalikan() { System.out.println("Buku \"" + judul + "\" dikembalikan."); }
}

