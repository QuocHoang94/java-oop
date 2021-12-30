package lesson14.Lab14;

import java.util.*;
import java.util.function.Predicate;

public class BookManagement {
    public static void choiceMenu() {
        System.out.println("=========Book Management=============");
        System.out.println("1. Add book");
        System.out.println("2. Retrieve Book");
        System.out.println("3. Update Book");
        System.out.println("4. Delete Book");
        System.out.println("0. Exit !");
    }

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(); // In-memory Storage
        String bookFilePath = System.getProperty("user.dir").concat("/book.txt");
        choiceMenu();
        while (true) {
            Scanner checkPoint = new Scanner(System.in);
            int valueCheck = Integer.parseInt(checkPoint.nextLine());
            if (valueCheck == 0) {
                return;
            }
            if (valueCheck == 1) {
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
                System.out.println("Do you wanna to save this Book ?");
                String variable = "";
                System.out.println("Yes" + "  " + "No");
                String value1 = "Yes";
                String value2 = "No";
                Scanner saveOrNot = new Scanner(System.in);
                String checkSave = saveOrNot.nextLine();
                if (value1.toLowerCase().equals(checkSave.toLowerCase())) {
                    Book book = new Book(ISBNs, titles, authorNames, years);
                    bookList.add(book);
                    DataFactory.saveBookList(bookList, bookFilePath);
                    List<Book> bookListFromFile = DataFactory.readBookList(bookFilePath);
                    System.out.println("BookList from .txt file : ");
                    for (Book bookFromFile : bookListFromFile) {
                        System.out.println(bookFromFile);
                    }
                }
                choiceMenu();
            }
            if (valueCheck == 2) {
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
            if (valueCheck == 3) {
                System.out.println("Please Typing Book ISBN to Update :");
                Scanner scanner = new Scanner(System.in);
                String toFindUpdate = scanner.nextLine();
                Book foundBook = null;
                for (Book bookItem : bookList) {
                    if (bookItem.getISBN().equals(toFindUpdate)) {
                        foundBook = bookItem;
                        Scanner newScanner = new Scanner(System.in);
                        System.out.println("New Title: ");
                        String title = newScanner.nextLine();
                        System.out.println("New Author Name: ");
                        String authorName = newScanner.nextLine();
                        System.out.println("New Year: ");
                        int year = Integer.parseInt(newScanner.nextLine());
                        bookItem.setTitle(title);
                        bookItem.setAuthorName(authorName);
                        bookItem.setYear(year);
                    }
                }
                if (foundBook == null) {
                    System.out.println("Not found this book to update");
                } else {
                    DataFactory.saveBookList(bookList, bookFilePath);
                    List<Book> bookListFromFile = DataFactory.readBookList(bookFilePath);
                    System.out.println("This is List Book After Deleting :");
                    for (Book bookItem : bookList) {
                        System.out.println(bookItem);
                    }
                }
                choiceMenu();
            }
            if (valueCheck == 4) {
                System.out.println("Please Type Book ISBN to Delete in List Book :");
                Scanner scanner = new Scanner(System.in);
                String toFindDelete = scanner.nextLine();
                Book foundBook = null;
                for (Book bookItem : bookList) {
                    if (bookItem.getISBN().equals(toFindDelete)) {
                        foundBook = bookItem;
                    }
                }
                if (foundBook == null) {
                    System.out.println("Not found this book to delete");
                } else {
                    bookList.removeIf(bookItem -> bookItem.getISBN().equals(toFindDelete));
                    DataFactory.saveBookList(bookList, bookFilePath);
                    List<Book> bookListFromFile = DataFactory.readBookList(bookFilePath);
                    System.out.println("This is List Book After Deleting :");
                    for (Book bookItem : bookList) {
                        System.out.println(bookItem);
                    }
                }
                choiceMenu();
            }
            else{
                System.out.println("Sorry Wrong");
                choiceMenu();
            }

        }

    }
}
