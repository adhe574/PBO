import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarAnggota = new ArrayList<>();
        daftarBuku = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanData() {
        System.out.println("=== Daftar Anggota : ===");
        for (Anggota anggota : daftarAnggota) {
            System.out.println(anggota);
            anggota.tampilkanBukuDipinjam();
        }

        System.out.println("\n=== Daftar Buku : ===");
        for (Buku buku : daftarBuku) {
            System.out.println(buku.tampilkanInfo());
        }
    }
}