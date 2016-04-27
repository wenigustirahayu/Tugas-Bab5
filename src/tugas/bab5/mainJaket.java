package mainjaket;

import java.util.Scanner;

public class mainJaket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        System.out.println("                        CV. Labkomdas            ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Membeli >100 pcs untuk masing-masing jaket akan mendapatkan diskon!");
        do {
            System.out.println("Tipe Jaket");
            System.out.println("1. Jaket A : Rp 100.000/pcs    >100 : Rp 95.000/pcs");
            System.out.println("2. Jaket B : Rp 125.000/pcs    >100 : Rp 120.000/pcs");
            System.out.println("3. Jaket C : Rp 175.000/pcs    >100 : Rp 160.000/pcs");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Jaket: ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("");
                    System.out.println("                           JAKET A                                 ");
                    System.out.println("===================================================================");
                    Jaket jA = new Jaket();
                    System.out.print("Membeli Jaket A sebanyak : ");
                    int beliA = in.nextInt();
                    jA.hitungDiskonA(beliA);
                    System.out.println("===================================================================");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("                           JAKET B                                 ");
                    System.out.println("===================================================================");
                    Jaket jB = new Jaket();
                    System.out.print("Membeli Jaket B sebanyak : ");
                    int belB = in.nextInt();
                    jB.hitungDiskonB(belB);
                    System.out.println("===================================================================");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("                           JAKET C                                 ");
                    System.out.println("===================================================================");
                    Jaket jC = new Jaket();
                    System.out.print("Membeli Jaket C sebanyak : ");
                    int beliC = in.nextInt();
                    jC.hitungDiskonC(beliC);
                    System.out.println("===================================================================");
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("===================================================================");
                    System.out.println("                        Terima Kasih                          ");
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    System.out.println(" ");
                    break;
            }
        } while (pilihan != 0);
    }
}