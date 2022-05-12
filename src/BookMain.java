import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("A Witch in the Grden ", 272, 2021));
        books.add(new Book("Becoming ", 464, 2021));
        books.add(new Book("Gursha", 53, 2021));
        books.add(new Book("Diary"));
        books.add(new Book("Psychology1", 49));
        books.add(new Book());

        System.out.println(" add more books please ? In addition to the list;");

        while (true){
            System.out.println("Enter a name (or an empty line to stop adding books):");
            String title = scanner.nextLine();
            if (title.isEmpty()){
                break;
            }

            System.out.println("How many pages is this book?");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("What year was it published?");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
            System.out.println("Book added  ");
        }
        while (true) {
            System.out.println("What information will be printed? (everything/title?)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("everything")) {
                for (Book book : books) {
                    System.out.println(book);
                }
                return;
            } else if (response.equalsIgnoreCase("title")) {
                for (Book book : books) {
                    System.out.println(book.getTitle());
                }
                return;
            } else {
                System.out.println("Error, it's not an option.");
            }
        }
    }
}
