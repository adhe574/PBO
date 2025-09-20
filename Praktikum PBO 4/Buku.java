public class Buku {
    private String judul;
    private String penulis;
    private boolean status;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.status = true;
    }

    public void pinjam() {
        if (status) {
            status = false;
            System.out.println("Buku " + judul + " berhasil dipinjam.");
        } else {
            System.out.println("Buku " + judul + " sedang tidak tersedia untuk dipinjam.");
        }
    }

    public void kembalikan() {
        if (!status) {
            status = true;
            System.out.println("Buku " + judul + " berhasil dikembalikan.");
        } else {
            System.out.println("Buku " + judul + " tidak sedang dipinjam.");
        }
    }

    public String tampilkanInfo() {
        return "Judul : " + judul + ", Penulis : " + penulis + ", Status : " + (status ? "Tersedia" : "Dipinjam");
    }

    public boolean isTersedia() {
        return status;
    }

    public String getJudul() {
        return judul;
    }
}
