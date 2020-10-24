package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book prata = new Book("C++", 1248);
        Book shildt = new Book("Java 8", 1377);
        Book tolstoy = new Book("Война и мир", 570);
        Book cod = new Book("Clean cod", 567);

        Book[] books = new Book[4];

        books[0] = prata;
        books[1] = shildt;
        books[2] = tolstoy;
        books[3] = cod;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getTitle() + " " + b.getPages());
        }

        books[0] = cod;
        books[3] = prata;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getTitle() + " " + b.getPages());
        }



    }
}
