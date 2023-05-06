import java.util.Scanner;
public class Book {
    private String author;
    private String title;

    public static String getAuthor() {
        System.out.println("Podaj autora: ");
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        return author;
    }

    public static String getTitle() {
        System.out.println("Podaj tytuł: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        return title;
    }

    public static Book of(String author, String title) {
        Book book = new Book();
        book.title = title;
        book.author = author;
        return book;
    }

    public static void main(String[] args) {
        Book[] books = new Book[100];
        for (int i = 0;i < 100;i++){
            String author = Book.getAuthor();
            String title = Book.getTitle();
            books[i] = Book.of(author, title);
            System.out.println("New position added.");
            System.out.println("ACTUAL CATALOG:");
            for (int j = 0;j <= i;j++){
                System.out.println(j+1 + " -->  " + books[j].title + " written by " + books[j].author);
            }
            System.out.println("\n\n");

        }
    }
}