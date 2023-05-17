// Kelas abstrak yang merepresentasikan obat
abstract class Obat {
    private String nama;
    private int stok;

    public Obat(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public abstract void tambahStok(int jumlah);

    public abstract void kurangiStok(int jumlah);
}

// Kelas turunan yang mewarisi dari kelas Obat
class ObatCair extends Obat {
    public ObatCair(String nama, int stok) {
        super(nama, stok);
    }

    @Override
    public void tambahStok(int jumlah) {
        System.out.println("Menambahkan " + jumlah + " botol obat cair " + getNama() + " ke stok.");
        // Logika penambahan stok obat cair
        // ...
    }

    @Override
    public void kurangiStok(int jumlah) {
        System.out.println("Mengurangi " + jumlah + " botol obat cair " + getNama() + " dari stok.");
        // Logika pengurangan stok obat cair
        // ...
    }
}

// Kelas turunan yang mewarisi dari kelas Obat
class ObatTablet extends Obat {
    public ObatTablet(String nama, int stok) {
        super(nama, stok);
    }

    @Override
    public void tambahStok(int jumlah) {
        System.out.println("Menambahkan " + jumlah + " strip obat tablet " + getNama() + " ke stok.");
        // Logika penambahan stok obat tablet
        // ...
    }

    @Override
    public void kurangiStok(int jumlah) {
        System.out.println("Mengurangi " + jumlah + " strip obat tablet " + getNama() + " dari stok.");
        // Logika pengurangan stok obat tablet
        // ...
    }
}

// Kelas turunan yang mewarisi dari kelas Obat
class ObatKapsul extends Obat {
    public ObatKapsul(String nama, int stok) {
        super(nama, stok);
    }

    @Override
    public void tambahStok(int jumlah) {
        System.out.println("Menambahkan " + jumlah + " kapsul obat " + getNama() + " ke stok.");
        // Logika penambahan stok obat kapsul
        // ...
    }

    @Override
    public void kurangiStok(int jumlah) {
        System.out.println("Mengurangi " + jumlah + " kapsul obat " + getNama() + " dari stok.");
        // Logika pengurangan stok obat kapsul
        // ...
    }
}

// Kelas utama
public class ManajemenStokObat {
    public static void main(String[] args) {
        Obat obat1 = new ObatCair("ObatCairA", 10);
        Obat obat2 = new ObatTablet("ObatTabletB", 20);
        Obat obat3 = new ObatKapsul("ObatKapsulC", 15);

        obat1.tambahStok(5);
        obat2.kurangiStok(3);
        obat3.tambahStok(8);

        System.out.println("Stok obat cair " + obat1.getNama() + ": " + obat1.getStok());
        System.out.println("Stok obat tablet " + obat2.getNama() + ": " + obat2.getStok());
        System.out.println("Stok obat kapsul " + obat3.getNama() + ": " + obat3.getStok());
    }
}


