package Book;

import Book.Models.MenuBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String fileName;
    public static ArrayList<String> book;
    public static boolean isEditing = false;
    static Scanner input;
//fungsi save

    public static void main(String[] args) {
        book = new ArrayList<>();
        input = new Scanner(System.in);
        MenuBook menuBook = new MenuBook();

        String filePath = System.console() == null ? "/src/Book/book.txt" : "/book.txt";
        fileName = System.getProperty("user.dir") + filePath;

        System.out.println("Nama File: " + fileName);

        while (true) {
            menuBook.Menu();
        }
    }

    public static void readBookList() {
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            // load isi file ke dalam array book
            book.clear();
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                book.add(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }

    public static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }

    }

    public static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();
    }


}