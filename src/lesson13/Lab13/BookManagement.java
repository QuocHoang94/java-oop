package lesson13.Lab13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    public static void choiceMenu() {
        System.out.println("=========Book Management=============");
        System.out.println("1. Add book");
        System.out.println("2. Retrieve Book");
        System.out.println("0. Exit !");
    }

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(); // In-memory Storage

        // =========Book Management=============

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ISBN: ");
//        String ISBN = scanner.nextLine();
//        System.out.println("Title: ");
//        String title = scanner.nextLine();
//        System.out.println("Author Name: ");
//        String authorName = scanner.nextLine();
//        System.out.println("Year: ");
//        int year = Integer.parseInt(scanner.nextLine());
//
//        for (Book bookitem : bookList) {
//            System.out.println(bookitem);
//        }

        // Choice
        choiceMenu();

        while (true) {
            Scanner checkPoint = new Scanner(System.in);
            int valuetoCheck = Integer.parseInt(checkPoint.nextLine());
            if (valuetoCheck == 0) {
                return;
            }
            if (valuetoCheck == 1) {
                //Input
                //Save
                Scanner scanners = new Scanner(System.in);
                System.out.println("ISBN: ");
                String ISBNs = scanners.nextLine();
                System.out.println("Title: ");
                String titles = scanners.nextLine();
                System.out.println("Author Name: ");
                String authorNames = scanners.nextLine();
                System.out.println("Year: ");
                int years = Integer.parseInt(scanners.nextLine());
                Book book = new Book(ISBNs, titles, authorNames, years);
                bookList.add(book);
                System.out.println("List Book you have added : ");
                for (Book bookitem : bookList) {
                    System.out.println(bookitem);
                }
                choiceMenu();
            }
            if (valuetoCheck == 2) {
                //Retrieve
                System.out.println("Book ISBN to find: ");
                Scanner scanner = new Scanner(System.in);
                String toFindISBN = scanner.nextLine();
                Book foundBook = null;

                for (Book bookItem : bookList) {
                    if (bookItem.getISBN().equals(toFindISBN))
                        foundBook = bookItem;
                }

                if (foundBook == null) {
                    System.out.println("The is no book with ISBN: " + toFindISBN);
                } else {
                    System.out.println(foundBook);
                }
                choiceMenu();
            }
        }
        //Input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ISBN: ");
//        String ISBN = scanner.nextLine();
//        System.out.println("Title: ");
//        String title = scanner.nextLine();
//        System.out.println("Author Name: ");
//        String authorName = scanner.nextLine();
//        System.out.println("Year: ");
//        int year = Integer.parseInt(scanner.nextLine());

        //Save
//        Book book = new Book(ISBN, title, authorName, year);
//        bookList.add(book);

        // Save into FILE system
//        String bookFilePath = System.getProperty("user.dir").concat("/book.txt");
//        DataFactory.saveBookList(bookList, bookFilePath);
//        //Retrieve
//        System.out.println("Book ISBN to find: ");
//        String toFindISBN = scanner.nextLine();
//        Book foundBook = null;
//
//        for (Book bookItem : bookList) {
//            if (bookItem.getISBN().equals(toFindISBN))
//                foundBook = bookItem;
//            break;
//        }
//
//        if (foundBook == null) {
//            System.out.println("The is no book with ISBN: " + toFindISBN);
//        } else {
//            System.out.println(foundBook);
//        }
    }

}
