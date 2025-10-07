public class DVD extends ItemPerpustakaan implements DapatDipinjam {
    private int durasi;

    public DVD(String kodeItem, String judul, int tahunTerbit, int durasi) {
        super(kodeItem, judul, tahunTerbit);
        this.durasi = durasi;
    }

    void info() {
        System.out.println("DVD " + judul + "(" + kodeItem + ")" + " (" + durasi + " menit)" + ", " + tahunTerbit);
    }

    public void pinjam() { System.out.println("DVD \"" + judul + "\" dipinjam."); }
    public void kembalikan() { System.out.println("DVD \"" + judul + "\" dikembalikan."); }
    
}
