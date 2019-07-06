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

        System.out.println("**==================================================**");
        System.out.println("||                     DATA BARANG                  ||");
        System.out.println("**==================================================**");

        for (int i = 0; i < a; i++) {
            System.out.print("||" + (i+1) + ". " + nama[i] + "\t [stok : " + stok[i] + "]\t Rp." + harga[i] + "\t    ||\n");

        }
        System.out.println("**==================================================**\n\n");
        menu_item();

    }

}
