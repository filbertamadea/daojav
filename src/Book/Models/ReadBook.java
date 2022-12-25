package Book.Models;

import Book.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadBook extends Main {
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
}
