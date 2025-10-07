public class Anggota {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void pinjamItem(DapatDipinjam item) {
        item.pinjam();
    }

    public String getNama() {
        return nama;
    }

    public String toString() {
        return nama + " (" + idAnggota + ")";
    }
}
