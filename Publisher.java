import java.util.Scanner;

public class Publisher {
    String publisherName;

    void getPublisher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Publisher Name: ");
        publisherName = sc.nextLine();
    }

    public static void main(String[] args) {

        Literature l = new Literature();
        Fiction f = new Fiction();

        System.out.println("Enter Literature Book Details:");
        l.getBook();
        l.display();

        System.out.println("\nEnter Fiction Book Details:");
        f.getBook();
        f.display();
    }
}

class Book extends Publisher {
    String bookTitle;
    double price;

    void getBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        bookTitle = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Publisher Name: ");
        publisherName = sc.nextLine();
    }
}

class Literature extends Book {
    void display() {
        System.out.println("\nCategory: Literature");
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisherName);
    }
}

class Fiction extends Book {
    void display() {
        System.out.println("\nCategory: Fiction");
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisherName);
    }
}