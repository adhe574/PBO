public class demoLaptop {
    public static void main(String[] args) {
        laptop l1 = new laptop("Asus", 10000000);
        laptop l2 = new laptop("Acer", 8000000);

        System.out.println("Data Laptop Awal");
        l1.displayInfo();
        l2.displayInfo();
        
        l1.harga = 12000000; 
        l2.merk = "Lenovo";

        System.out.println("Data Laptop Setelah Diubah");
        l1.displayInfo();
        l2.displayInfo();

        System.out.println("Tambah/Kurangi Volume");
        l1.tambahVolume(30);
        l2.kurangiVolume(20);

        l1.nyalakanLaptop();
        l2.matikanLaptop();
    }
}