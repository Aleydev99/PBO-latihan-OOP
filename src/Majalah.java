public class Majalah extends ItemPerpustakaan implements DapatDipinjam {
    private int edisi;

    public Majalah(String kodeItem, String judul, int tahunTerbit, int edisi) {
        super(kodeItem, judul, tahunTerbit);
        this.edisi = edisi;
    }

    void info() {
        System.out.println("MAJALAH " + judul +"(" + kodeItem + ")" + " Edisi " + edisi + ", " + tahunTerbit);
    }

    public void pinjam() { System.out.println("Majalah \"" + judul + "\" dipinjam."); }
    public void kembalikan() { System.out.println("Majalah \"" + judul + "\" dikembalikan."); }
}
