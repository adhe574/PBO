import java.util.ArrayList;

public class Anggota {
    private String nama;
    private String idAnggota;
    private ArrayList<Buku> bukuDipinjam;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.bukuDipinjam = new ArrayList<>();
    }

    public void pinjamBuku(Buku buku) {
        if (buku.isTersedia()) {
            buku.pinjam();
            bukuDipinjam.add(buku);
        } else {
            System.out.println("Buku " + buku.getJudul() + " tidak tersedia untuk dipinjam.");
        }
    }

    public void kembalikanBuku(Buku buku) {
        if (bukuDipinjam.contains(buku)) {
            buku.kembalikan();
            bukuDipinjam.remove(buku);
        } else {
            System.out.println("Buku " + buku.getJudul() + " tidak ditemukan dalam daftar pinjaman.");
        }
    }

    public void tampilkanBukuDipinjam() {
        System.out.println("Buku yang dipinjam oleh " + nama + ":");
        if (bukuDipinjam.isEmpty()) {
            System.out.println("Tidak ada buku yang dipinjam.");
        } else {
            for (Buku buku : bukuDipinjam) {
                System.out.println("- " + buku.tampilkanInfo());
            }
        }
    }

    public String toString() {
        return "Nama : " + nama + ", ID Anggota : " + idAnggota;
    }
}
