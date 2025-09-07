public class laptop {
    String merk;
    int harga;
    int volume;

    public laptop(String m, int h) {
        merk = m;
        harga = h;
        volume = 50;
    }

    public void displayInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Harga: " + harga);
        System.out.println("Volume: " + volume);
    }

    public void nyalakanLaptop() {
        System.out.println("Laptop " + merk + " menyala.");
    }

    public void matikanLaptop() {
        System.out.println("Laptop " + merk + " mati.");
    }

    public void tambahVolume(int increment) {
        volume += increment;
        if (volume > 100) {
            volume = 100;
        }
        System.out.println("Volume sekarang : " + volume);
    }

    public void kurangiVolume(int decrement) {
        volume -= decrement;
        if (volume < 0) {
            volume = 0;
        }
        System.out.println("Volume sekarang: " + volume);
    }
}