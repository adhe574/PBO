public class Mobil {
    private String merk = "Toyota";
    private int kecepatan;

    public String getMerek() {
        return merk;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void tampilInformasi() {
        System.out.println("Merek : " + getMerek());
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
    }
}