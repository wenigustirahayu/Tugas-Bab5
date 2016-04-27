package mainjaket;

public class Jaket {

    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;

    public void hitungDiskonA(int beliA) {
        if (beliA > 100) {
            int harga = beliA * 95000;
            System.out.println("Selamat, anda mendapatkan Diskon.");
            System.out.println("Jaket A : Rp 95.000/pcs");
            System.out.println("Total Harga: " + harga);
        } else if (beliA <= 100) {
            int harga = beliA * jaketA;
            System.out.println("Total Harga : " + harga);
        }
    }
}

