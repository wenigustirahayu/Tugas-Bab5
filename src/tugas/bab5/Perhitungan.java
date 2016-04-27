package mainperhitungan;

public class Perhitungan {

    private int pembilang, penyebut;

    public static void Penjumlahan(int a, int b) {
        int jumlah = a + b;
        System.out.println("[1]... Hasil penjumlahan    : " + jumlah);
    }

    public static void Pengurangan(int a, int b) {
        int kurang = a - b;
        System.out.println("[2]... Hasil pengurangan    : " + kurang);
    }

    public void Perkalian(int a, int b) {
        int kali = a * b;
        System.out.println("[3]... Hasil perkalian      : " + kali);
    }

    public void Pembagian(double a, double b) {
        double bagi = a / b;
        System.out.println("[4]... Hasil pembagian      : " + bagi);
    }

    public void Sederhana(int a, int b) {
        pembilang = a;
        penyebut = b;
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;
        while (B != 0) {
            temp = A % B;
            A = B;
            B = temp;
        }
        int hsl = pembilang /= A;
        int hsl2 = penyebut /= A;
        System.out.print("[5]... Hasil penyederhanaan : " + (hsl));
        System.out.print("/");
        System.out.println(hsl2);
    }
}
