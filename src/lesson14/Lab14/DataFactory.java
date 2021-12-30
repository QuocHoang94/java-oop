package lesson14.Lab14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static void saveBookList(List<Book> booksList, String path) {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        ) {
            for (Book book : booksList) {
                String bookData = book.getISBN() + ";" + book.getTitle() + ";" + book.getAuthorName() + ";" + book.getYear();
                bufferedWriter.write(bookData);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // IO try catch
        // Close Resources

        //Try with Resources

    }

    public static List<Book> readBookList(String filePath) {
        List<Book> bookList = new ArrayList<>();
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(";");
                String ISBN = bookData[0];
                String title = bookData[1];
                String authorName = bookData[2];
                int year = Integer.parseInt(bookData[3]);
//                bookList.add(new Book(ISBN,title,authorName,year));
                Book book = new Book(ISBN,title,authorName,year);
                bookList.add(book);
                dataLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }
}
