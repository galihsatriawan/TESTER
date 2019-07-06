/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static Tester4.barang_baru.a;
import static Tester4.barang_baru.harga;
import static Tester4.barang_baru.nama;
import static Tester4.barang_baru.stok;
import static Tester4.cek.Cek;
import static Tester4.menu_utama.exit;
import static Tester4.menu_utama.menu;
import static Tester4.tambah_stok.stok1;

/**
 * @author ASUS
 */
public class Transaksi {

    static int KT, ST, stok1, total, diskon, uang, kembalian, kdstruk, kasirloop;
    static int pilihbeli, hargabeli, jumlah, batal;
    static int subtotal[] = new int[30];
    static int subjumlah[] = new int[30];
    static int KB[] = new int[30];
    static String barang[] = new String[30];
    static String diskon2, tanggal1, waktu1;

    public static void menu_transaksi() {
        ST = 0;
        KT = 1;
        total = 0;
        beli();
    }

    static String Tanggal() {
        DateFormat tanggalFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date tanggal = new Date();
        return tanggalFormat.format(tanggal);

    }

    static String Waktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date waktu = new Date();
        return dateFormat.format(waktu);
    }

    static void beli() {

        System.out.println("**==================================================**");
        System.out.println("||                      TRANSAKSI                   ||");
        System.out.println("**==================================================**");
        System.out.println("||                                                  ||");
        kasir1();
    }

    static void transaksi() {
        ST = 0;
        KT = 1;
        total = 0;
        beli();
    }

    static void kasir1() {
        System.out.println("\n  [Transaksi " + KT + "]");
        System.out.print("  Kode Barang (1-" + a + ")  : ");
        Scanner input = new Scanner(System.in);
        pilihbeli = input.nextInt();

        if (pilihbeli <= a) {
            System.out.print("  Barang              : " + nama[pilihbeli - 1] + " [Rp." + harga[pilihbeli - 1] + "] [stok:" + stok[pilihbeli - 1] + "]");
            if (stok[pilihbeli - 1] == 0) {
                System.out.println("  Mohon maaf, stok barang habis");
                kasir1();
            }
            kasir2();
        } else {
            System.out.println("  Pilihan tidak valid");
            kasir1();
        }
    }

    static void kasir2() {
        System.out.print("\n  Jumlah Barang       : ");
        Scanner input = new Scanner(System.in);
        jumlah = input.nextInt();

        //ketersediaan
        stok1 = stok[pilihbeli - 1] - jumlah;

        if (stok1 < 0) {
            System.out.println("  Mohon maaf, stok barang tidak memenuhi permintaan anda");
            kasir2();
        } else {
            stok[pilihbeli - 1] = stok1;
            //diskon
            if (jumlah <= 2) {
                diskon = harga[pilihbeli - 1] * jumlah * 0 / 100;
                diskon2 = "0%";
            } else if (jumlah >= 3) {
                diskon = harga[pilihbeli - 1] * jumlah * 10 / 100;
                diskon2 = "10%";
            } else if (jumlah >= 5) {
                diskon = harga[pilihbeli - 1] * jumlah * 20 / 100;
                diskon2 = "20%";
            }

            //perhitungan
            hargabeli = harga[pilihbeli - 1] * jumlah - diskon;
            System.out.println("  Diskon              : " + diskon2);
            System.out.print("  Harga               : Rp." + hargabeli + "\n");

            barang[ST] = nama[pilihbeli - 1];
            subtotal[ST] = hargabeli;
            subjumlah[ST] = jumlah;
            KB[ST] = pilihbeli - 1;
            ST++;
            KT++;
            tanya();
        }
    }

    static void tanya() {
        System.out.println("  #tekan 00 untuk lanjut belanja");
        System.out.println("  #tekan 88 untuk membatalkan transaksi");
        System.out.println("  #tekan 99 untuk membayar");

        System.out.print("Pilih  --> ");
        Scanner input = new Scanner(System.in);
        kasirloop = input.nextInt();
        switch (kasirloop) {
            case 00:
                kasir1();
                break;
            case 99:
                hitung();
                bayar();
                struk();
                break;
            case 88:
                batal();
            default:
                System.out.println("  pilihan tidak valid");
                tanya();
                break;
        }
    }

    static void batal() {
        System.out.print("\n  Pilih No. Transaksi yang dibatalkan (tekan 77 untuk kembali): ");
        Scanner input = new Scanner(System.in);
        batal = input.nextInt();

        if (batal == 77) {
            tanya();
        } else if (batal < KT) {
            stok[KB[batal - 1]] = stok[KB[batal - 1]] + subjumlah[batal - 1];
            barang[batal - 1] = barang[batal - 1] + "[batal]";
            subtotal[batal - 1] = 0;
            subjumlah[batal - 1] = 0;
            System.out.println("  Transaksi Di Telah Di Batalkan");

        } else {
            System.out.println("  No. Transaksi tidak ditemukan, u");
            batal();
        }
    }

    static void hitung() {
        for (int i = 0; i < ST; i++) {
            total = total + subtotal[i];
        }
    }

    static void bayar() {

        System.out.println("  Total Harga         : " + total);
        System.out.print("  Uang Pembayaran     : ");
        Scanner input = new Scanner(System.in);
        uang = input.nextInt();

        kembalian = uang - total;

        if (kembalian < 0) {
            System.out.println("  Maaf, uang anda tidak mencukupi, BAYAR LAGI!! ");
            bayar();
        } else {
            System.out.println("  Kembalian Anda      : " + kembalian);
        }
        System.out.println("||                                                  ||");
        System.out.println("**==================================================**\n\n\n");

    }

    static void struk() {
        System.out.println("**==================================================**");
        System.out.println("||                      STRUK                       ||");
        System.out.println("**==================================================**");
        System.out.println("||                                                  ||");
        System.out.println("|| RUKO-CANDI VIC NO 9 KARANG BESUKI                ||");
        System.out.println("|| KOTA MALANG - JAWA TIMUR                         ||");
        System.out.println("|| www.Jual Beli Hardware Komputer.com              ||");
        System.out.println("|| Telp:0344-12345                                  ||");
        System.out.println("|| No.  : 1806/KSR/UTM/" + kdstruk + "             " + Tanggal() + "     ||");
        System.out.println("|| Kasir: ADMIN                          " + Waktu() + "   ||");
        System.out.println("|| Pel. : UMUM                                      ||");
        System.out.println("||--------------------------------------------------||");
        for (int i = 0; i < ST; i++) {
            System.out.print("|| " + barang[i] + "\t\t\t\t\t    ||\n");
            System.out.print("|| " + subjumlah[i] + "\t Pcs. \t\t=     " + subtotal[i] + "\t\t    ||\n");
            System.out.print("||                                                                  ||\n");
        }
        System.out.println("||--------------------------------------------------||");
        System.out.println("|| Total\t\t=     " + total + "\t\t    ||");
        System.out.println("|| Tunai\t\t=     " + uang + "\t\t    ||");
        System.out.println("||                     -----------------------------||");
        System.out.println("|| Kembali\t\t=     " + kembalian + "\t\t    ||");
        System.out.println("||                                                  ||");
        System.out.println("|| Barang yang sudah dibeli tidak dapat di-         ||");
        System.out.println("|| kembalikan atau ditukar, dengan alasan           ||");
        System.out.println("|| apapun.                                          ||");
        System.out.println("|| .                                                ||");
        System.out.println("|| GARANSI..........                                ||");
        System.out.println("||                                                  ||");
        System.out.println("||                                                  ||");
        System.out.println("|| .                                                ||");
        System.out.println("|| **TERIMA-KASIH**                                 ||");
        System.out.println("|| www.Jual Beli Hardware Komputer.com              ||");
        System.out.println("||                                                  ||");
        System.out.println("**==================================================**\n\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------\n\n");

        System.out.println("**==================================================**");
        System.out.println("||     **TERIMAKASIH ATAS KEPERCAYAAN ANDA**        ||");
        System.out.println("||     **KRITIK DAN SARAN ANDA MEMBANGUN**          ||");
        System.out.println("**==================================================**");
        exit();
    }
}
