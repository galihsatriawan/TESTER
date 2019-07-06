package Tester4;

import java.util.Scanner;

import static Tester4.menu_utama.menu;
import static Tester4.barang_baru.barang_baru;
import static Tester4.cek.Cek;
import static Tester4.edit.edit;
import static Tester4.tambah_stok.tambah;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author ASUS
 */
public class menu_item {
    public static void menu_item() {
        try {
            System.out.println("**==================================================**");
            System.out.println("||                  * MENU ITEM *                   ||");
            System.out.println("**==================================================**");
            System.out.println("||  1.Tambah Barang Baru                            ||");
            System.out.println("||  2.Cek Data  Barang                              ||");
            System.out.println("||  3.Edit Harga Barang                             ||");
            System.out.println("||  4.Tambah Stok Barang                            ||");
            System.out.println("||  5.Back to Main Menu                             ||");
            System.out.println("**==================================================**");


            Scanner input = new Scanner(System.in);
            int opsi;
            System.out.print("Pilih --->");
            opsi = input.nextInt();

            System.out.println("**==================================================**");

            switch (opsi) {

                case 1:
                    barang_baru();
                    break;
                case 2:
                    Cek();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    tambah();
                    break;
                case 5:
                    menu();
                    break;

                default:
                    System.out.println("Menu tidak ditemukan, ulangi");
                    menu_item();
            }
        } catch (Exception e) {
            System.out.println(" Pilihan Harus Angka");
            menu_item();
        }
    }
}
   

