public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Anggota anggota1 = new Anggota("Alice", "A001");
        Anggota anggota2 = new Anggota("Bob", "B002");

        Buku buku1 = new Buku("Pemrograman Java", "John Doe");
        Buku buku2 = new Buku("Struktur Data", "Jane Smith");
        Buku buku3 = new Buku("Basis Data", "Mike Johnson");

        perpustakaan.tambahAnggota(anggota1);
        perpustakaan.tambahAnggota(anggota2);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        anggota1.pinjamBuku(buku1);
        anggota1.pinjamBuku(buku2);
        anggota2.pinjamBuku(buku3);

        perpustakaan.tampilkanData();

        anggota1.kembalikanBuku(buku1);
        anggota2.kembalikanBuku(buku3);

        System.out.println("\nSetelah pengembalian buku :\n");
        perpustakaan.tampilkanData();
    }
}