public class TransaksiPeminjaman {
    private String tanggalPinjam;
    private String tanggalKembali;
    private Anggota anggota;
    private DapatDipinjam item;

    public TransaksiPeminjaman(Anggota anggota, DapatDipinjam item, String tanggalPinjam) {
        this.anggota = anggota;
        this.item = item;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = "-";
    }

    public void kembalikan(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
        item.kembalikan();
        System.out.println("Item dikembalikan oleh " + anggota.getNama() + " pada " + tanggalKembali);
    }

    public void cetakBukti() {
        System.out.println("\n=== Bukti Transaksi ===");
        System.out.println("Anggota: " + anggota);
        System.out.println("Tanggal Pinjam: " + tanggalPinjam);
        System.out.println("Tanggal Kembali: " + tanggalKembali);
        System.out.println("========================");
    }
}
