public class Petugas {
    private String nama, idPetugas;

    public Petugas(String nama, String idPetugas) {
        this.nama = nama;
        this.idPetugas = idPetugas;
    }

    public void catatTransaksi(Anggota a, DapatDipinjam i) {
        System.out.println("Petugas " + nama + " mencatat transaksi peminjaman untuk " + a.getNama());
    }   
}
