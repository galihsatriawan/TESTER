/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester4;

import java.util.Scanner;

import static Tester4.barang_baru.a;
import static Tester4.barang_baru.nama;
import static Tester4.barang_baru.stok;
import static Tester4.menu_item.menu_item;

/**
 * @author ASUS
 */
public class tambah_stok {
    static int pilihstok;

    public static void tambah() {
        System.out.println("**==================================================**");
        System.out.println("||                    TAMBAH STOK                   ||");
        System.out.println("**==================================================**");
        System.out.println("||                                                  ||");
        stok1();
    }

    static void stok1() {
        System.out.print("  Kode Barang (1-" + a + ") : ");
        Scanner input = new Scanner(System.in);
        pilihstok = input.nextInt();
        if (pilihstok <= a) {
            stok2();
        } else {
            System.out.println("  pilihan tidak valid");
            stok1();
        }
    }

    static void stok2() {
        System.out.println("  Barang              : " + nama[pilihstok - 1]);
        System.out.println("  Stok Sebelum        : " + stok[pilihstok - 1]);
        System.out.print("  Tambah stok         : ");
        int tambahstok;
        Scanner insert = new Scanner(System.in);
        tambahstok = insert.nextInt();
        stok[pilihstok - 1] = stok[pilihstok - 1] + tambahstok;

        System.out.println("||                                                  ||");
        System.out.println("**==================================================**\n\n");

        menu_item();
    }
} 
 
