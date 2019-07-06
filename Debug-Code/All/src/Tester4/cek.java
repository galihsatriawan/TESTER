/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester4;

import static Tester4.menu_item.menu_item;
import static Tester4.barang_baru.a;
import static Tester4.barang_baru.harga;
import static Tester4.barang_baru.nama;
import static Tester4.barang_baru.stok;


/**
 * @author ASUS
 */
public class cek {

    public static void Cek() {
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
        System.out.println("**==================================================**");
        System.out.println("||                     DATA BARANG                  ||");
        System.out.println("**==================================================**");

        for (int i = 1; i < a; i++) {
            System.out.print("||" + i + ". " + nama[i - 1] + "\t [stok : " + stok[i - 1] + "]\t Rp." + harga[i - 1] + "\t    ||\n");

        }
        System.out.println("**==================================================**\n\n");
        menu_item();

    }

}
