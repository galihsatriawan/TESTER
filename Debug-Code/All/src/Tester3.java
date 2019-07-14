//package rental;

import java.util.Scanner;
import java.util.*;

public class Tester3 {
    //kalau tidak ada panjang dari array harus di isi nilai array nya
    static String peminjam[][] = {{"", //id && ini variabel yang static nilai nya tidak berubah berubah
            "",//ktp
            "",//nama
            "",//alamat
            "",//notelp
            "",//kode pengembalian
            "",//jumlah hari peminjaman
            "",//tgl awal pinjam
            ""}};//tgl akhir pinjam
    static String member[][] = new String[100][6];
    static int banyak_member = 0;
    static int id_terakhir =0 ;
    // id, Ktp, nama,alamat, notelp,banyak_order
    static String kendaraan[][] = {
            {"L1", "LEXI", "1", "150000"},
            {"JP1", "Jeep", "0", "500000"}
    };

    public static void main(String[] args) {
        dashboard();
    }

    public static void dashboard() {
        Scanner a = new Scanner(System.in);
        int menu;
        System.out.print("========= Silahkan Pilih Menu =======");
        System.out.print("\n 1. Peminjaman Kendaraan");
        System.out.print("\n 2. Masukkan Pengembalian");
        System.out.print("\n 3. Tampilkan Seluruh Member");
        System.out.print("\n 4. Fitur Tambah Member");
        System.out.print("\n 5. Fitur Hapus Member");
        System.out.println("\n 6. Tampilkan Info Kendaraan");
        System.out.println("\n 0. EXIT ");

        System.out.print(" Masukkan Pilihan = ");
        menu = a.nextInt();
        switch (menu) {
            case 1:
                menu1();
                break;
//            case 2:menu2();break;
            case 3 : menu3();break;
            case 4 : menu4();break;
            case 5 : menu5();break;
        }
    }

    public static void menu1() {
        form_pinjam();
    }

    public static void menu4() {
        form_tambah_member();
    }
    public static void menu5(){
        form_hapus_member();
    }
    public static void menu3() {
        seluruh_member();
        dashboard();
    }
    public static void seluruh_member(){
        if(banyak_member!= 0){
            for (int i= 1;i<=banyak_member;i++){
                String id = member[i][0];
                String ktp = member[i][1];
                String nama = member[i][2];
                System.out.println(id+"\t\t"+ktp+"\t\t"+nama);
            }
        }else{
            System.out.println("Belum Ada member");
        }


    }
    public static void form_tambah_member() {
        Scanner a = new Scanner(System.in);
        String nama, alamat, notelp, ktp, kodekendaraan, hari, tglawal, tglakhir;
        boolean vktp = false, vkendaraan = false;

        do {
            System.out.print("\n ====== FORM MEMBER ======");
            System.out.print("\n Masukkan No KTP anda = ");
            ktp = a.next();
            System.out.print("Masukkan Nama Anda = ");
            nama = a.next();
            System.out.print("Masukkan Alamat Anda = ");
            alamat = a.next();
            System.out.print("Masukkan No Telp Anda = ");
            notelp = a.next();

            if (vktp(ktp) == true) {
                //proses menyimpan

                id_terakhir = id_terakhir+1;
                banyak_member = banyak_member+1;
                int id = id_terakhir;  //dibuat untuk acuan id peminjam
                int no = banyak_member;



                member[no][0] = String.valueOf(id);
                member[no][1] = ktp;
                member[no][2] = nama;
                member[no][3] = alamat;
                member[no][4] = notelp;
                member[no][5] = "0"; //belum pernah pesan

                vktp = true;

                System.out.println("Member Berhasil ditambahkan");
                dashboard();

            } else {
                System.out.println("NO KTP SALAH !!!! ");
            }
        } while (vktp == false);
    }
    public static void form_hapus_member(){
        seluruh_member();
        Scanner input = new Scanner(System.in);
        int id_hapus;
        System.out.print("Masukkan ID Member yang ingin dihapus : "); id_hapus =input.nextInt();
        //Search id
        int index_ditemukan = -1 ;
        for(int i=1;i<=banyak_member;i++){
            if(member[i][0].equals(String.valueOf(id_hapus))){
                index_ditemukan = i;
                break;
            }
        }
        if(index_ditemukan == -1) {
            System.out.println("ID tidak ditemukan");
        }else{
            for(int j= index_ditemukan+1;j<=banyak_member;j++){
                member[j-1][0] =member[j][0];
                member[j-1][1] =member[j][1];
                member[j-1][2] =member[j][2];
                member[j-1][3] =member[j][3];
                member[j-1][4] =member[j][4];
                member[j-1][5] =member[j][5];


            }
            banyak_member--;
            System.out.println("Member berhasil terhapus");
        }

        dashboard();
    }

    public static void form_pinjam() {
        Scanner a = new Scanner(System.in);
        String nama, alamat, notelp, ktp, kodekendaraan, hari, tglawal, tglakhir;
        boolean vktp = false, vkendaraan = false;

        do {
            System.out.print("\n ====== FROM PEMINJAMAN ======");
            System.out.print("\n Masukkan No KTP anda = ");
            ktp = a.next();
            System.out.print("Masukkan Nama Anda = ");
            nama = a.next();
            System.out.print("Masukkan Alamat Anda = ");
            alamat = a.next();
            System.out.print("Masukkan No Telp Anda = ");
            notelp = a.next();

            if (vktp(ktp) == true) {
                //proses menyimpan
                int id = peminjam.length;  //dibuat untuk acuan id peminjam
                int no;

                if (peminjam[0][0].equals("")) {
                    no = 0;
                } else {
                    no = id;
                }
                // no dibuat untuk id baru ------>>> buat nampung id inputan peminjam baru
                peminjam[no][0] = String.valueOf(id + 1);
                peminjam[no][1] = ktp;
                peminjam[no][2] = nama;
                peminjam[no][3] = alamat;
                peminjam[no][4] = notelp;
                peminjam[no][5] = randomStr();

                vktp = true;

                // pilih kendaraan
                System.out.println("\n Pilih Kendaraan yang akan disewa = ");
                for (int i = 0; i < kendaraan.length; i++) {
                    System.out.println(kendaraan[i][0] + " " + kendaraan[i][1]);
                }

                do {
                    System.out.print("\n Pilih Kendaraan yang akan disewa = ");
                    kodekendaraan = a.next();

                    if (vkendaraan(kodekendaraan) == 0) {
                        System.out.print("Kode Tidak Terdaftar");
                    } else if (vkendaraan(kodekendaraan) == 1) {
                        System.out.print("Stock Habis LuR");
                    } else {
                        System.out.print("Kendaraan bisa dipinjam");
                        System.out.print("\n Masukkan Berapa Hari Peminjaman = ");
                        hari = a.next();
                        System.out.print("\n Masukkan Tgl Awal = ");
                        tglawal = a.next();
                        System.out.print("\n Masukkan Tgl Akhir = ");
                        tglakhir = a.next();

                        peminjam[no][6] = hari;
                        peminjam[no][7] = tglawal;
                        peminjam[no][8] = tglakhir;

                        vkendaraan = true;
                    }
                } while (vkendaraan == false);

                nota();
                dashboard();

            } else {
                System.out.println("NO KTP SALAH !!!! ");
            }
        } while (vktp == false);
    }

    public static int vkendaraan(String kode) {
        int index = 0;
        for (int i = 0; i < kendaraan.length; i++) {
            // cari indeks array kendaraan
            if (kendaraan[i][0].equals(kode)) {
                if (kendaraan[i][0].equals(kode)) {
                    if (kendaraan[i][2].equals("0")) {
                        return 1; //return 1 stock habis
                    } else {
                        return 2; //berhasil
                    }
                } else {
                    return 0; //tidak terdaftar
                }
            }
        }
        return 0;
    }

    public static boolean vktp(String ktp) {
        if (ktp.contains("A")) {
            return false;
        } else if (ktp.length() == 5) {
            return true;
        } else {
            return false;
        }
    }

    public static String randomStr() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }

        String saltStr = salt.toString();
        return saltStr;
    }

    public static void nota() { //menunjukan inputan yang terakhir.. mencari index array terakhir
        int rec = peminjam.length - 1; //digunakan untuk mengambil index terakhir array
        int lama = Integer.parseInt(peminjam[rec][6]); //dipindah menjadi interger
        int harga = Integer.parseInt(kendaraan[0][3]); //dipindah menjadi integer
        int total = lama * harga;

        System.out.print("\n ================================================= ");
        System.out.print("\n +== RENTAL KENDARAAN CIHUY == ");
        System.out.print("\n ==================== NOTA  ====================== ");
        System.out.print(" ");
        System.out.print("\n == KODE PENGEMBALIAN == \t" + peminjam[rec][5]);
        System.out.print("\n ");
        System.out.print("\n \t NO KTP   = \t \t  " + peminjam[rec][1]);
        System.out.print("\n \t NAMA     = \t \t  " + peminjam[rec][2]);
        System.out.print("\n \t ALAMAT   = \t \t  " + peminjam[rec][3]);
        System.out.print("\n \t NO TELP  = \t \t  " + peminjam[rec][4]);
        System.out.print("\n === DATA PEMINJAMAN === \n");
        System.out.print("\n  NAMA KENDARAAN         = \t " + kendaraan[rec][1]);
        System.out.print("\n  LAMA WAKTU MENYEWA     = \t " + peminjam[rec][6] + " hari");
        System.out.print("\n  TANGGAL AWAL PEMINJAM  = \t " + peminjam[rec][7]);
        System.out.print("\n  TANGGAL AKHIR PEMINJAM = \t " + peminjam[rec][8]);
        System.out.println("\n-------------------------------------------- + \n");
        System.out.print("\t HARGA = \t " + total);
        System.out.print("\n ===================================================== \n");
        System.out.println(" ");
    }
}
