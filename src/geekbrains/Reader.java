package geekbrains;

public class Reader {
    String name;
    Integer libraryCard;
    String faculty;
    String dateOfBirth;
    String phoneNumber;


    public Reader(String name, Integer libraryCard, String faculty,
                  String dateOfBirth, String phoneNumber) {
        this.name = name;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", libraryCard=" + libraryCard +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void takeBook(){

    }

    public void takeBook(int books) {
        System.out.println(this.name + " взял " + books + " книг");
    }

    public void returnBook() {

    }

    public void returnBook(int books){
        System.out.println(this.name + " вернул " + books + " книг");
    }

    public static void main(String[] args) {
        Reader reader1 = new Reader("Сергеев Сергей Сергеевич", 123458,
                "Информационных технологий", "01.01.1990", "5553535");
        Reader reader2 = new Reader ("Сидоров Сидор Сидорович", 123459,
                "Информационных технологий", "15.10.1992", "5553536");


        reader1.takeBook(3);
        reader1.returnBook(1);

        reader2.takeBook(2);
        reader2.returnBook(2);

    }

}


////////////////////

/*
public static void main(String[] args) {
    Reader reader = new Reader("Сергеев Сергей Сергеевич", 123458, "Информационных технологий",
            "01.01.1990", "5553535");   //создаем читателя
    System.out.println(reader); //выводим информацию о читателе
    System.out.println("Читатель взял книгу: " + Book.book1.takeBook()); //выводим какую книгу взял читатель
 */