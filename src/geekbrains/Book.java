package geekbrains;

public class Book {
    String bookName;
    String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book ("Война и мир", "Л. Н. Толстой");
        Book book2 = new Book ("Преступление и наказание", "Ф. М. Достоевский");
        Book book3 = new Book ("Мастер и Маргарита", "М. А. Булгаков");
        Book book4 = new Book ("Мертвые души", "Н. В. Гоголь");
        Book book5 = new Book ("Отцы и дети", "И. С. Тургенев");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);

    }
}

