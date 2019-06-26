package projectuass;

import java.util.Scanner;

public class ProjectUASS {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String akhir;
        int hitung = 0;
        boolean ulang = true;
        int pilihan, jumlah = 0;
        int[] h1 = {16000};
        int[] h2 = {19000};
        int[] h3 = {21000};
        int[] simpan = new int[99];
        String hari;

        do {

            System.out.println("****=== CATERING SI CIHUY ===****");

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

            do {

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

            System.out.println("Total Harga Pesanan Anda : " + jumlah);

            System.out.println("Menu yang di pesan :");
            for (int baris = 0; baris < simpan.length; baris++) {

                if (simpan[baris]==0) {
                    break;
                }
                System.out.println(simpan[baris]);

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
