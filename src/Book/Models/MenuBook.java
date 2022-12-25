package Book.Models;

import Book.Main;
import Book.Controller.BookController;

import java.util.Scanner;

public class MenuBook extends Main {

    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Library App Menu");
        System.out.println("1. Find All Book");
        System.out.println("2. Find Book by Id");
        System.out.println("3. New Book");
        System.out.println("4. Edit Book");
        System.out.println("5. Delete Book");
        System.out.println("6. Keluar Aplikasi");
        System.out.println("====================");
        System.out.println("Silahkan Pilih Menu = ");

        String input = sc.nextLine();
        if(input.equals("1")){
            BookController.findALl();
        } else if (input.equals("2")) {
            BookController.findById();
        } else if (input.equals("3")) {
            BookController.saveBook();
        } else if (input.equals("4")) {
            BookController.editBook();
        } else if (input.equals("5")) {
            BookController.deleteBook();
        } else if (input.equals("6")) {
            System.exit(0);
        } else {
            System.out.println("Tidak Ada Pilihan Menu / Inputan salah");
            System.out.println("");
            System.out.print("Tekan [Enter] untuk kembali..");
            sc.nextLine();
            Main.clearScreen();
            Menu();
        }
    }
}
