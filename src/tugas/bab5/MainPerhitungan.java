package mainperhitungan;

import java.util.Scanner;

public class MainPerhitungan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("======= PROGRAM PERHITUNGAN =======");
        System.out.println("");
        System.out.print("-Masukkan nilai 1 : ");
        int bil1 = in.nextInt();
        System.out.print("-Masukkan nilai 2 : ");
        int bil2 = in.nextInt();
        System.out.println(" ");
        Perhitungan.Penjumlahan(bil1, bil2);
        Perhitungan.Pengurangan(bil1, bil2);
        Perhitungan k = new Perhitungan();
        k.Perkalian(bil1, bil2);
        Perhitungan b = new Perhitungan();
        b.Pembagian(bil1, bil2);

    }
}