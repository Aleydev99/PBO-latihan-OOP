abstract class ItemPerpustakaan {
    protected String kodeItem, judul;
    protected int tahunTerbit;

    public ItemPerpustakaan(String kodeItem, String judul, int tahunTerbit) {
        this.kodeItem = kodeItem;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    abstract void info();
}