package Tester4;

import java.util.Scanner;

import static Tester4.menu_item.menu_item;
import static Tester4.Transaksi.menu_transaksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author ASUS
 */
public class menu_utama {

    public static void menu() {

        System.out.println("**==================================================**");
        System.out.println("||          * JUAL BELI HARDWARE KOMPUTER *         ||");
        System.out.println("**==================================================**");
        System.out.println("||  1.Menu Item                                     ||");
        System.out.println("||  2.Transaksi                                     ||");
        System.out.println("||  3.Exit                                          ||");
        System.out.println("**==================================================**");

        Scanner input = new Scanner(System.in);
        int opsi;
        boolean keluar;

        System.out.print("Pilih --->");
        opsi = input.nextInt();

        System.out.println("**==================================================**\n\n");

        switch (opsi) {
            case 1:
                menu_item();
                break;
            case 2:
                menu_transaksi();
                break;
            case 3:
                exit();

                break;

            default:
                System.out.println("Menu tidak ditemukan, ulangi");

        }

    }

    static void exit() {
        System.out.println("**==================================================**");
        System.out.println("||             * PROGRAM SHUTDOWN *                 ||");
        System.out.println("**==================================================**");

    }
}
