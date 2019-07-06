/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester4;

import java.util.Scanner;

import static Tester4.barang_baru.a;
import static Tester4.barang_baru.harga;
import static Tester4.barang_baru.nama;
import static Tester4.barang_baru.stok;
import static Tester4.menu_item.menu_item;

/**
 * @author ASUS
 */
public class edit {
    static int pilihedit;

    public static void edit() {
        System.out.println("**==================================================**");
        System.out.println("||                    EDIT HARGA                    ||");
        System.out.println("**==================================================**");
        System.out.println("||                                                  ||");
        edit1();
    }

    static void edit1() {
        System.out.print("  Kode Barang (1-" + a + ") : ");
        Scanner input = new Scanner(System.in);
        pilihedit = input.nextInt();

        if (pilihedit <= a) {
            edit2();
        } else {
            System.out.println("  Pilihan tidak valid");
            edit1();
        }
    }

    static void edit2() {
        System.out.println("  Barang              : " + nama[pilihedit - 1]);
        System.out.println("  Harga Sebelum       :Rp." + harga[pilihedit - 1]);
        System.out.print("  Harga Baru          :Rp.");
        Scanner input = new Scanner(System.in);
        harga[pilihedit - 1] = input.nextInt();
        System.out.println("||                                                  ||");
        System.out.println("**==================================================**\n\n");
        menu_item();
    }
}
    
    