package Jobsheet03;

public class Anggota {
    private String nama;
    private String noKTP;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota (String nama, String noKTP, double limitPinjaman) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double uang) {
        if (jumlahPinjaman + uang > limitPinjaman) {
            System.out.println("Maaf, jumlah peminjaman sudah melebihi limit");
        } else {
            jumlahPinjaman += uang;
        }
    }

    public void angsur(double uang) {
        double minimalAngsuran = 0.1 * jumlahPinjaman;
        if (uang < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= uang;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
                
            }
        }
    }   
}