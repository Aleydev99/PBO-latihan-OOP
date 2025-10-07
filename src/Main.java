public class Main {
    public static void main(String[] args) {

        // Membuat array of object item perpustakaan
        ItemPerpustakaan[] koleksi = new ItemPerpustakaan[6];
        koleksi[0] = new Buku("B001", "Kultivasi Kuno ala Raja Kera Rafi", 2022, "Yoga");
        koleksi[1] = new Majalah("M001", "Teknologi ALI", 2024, 7);
        koleksi[2] = new DVD("D001", "Belajar Memahami Bahasa buatan Reksa", 2023, 120);
        koleksi[3] = new Buku("B002", "Pemrograman Alam Semesta", 2021, "Dzakanov Inshoofi");
        koleksi[4] = new Majalah("M002", "Resep Memasak Radiasi Nuklir", 2023, 15);
        koleksi[5] = new DVD("D002", "Film Edukasi Perpajakan, pajaknya di pajakin", 2020, 90);

        // Tampilkan semua item (Polymorphism)
        System.out.println("=== Daftar Koleksi Perpustakaan ===");
        for (ItemPerpustakaan item : koleksi) {
            item.info();
        }

        Anggota anggota1 = new Anggota("Faza", "A001");
        Anggota anggota2 = new Anggota("Maul", "A002");
        Petugas petugas1 = new Petugas("Wicak", "P001");

        System.out.println("\n=== Proses Peminjaman ===");
        anggota1.pinjamItem((DapatDipinjam) koleksi[0]);
        anggota2.pinjamItem((DapatDipinjam) koleksi[3]);
        petugas1.catatTransaksi(anggota1, (DapatDipinjam) koleksi[0]);
        petugas1.catatTransaksi(anggota2, (DapatDipinjam) koleksi[3]);

        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman(anggota1, (DapatDipinjam) koleksi[0], "06-10-2025");
        TransaksiPeminjaman transaksi2 = new TransaksiPeminjaman(anggota2, (DapatDipinjam) koleksi[3], "07-10-2025");
        transaksi1.cetakBukti();
        transaksi2.cetakBukti();

        transaksi1.kembalikan("10-10-2025");
        transaksi2.kembalikan("12-10-2025");
        transaksi1.cetakBukti();
        transaksi2.cetakBukti();
    }
}
