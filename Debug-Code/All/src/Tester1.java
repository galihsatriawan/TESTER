
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class menu_utama {
    public void menut() {
        int choose;
        Scanner inp = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("|\tSELAMAT DATANG DI NUR HOTEL\t|");
        System.out.println("-----------------------------------------");
        System.out.println("| 1.\tRESERVASI\n| 2.\tHISTORY");
        System.out.print("Pilih Transaksi Anda : ");
        choose = inp.nextInt();
        if (choose == 1) {
            pilihan_kamar menu = new pilihan_kamar();
            menu.tampil_menu();

            Rincian Project = Rincian.getInstance();
            Project.print();
        } else if (choose == 2) {
            Rincian Project = Rincian.getInstance();
            Project.history_fungsi();
        }

    }
}

class pilihan_kamar {

    public void tampil_menu() {
        System.out.println("=========================================");
        System.out.println("|\tSILAHKAN PILIH TYPE KAMAR\t|");
        System.out.println("-----------------------------------------");
        System.out.println("1.\tStandart\t(Rp 200.000)\t|\n2.\tSuperior\t(Rp 250.000)\t|\n3.\tDeluxe\t\t(Rp 300.000)\t|\n4.\tStudio\t\t(Rp 400.000)\t|\n5.\tSuite\t\t(Rp 500.000)\t|");
        System.out.println("-----------------------------------------");
    }
}

public class Tester1 {
    static Tester1 instance = null;

    public static Tester1 getInstance() {
        if (instance == null) {
            instance = new Tester1();
        }
        return instance;
    }

    static String getProjectUas() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        menu_utama first = new menu_utama();
        first.menut();


    }
}

class Rincian {
    static Rincian instance = null;

    public static Rincian getInstance() {
        if (instance == null) {
            instance = new Rincian();
        }
        return instance;
    }

    int pil, pilih;
    int[] Jumlah = new int[100];
    int[] LamaTinggal = new int[100];
    int[] dp = new int[100];
    int[] harga = new int[100];
    int jumlah_pesanan;

    String[] Nama = new String[100];
    String[] Alamat = new String[100];
    String[] Tanggal = new String[100];
    String[] NoTelp = new String[100];
    String[] NoKTP = new String[100];
    String[] NoBooking = new String[100];
    String[] ks = new String[100];
    String[] k = {"Standart", "Superior", "Deluxe", "Studio", "Suite"};
    String[] f = {"Televisi", "Kipas Angin", "AC", "Kamar Mandi Luar", "Kamar Mandi Dalam", "Breakfast", "Pijat", "Lunch", "Dinner", "Swimming Pool"};

    public void print() {


        String ulangi, ulangi2;

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        Scanner scen = new Scanner(System.in);
        Scanner kmr = new Scanner(System.in);
        Scanner banyakpesanan = new Scanner(System.in);


        System.out.println("_________________________________________");
        System.out.print("| Masukan banyak pesanan\t: ");
        jumlah_pesanan = banyakpesanan.nextInt();


        do {

            for (int i = 0; i < jumlah_pesanan; i++) {
                do {

                    pilihan_kamar menu = new pilihan_kamar();
                    menu.tampil_menu();
                    System.out.println("_________________________________________");
                    System.out.print("| PILIH KAMAR YANG DI PESAN\t: ");
                    pil = input.nextInt();
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");

                    if (pil == 1) {
                        harga[i] = 200000;
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[0]);
                        System.out.println("|\tFASILITAS KAMAR\t\t  : " + f[0] + ", " + f[1] + ", " + f[3]);
                    } else if (pil == 2) {
                        harga[i] = 250000;
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[1]);
                        System.out.println("|\tFASILITAS KAMAR\t\t  : " + f[0] + ", " + f[1] + ", " + f[4] + ", " + f[5]);
                    } else if (pil == 3) {
                        harga[i] = 300000;
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[2]);
                        System.out.println("|\tFASILITAS KAMAR\t\t  : " + f[0] + ", " + f[2] + ", " + f[4] + ", " + f[5] + ", " + f[7]);
                    } else if (pil == 4) {
                        harga[i] = 400000;
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[3]);
                        System.out.println("|\tFASILITAS KAMAR\t\t  : " + f[0] + ", " + f[2] + ", " + f[4] + ", " + f[5] + ", " + f[6] + ", " + f[7] + ", " + f[9]);
                    } else if (pil == 5) {
                        harga[i] = 500000;
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[4]);
                        System.out.println("|\tFASILITAS KAMAR\t\t  : " + f[0] + ", " + f[2] + ", " + f[4] + ", " + f[5] + ", " + f[6] + ", " + f[7] + ", " + f[8] + ", " + f[9]);
                    } else if (pil > 5) {
                        System.out.println("|\tKAMAR YANG ANDA PILIH TIDAK ADA");
                        break;
                    }

                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.print("Pilih Kamar Lain ? (ya/tidak) : ");
                    ulangi2 = scan.nextLine();
                } while (ulangi2.equals("ya"));

                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print("\nNo Booking\t  : ");
                NoBooking[i] = inputString.nextLine();
                System.out.print("Nama Pemesan\t  : ");
                Nama[i] = inputString.nextLine();
                System.out.print("No KTP\t\t  : ");
                NoKTP[i] = inputString.nextLine();
                System.out.print("Alamat\t\t  : ");
                Alamat[i] = inputString.nextLine();
                System.out.print("No Telepon\t  : ");
                NoTelp[i] = inputString.nextLine();
                System.out.print("Tanggal Pemakaian : ");
                Tanggal[i] = inputString.nextLine();
                System.out.print("Jumlah Pesan\t  : ");
                Jumlah[i] = input.nextInt();
                System.out.print("Lama Tinggal\t  : ");
                LamaTinggal[i] = input.nextInt();
                System.out.print("Uang Deposit\t  : ");
                dp[i] = input.nextInt();
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");


                System.out.println("==========================================================================");
                for (int c = 0; c < 1; c++) {
                    if (pil == 1) {
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[0] + "ATAS NAMA" + Nama[i]);
                        ks[i] = k[0];
                    } else if (pil == 2) {
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[1] + "ATAS NAMA" + Nama[i]);
                        ks[i] = k[1];
                    } else if (pil == 3) {
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[2] + "ATAS NAMA" + Nama[i]);
                        ks[i] = k[2];
                    } else if (pil == 4) {
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[3] + "ATAS NAMA" + Nama[i]);
                        ks[i] = k[3];
                    } else if (pil == 5) {
                        System.out.println("|\tTYPE KAMAR YANG DI PILIH  : " + k[4] + "ATAS NAMA" + Nama[i]);
                        ks[i] = k[4];
                    }
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("|KODE BOOKING\t\t : " + NoBooking[i] + "\n|NAMA TAMU\t\t : "
                            + Nama[i] + "\n|NO KTP\t\t\t : " + NoKTP[i] + "\n|ALAMAT\t\t\t : " + Alamat[i] + "\n|NO TELP\t\t : "
                            + NoTelp[i] + "\n|TANGGAL MENGINAP\t : " + Tanggal[i] + "\n|JUMLAH PESAN KAMAR\t : " + Jumlah[i]
                            + " Kamar\n|LAMA TINGGAL\t\t : " + LamaTinggal[i] + " Hari\n|TOTAL BAYAR\t\t : Rp " + (Jumlah[i] * LamaTinggal[i] * harga[i])
                            + ",00\n|SISA PEMBAYARAN\t : Rp " + ((Jumlah[i] * LamaTinggal[i] * harga[i]) - dp[i]) + ",00\n|Tanggal Pemesanan\t : " + Tester1.getProjectUas());
                }
            }
            System.out.println("==========================================================================");
            history_fungsi();

            System.out.print("Transaksi Kembali ? (ya/tidak) : ");
            ulangi = scan.nextLine();
        } while (ulangi.equals("ya"));
    }

    void history_fungsi() {

        Scanner pilihan = new Scanner(System.in);
        System.out.println("\n==========================================================================");
        System.out.println("| \t\t\t TAMPILKAN TRANSAKSI PESANAN \t\t\t |");
        System.out.println("==========================================================================");
        System.out.println("|1.\t LAST ORDER \t\t\t\t\t\t\t |\n|2.\t 3 ORDER TERAKHIR \t\t\t\t\t\t | \n|3.\t 5 ORDER TERAKHIR \t\t\t\t\t\t |\n|4.\t ALL ORDER \t\t\t\t\t\t\t |");
        System.out.println("==========================================================================");
        System.out.print("Silahkan Pilih : ");
        int i;
        pilih = pilihan.nextInt();
        if (pilih == 1) {
            for (i = 0; i < 1; i++)
                System.out.println("==========================================================================\n|BERIKUT ADALAH RINCIAN PEMESANAN SAUDARA  "
                        + Nama[i] + " TYPE KAMAR " + ks[i] + "\n--------------------------------------------------------------------------\n|KODE BOOKING\t\t : " + NoBooking[i] + "\n|NAMA TAMU\t\t : "
                        + Nama[i] + "\n|NO KTP\t\t\t : " + NoKTP[i] + "\n|ALAMAT\t\t\t : " + Alamat[i] + "\n|NO TELP\t\t : "
                        + NoTelp[i] + "\n|TANGGAL MENGINAP\t : " + Tanggal[i] + "\n|JUMLAH PESAN KAMAR\t : " + Jumlah[i]
                        + " Kamar\n|LAMA TINGGAL\t\t : " + LamaTinggal[i] + " Hari\n|TOTAL BAYAR\t\t : Rp " + (Jumlah[i] * LamaTinggal[i] * harga[i])
                        + ",00\n|SISA PEMBAYARAN\t : Rp " + ((Jumlah[i] * LamaTinggal[i] * harga[i]) - dp[i]) + ",00\n|Tanggal Pemesanan\t : " + Tester1.getProjectUas()
                        + "\n==========================================================================");
        } else if (pilih == 2) {
            for (i = 0; i < 3; i++)
                System.out.println("==========================================================================\n|BERIKUT ADALAH RINCIAN PEMESANAN SAUDARA  "
                        + Nama[i] + " TYPE KAMAR " + ks[i] + "\n--------------------------------------------------------------------------\n|KODE BOOKING\t\t : " + NoBooking[i] + "\n|NAMA TAMU\t\t : "
                        + Nama[i] + "\n|NO KTP\t\t\t : " + NoKTP[i] + "\n|ALAMAT\t\t\t : " + Alamat[i] + "\n|NO TELP\t\t : "
                        + NoTelp[i] + "\n|TANGGAL MENGINAP\t : " + Tanggal[i] + "\n|JUMLAH PESAN KAMAR\t : " + Jumlah[i]
                        + " Kamar\n|LAMA TINGGAL\t\t : " + LamaTinggal[i] + " Hari\n|TOTAL BAYAR\t\t : Rp " + (Jumlah[i] * LamaTinggal[i] * harga[i])
                        + ",00\n|SISA PEMBAYARAN\t : Rp " + ((Jumlah[i] * LamaTinggal[i] * harga[i]) - dp[i]) + ",00\n|Tanggal Pemesanan\t : " + Tester1.getProjectUas()
                        + "\n==========================================================================");
        } else if (pilih == 3) {
            for (i = 0; i < 5; i++)
                System.out.println("==========================================================================\n|BERIKUT ADALAH RINCIAN PEMESANAN SAUDARA  "
                        + Nama[i] + " TYPE KAMAR " + ks[i] + "\n--------------------------------------------------------------------------\n|KODE BOOKING\t\t : " + NoBooking[i] + "\n|NAMA TAMU\t\t : "
                        + Nama[i] + "\n|NO KTP\t\t\t : " + NoKTP[i] + "\n|ALAMAT\t\t\t : " + Alamat[i] + "\n|NO TELP\t\t : "
                        + NoTelp[i] + "\n|TANGGAL MENGINAP\t : " + Tanggal[i] + "\n|JUMLAH PESAN KAMAR\t : " + Jumlah[i]
                        + " Kamar\n|LAMA TINGGAL\t\t : " + LamaTinggal[i] + " Hari\n|TOTAL BAYAR\t\t : Rp " + (Jumlah[i] * LamaTinggal[i] * harga[i])
                        + ",00\n|SISA PEMBAYARAN\t : Rp " + ((Jumlah[i] * LamaTinggal[i] * harga[i]) - dp[i]) + ",00\n|Tanggal Pemesanan\t : " + Tester1.getProjectUas()
                        + "\n==========================================================================");
        } else if (pilih == 4) {
            for (i = 0; i < jumlah_pesanan; i++)
                System.out.println("==========================================================================\n|BERIKUT ADALAH RINCIAN PEMESANAN SAUDARA  "
                        + Nama[i] + " TYPE KAMAR " + ks[i] + "\n--------------------------------------------------------------------------\n|KODE BOOKING\t\t : " + NoBooking[i] + "\n|NAMA TAMU\t\t : "
                        + Nama[i] + "\n|NO KTP\t\t\t : " + NoKTP[i] + "\n|ALAMAT\t\t\t : " + Alamat[i] + "\n|NO TELP\t\t : "
                        + NoTelp[i] + "\n|TANGGAL MENGINAP\t : " + Tanggal[i] + "\n|JUMLAH PESAN KAMAR\t : " + Jumlah[i]
                        + " Kamar\n|LAMA TINGGAL\t\t : " + LamaTinggal[i] + " Hari\n|TOTAL BAYAR\t\t : Rp " + (Jumlah[i] * LamaTinggal[i] * harga[i])
                        + ",00\n|SISA PEMBAYARAN\t : Rp " + ((Jumlah[i] * LamaTinggal[i] * harga[i]) - dp[i]) + ",00\n|Tanggal Pemesanan\t : " + Tester1.getProjectUas()
                        + "\n==========================================================================");
        } else if (pilih > 4) {
            System.out.println("PILIHAN TIDAK DI KETAHUI");
        }

    }
}
