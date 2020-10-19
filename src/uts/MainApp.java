package uts;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        String nama;
        int pilihan, pil;
        double hrgAwal , hrgAkhir, pjk;
        double total, qty , kmbalian;

        kembalian kbali = new kembalian();

        System.out.println("Nama Barang");
        System.out.println("-------------");
        System.out.println("1. Pizza : Rp.50.000,-");
        System.out.println("2. Burger : RP.30.000,-");
        System.out.println("3. Hotdog : Rp. 25.000,-");
        System.out.println("Pembelian >5 dikenakan pajak 5%");
        System.out.println("Pembelian >5 dikenakan pajak 2%");
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        nama = keyboard.nextLine();

        System.out.print("apakah anda ingin memesan?(1.Ya / 2.No)? ");
        pil = keyboard.nextInt();

        while (pil == 1) {
            System.out.print("Masukkan pilihan anda: ");
            pilihan = keyboard.nextInt();

            if (pilihan == 1) {
                hrgAwal = 50000;
                System.out.println("Pilihan anda: Pizza");
                System.out.print("Berapa banyak : ");
                qty = keyboard.nextInt();
                if (qty > 5) {
                    hrgAkhir = qty * hrgAwal;
                    pjk = 0.05 * hrgAkhir;
                    total = hrgAkhir + pjk;
                    System.out.println("===============");
                    System.out.println("Nama anda: " + nama);
                    System.out.println("Nomor pilihan anda: " + pilihan);
                    System.out.println("Harga Awal: " + hrgAwal);
                    System.out.println("Anda memesan sebanyak: " + qty);
                    System.out.println("Harga dengan qty: " + hrgAkhir);
                    System.out.println("Pajak = " + pjk);
                    System.out.println("Total = " + total);

                } else {
                    hrgAkhir = qty * hrgAwal;
                    pjk = 0.02 * hrgAkhir;
                    total = hrgAkhir + pjk;
                    System.out.println("===============");
                    System.out.println("Nama anda: " + nama);
                    System.out.println("Nomor pilihan anda: " + pilihan);
                    System.out.println("Harga Awal: " + hrgAwal);
                    System.out.println("Anda memesan sebanyak: " + qty);
                    System.out.println("Harga dengan qty: " + hrgAkhir);
                    System.out.println("Pajak = " + pjk);
                    System.out.println("Total = " + total);
                }
            }
            if (pilihan == 2) {
                hrgAwal = 30000;
                System.out.println("Pilihan anda: Burger");
                System.out.print("Berapa banyak : ");
                qty = keyboard.nextInt();
                if (qty > 5) {
                    hrgAkhir = qty * hrgAwal;
                    pjk = 0.05 * hrgAkhir;
                    total = hrgAkhir + pjk;
                    System.out.println("===============");
                    System.out.println("Nama anda: " + nama);
                    System.out.println("Nomor pilihan anda: " + pilihan);
                    System.out.println("Harga Awal: " + hrgAwal);
                    System.out.println("Anda memesan sebanyak: " + qty);
                    System.out.println("Harga dengan qty: " + hrgAkhir);
                    System.out.println("Pajak = " + pjk);
                    System.out.println("Total = " + total);
                } else {
                    hrgAkhir = qty * hrgAwal;
                    pjk = 0.02 * hrgAkhir;
                    total = hrgAkhir + pjk;
                    System.out.println("===============");
                    System.out.println("Nama anda: " + nama);
                    System.out.println("Nomor pilihan anda: " + pilihan);
                    System.out.println("Harga Awal: " + hrgAwal);
                    System.out.println("Anda memesan sebanyak: " + qty);
                    System.out.println("Harga dengan qty: " + hrgAkhir);
                    System.out.println("Pajak = " + pjk);
                    System.out.println("Total = " + total);
                }
            }
            if (pilihan == 3) {
                hrgAwal = 25000;
                System.out.println("Pilihan anda: Hotdog");
                System.out.print("Berapa banyak : ");
                qty = keyboard.nextInt();
                if (qty > 5) {
                    hrgAkhir = qty * hrgAwal;
                    pjk = 0.05 * hrgAkhir;
                    total = hrgAkhir + pjk;
                    System.out.println("===============");
                    System.out.println("Nama anda: " + nama);
                    System.out.println("Nomor pilihan anda: " + pilihan);
                    System.out.println("Harga Awal: " + hrgAwal);
                    System.out.println("Anda memesan sebanyak: " + qty);
                    System.out.println("Harga dengan qty: " + hrgAkhir);
                    System.out.println("Pajak = " + pjk);
                    System.out.println("Total = " + total);
                }
                else {
                    hrgAkhir = qty * hrgAwal;
                    pjk = 0.02 * hrgAkhir;
                    total = hrgAkhir + pjk;
                    System.out.println("===============");
                    System.out.println("Nama anda: " + nama);
                    System.out.println("Nomor pilihan anda: " + pilihan);
                    System.out.println("Harga Awal: " + hrgAwal);
                    System.out.println("Anda memesan sebanyak: " + qty);
                    System.out.println("Harga dengan qty: " + hrgAkhir);
                    System.out.println("Pajak = " + pjk);
                    System.out.println("Total = " + total);
                }

            }
            break;
        }
    }
}



