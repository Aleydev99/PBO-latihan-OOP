# Tugas PBO : OOP
> Kelompok
> 1. Aditya (F1D02310032)
> 2. M. Ali Abidillah Khotami (F1D02310073)

### A. Abstract Class / Interface
- Abstract Class `ItemPerpustakaan`: kerangka dasar untuk semua item.  
  - Atribut konkret (protected): `kodeItem`, `judul`, `tahunTerbit`  
  - Method konkret: konstruktor untuk inisialisasi atribut dasar  
  - Abstract method: `void info()` yang harus dioverride oleh subclass
- Interface `DapatDipinjam`: kontrak sifat untuk item yang bisa dipinjam.  
  - Method: `void pinjam()`, `void kembalikan()`  
  - Diimplementasikan oleh: `Buku`, `Majalah`, `DVD`

### B. Inheritance (Pewarisan)
- `Buku`, `Majalah`, `DVD` extends `ItemPerpustakaan` mewarisi atribut dasar (`kodeItem`, `judul`, `tahunTerbit`) dan mengoverride `info()`.
- Setiap subclass menambah atribut spesifik:  
  - Buku `pengarang`  
  - Majalah `edisi`  
  - DVD `durasi` (menit)

### C. Polymorphism
- Referensi bertipe `ItemPerpustakaan` dapat menunjuk objek konkret `Buku` / `Majalah` / `DVD`.  
- Pemanggilan `item.info()` pada elemen array yang sama mengeksekusi implementasi berbeda sesuai tipe aktual objek (dynamic dispatch).  
- Melalui `DapatDipinjam`, method `pinjam()` dan `kembalikan()` dipanggil dengan cara yang sama pada tipe yang berbeda.

### D. Array of Object
- Koleksi disusun sebagai array objek:
  - `ItemPerpustakaan[] koleksi = { new Buku(...), new Majalah(...), new DVD(...) }`
- Iterasi array mem-demonstrasikan polimorfisme (`for (ItemPerpustakaan item : koleksi) item.info();`).
- (Opsional) Transaksi dapat dikelola dalam daftar/array terpisah apabila diperlukan (`TransaksiPeminjaman[]`).

---

## Implementasi Konkret
- Buku (extends `ItemPerpustakaan`, implements `DapatDipinjam`): menampilkan info judul, pengarang; mengatur status saat dipinjam/dikembalikan.
- Majalah (extends `ItemPerpustakaan`, implements `DapatDipinjam`): menampilkan info judul, edisi; mengatur status pinjam/kembali.
- DVD (extends `ItemPerpustakaan`, implements `DapatDipinjam`): menampilkan info judul, durasi (menit); mengatur status pinjam/kembali.
- Anggota: aktor peminjam; memiliki metode untuk meminjam item (`pinjamItem(DapatDipinjam)`).
- Petugas: mencatat transaksi (membuat `TransaksiPeminjaman`, mencetak bukti).
- TransaksiPeminjaman: menyimpan referensi `Anggota` + `DapatDipinjam` serta tanggal pinjam/kembali (komposisi objek).

---

## File dalam Project
1. ItemPerpustakaan.java - Abstract class dasar semua item perpustakaan
2. DapatDipinjam.java - Interface kontrak peminjaman/pengembalian
3. Buku.java - Implementasi buku (extends `ItemPerpustakaan`, implements `DapatDipinjam`)
4. Majalah.java - Implementasi majalah (extends `ItemPerpustakaan`, implements `DapatDipinjam`)
5. DVD.java - Implementasi DVD (extends `ItemPerpustakaan`, implements `DapatDipinjam`)
6. Anggota.java - Representasi peminjam (memanggil `pinjamItem(...)`)
7. Petugas.java - Pencatatan transaksi (`catatTransaksi(...)`)
8. TransaksiPeminjaman.java - Pencatatan tanggal pinjam/kembali & bukti
9. Main.java - Demo: membuat array `ItemPerpustakaan[]`, menampilkan info (polimorfisme), serta transaksi

---

## Cara Menjalankan
```bash
javac *.java
java Main
```

## Konsep OOP yang Dipelajari 
1. Inheritance: Reuse atribut & sifat dasar dari `ItemPerpustakaan` oleh `Buku/Majalah/DVD`.
2. Polymorphism: Satu referensi (`ItemPerpustakaan`) memanggil implementasi berbeda (`info()`) tergantung tipe objek sebenarnya.
3. Abstract Class & Interface: Kerangka sifat (`ItemPerpustakaan`) + kontrak seragam (`DapatDipinjam`) untuk berbagai tipe item.
4. Array of Object: Penyimpanan koleksi sebagai `ItemPerpustakaan[]` untuk iterasi polimorfik dan pengelolaan terstruktur.

---

## Output Program 
Program akan menampilkan:
- Daftar koleksi lewat iterasi `ItemPerpustakaan[]` → memanggil `info()` (polimorfisme).
- Pencatatan transaksi (petugas → anggota + item) dan bukti transaksi (tanggal pinjam/kembali).
- Proses pengembalian yang memanggil `kembalikan()` via interface `DapatDipinjam`.