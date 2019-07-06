package Tester4;

import java.util.Scanner;

import static Tester4.menu_utama.menu;

/**
 * @author ASUS
 */
public class login {
    public static void main(String[] args) {
        System.out.println("**==================================================**");
        System.out.println("||                 SELAMAT DATANG                   ||");
        System.out.println("||         TOKO JUAL BELI HARDWARE KOMPUTER         ||");
        System.out.println("**==================================================**\n");
        masuk();
    }

    public static void masuk() {
        System.out.println("**==================================================**");
        System.out.println("||                      LOGIN                       ||");
        System.out.println("**==================================================**");
        Scanner input = new Scanner(System.in);

        String Nama1, pswd;
        String nama = "admin", password = "admin";

        System.out.print(" MASUKAN USERNAME = ");
        Nama1 = input.nextLine();
        System.out.println("**==================================================**");
        System.out.print(" MASUKAN PASSWORD = ");
        pswd = input.nextLine();
        System.out.println("**==================================================**\n\n");
        if (nama.equals(Nama1) && pswd.equals(password)) {
            menu();
        } else {
            System.out.println("||**************************************************||");
            System.out.println("||        USERNAME ATAU PASSWORD SALAH   !!!!!      ||");
            System.out.println("||**************************************************||\n");
            masuk();
        }
    }
}
