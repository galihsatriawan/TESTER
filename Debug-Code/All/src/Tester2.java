
import java.awt.*;
import java.util.Scanner;

public class Tester2 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String akhir,pilih;
        int hitung = 0;
        boolean ulang = true;
        int pilihan, jumlah = 0;
        int[] h1 = {16000};
        int[] h2 = {19000};
        int[] h3 = {21000};

        int readyHarga[] = {17000,20000};
        int banyak_menu_ready = 2;
        String MenuReady[][] ={
                {"Rp.17 000 / porsi","Nasi Putih","Olahan Gurami","Tumisan Sayur","Gorengan","Kerupuk","Sambal"},
                {"Rp.20 000 / porsi","Nasi Putih","Olahan Cumi","Tumisan Sayur","Gorengan","Kerupuk","Sambal"},
        };



        int[] simpan = new int[99];
        int hari ;
        boolean ambil_menu_ready = false;
        System.out.println("****=== CATERING SI CIHUY ===****");

        System.out.println("=================");
        System.out.println("###** Hari: **###");
        System.out.println("=================");

        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jum'at");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.println("================");
        System.out.print("Pilih Hari : ") ; hari = input.nextInt();




        do {


            do {
                System.out.println("****=== CATERING SI CIHUY ===****");
                System.out.println("============================");
                System.out.println("1. Menu Ready");
                System.out.println("2. Menu Paket");
                System.out.println("============================");
                System.out.println("Pilihan anda : "); pilihan = input.nextInt();
                if(pilihan == 1){
                    System.out.println("****=== CATERING SI CIHUY ===****");
                    System.out.println("============================");
                    System.out.println("###** Daftar Menu Ready: **###");
                    System.out.println("============================");
                    for(int i=0;i<MenuReady[hari].length;i++){
                        System.out.println("\t"+ MenuReady[hari%banyak_menu_ready][i]);
                    }
                    System.out.println("============================");
                    System.out.print("Ingin membeli menu Ready (y/t) : ");pilih = input.next();
                    if(pilih.equalsIgnoreCase("y")){
                        ambil_menu_ready = true;
                    }else{
                        ambil_menu_ready = false;
                    }
                }else{
                    System.out.println("============================");
                    System.out.println("###** Daftar Menu Paket: **###");
                    System.out.println("============================");

                    System.out.println("Paket 1. Rp 16.000/porsi");
                    System.out.println("         Nasi Putih");
                    System.out.println("         Olahan Ayam");
                    System.out.println("         Tumis Sayur");
                    System.out.println("         Gorengan");
                    System.out.println("         Kerupukk");
                    System.out.println("         Sambal");

                    System.out.println("Paket 2. Rp 19.000/porsi");
                    System.out.println("         Nasi Putih");
                    System.out.println("         Sosis Ayam Manis");
                    System.out.println("         Tumis Sayur");
                    System.out.println("         Perkedel Kentang");
                    System.out.println("         Kerupuk");
                    System.out.println("         Sambal");

                    System.out.println("Paket 3. Rp 21.000/porsi");
                    System.out.println("         Nasi Putih");
                    System.out.println("         Olahan Ayam");
                    System.out.println("         Sambal Goreng Kentang Ati");
                    System.out.println("         Tumis Sayur");
                    System.out.println("         Kerupuk Udang");
                    System.out.println("         Gorengan");
                    System.out.println("         Sambal");

                    System.out.println("============================");

                    String[][] PAKET_1 = {
                            {"Rp.16 000 / porsi"},
                            {"Nasi Putih"},
                            {"Olahan Ayam"},
                            {"Tumisan Sayur"},
                            {"Gorengan"},
                            {"Kerupuk"},
                            {"Sambal"}};

                    String[][] PAKET_2 = {
                            {"Rp. 19 000 / porsi"},
                            {"Nasi Putih"},
                            {"Sosis Ayam Manis"},
                            {"Tumis Sayuran"},
                            {"Perkedel Kentang"},
                            {"Kerupuk"},
                            {"Sambal"}};

                    String[][] PAKET_3 = {
                            {"Rp. 21 000 / porsi"},
                            {"Nasi Putih"},
                            {"Olahan Ayam"},
                            {"Sambal Goreng Kentang Ati"},
                            {"Tumis Sayuran"},
                            {"Kerupuk Udang"},
                            {"Gorengan"},
                            {"Sambal"}};

                    do {

                        System.out.println("============================");

                        System.out.print("Masukkan Pilihan anda : ");
                        pilihan = input.nextInt();

                        System.out.println("============================");

                        switch (pilihan) {
                            case 1:
                                for (int baris = 0; baris < PAKET_1.length; baris++) {
                                    for (int kolom = 0; kolom < PAKET_1[baris].length; kolom++) {
                                        if (pilihan == 1) {
                                            System.out.println(PAKET_1[baris][kolom] + "\t");
                                            simpan[hitung] = pilihan;


                                        }

                                    }

                                }
                                jumlah = jumlah + h1[0];
                                break;
                            case 2:
                                for (int baris = 0; baris < PAKET_2.length; baris++) {
                                    for (int kolom = 0; kolom < PAKET_2[baris].length; kolom++) {
                                        if (pilihan == 2) {
                                            System.out.println(PAKET_2[baris][kolom] + "\t");
                                            simpan[hitung] = pilihan;


                                        }
                                    }
                                }
                                jumlah = jumlah + h2[0];
                                break;
                            case 3:
                                for (int baris = 0; baris < PAKET_3.length; baris++) {
                                    for (int kolom = 0; kolom < PAKET_3[baris].length; kolom++) {
                                        if (pilihan == 3) {
                                            System.out.println(PAKET_3[baris][kolom] + "\t");
                                            simpan[hitung] = pilihan;


                                        }
                                    }
                                }
                                jumlah = jumlah + h3[0];
                                break;

                        }
                        hitung++;

                    } while (pilihan < 1 || pilihan > 3);

                    System.out.println("============================");

                }

                System.out.print("Ingin Menambah Menu [Y/N] ? ");

                akhir = input.next();
                if ("Y".equalsIgnoreCase(akhir)) {
                    ulang = true;
                } else if ("N".equalsIgnoreCase(akhir)) {
                    ulang = false;
                } else {
                    do {
                        System.out.println("============================");

                        System.out.print("Ingin Menambah Menu [Y/N] ? ");
                        akhir = input.next();
                    } while (!akhir.equalsIgnoreCase("Y") && !akhir.equalsIgnoreCase("N"));
                    if ("N".equalsIgnoreCase(akhir)) {
                        ulang = false;
                    }
                }
            } while (ulang == true);

            System.out.println("============================");
            if(ambil_menu_ready) jumlah += readyHarga[hari%banyak_menu_ready];
            System.out.println("Total Harga Pesanan Anda : " + jumlah);
            System.out.println("Menu Yang di pesan");
            System.out.println("Menu Paket :");
            for (int baris = 0; baris < simpan.length; baris++) {

                if (simpan[baris]==0) {
                    break;
                }
                System.out.println(simpan[baris]);

            }
            if(ambil_menu_ready){
                System.out.println("Menu Ready :");

                System.out.println("\t"+ MenuReady[hari%banyak_menu_ready][0]);


            }
            System.out.println("============================");

            System.out.print("Ingin Mengulangi Pemesanan [Y/N] ? ");

            akhir = input.next();
            if ("Y".equalsIgnoreCase(akhir)) {
                ulang = true;
            } else if ("N".equalsIgnoreCase(akhir)) {
                ulang = false;
            } else {
                do {

                    System.out.println("============================");

                    System.out.print("Ingin Mengulangi Pemesanan [Y/N] ? ");
                    akhir = input.next();
                } while (!akhir.equalsIgnoreCase("Y") && !akhir.equalsIgnoreCase("N"));
                if ("N".equalsIgnoreCase(akhir)) {
                    ulang = false;
                }
            }
        } while (ulang == true);

        System.out.println("========================================");
        System.out.println("###**      TERIMA KASIH YA.....    **###");
        System.out.println("========================================");

    }

}
