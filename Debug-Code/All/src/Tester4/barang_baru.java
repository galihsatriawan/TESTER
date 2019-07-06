/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester4;

import java.util.Scanner;

import static Tester4.cek.Cek;
import static Tester4.login.masuk;
import static Tester4.menu_item.menu_item;
import static Tester4.menu_utama.menu;

/**
 * @author ASUS
 */
public class barang_baru {
    static String nama[] = new String[30];
    static int harga[] = new int[30];
    static int stok[] = new int[30];
    static int a;
    static String NB;
    static int HB, SB;
    public static void init(){
        //item
        nama[0] = "Headset";
        nama[1] = "Laptop";
        nama[2] = "Speaker";
        nama[3] = "Monitor";
        nama[4] = "Processor";

        //harga
        harga[0] = 230000;
        harga[1] = 6500000;
        harga[2] = 390000;
        harga[3] = 500000;
        harga[4] = 1100000;

        //stok
        stok[0] = 2;
        stok[1] = 3;
        stok[2] = 4;
        stok[3] = 0;
        stok[4] = 4;
        a = 5;
    }

    public static void barang_baru() {
        Scanner insert = new Scanner(System.in);
        System.out.println("**==================================================**");
        System.out.println("||                 BARANG BARU                      ||");
        System.out.println("**==================================================**");
        System.out.print(" Masukan Nama Barang = ");
        NB = insert.nextLine();
        nama[a] = NB;
        System.out.print(" Masukan Stok Barang = ");
        SB = insert.nextInt();
        stok[a] = SB;
        System.out.print(" Masukan Harga Barang = Rp.");
        HB = insert.nextInt();
        harga[a] = HB;
        a++;
        System.out.println("||                                                  ||");
        System.out.println("||          **BARANG BERHASIL DI TAMABAH**          ||");
        System.out.println("**==================================================**");
        menu_item();

    }
}   
