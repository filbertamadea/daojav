package Book.Controller;

import Book.Repository.BookRepo;
import Book.Services.BookServices;

import java.util.ArrayList;

public class BookController implements BookServices {

    public static ArrayList<String> findALl() {
        return BookRepo.showBook();
    }
    public static ArrayList<String>  findById() {
        return BookRepo. findById();
    }
    public static ArrayList<String> saveBook() {
        return BookRepo.saveBook();
    }
    public static ArrayList<String> editBook() {
        return BookRepo.editBook();
    }
    public static ArrayList<String> deleteBook() {
        return BookRepo.deleteBook();
    }
}
