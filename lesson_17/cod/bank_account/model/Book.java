package bank_account.model;
//Создать класс Книга с полями:
//
//уникальный номер ISBN
//название название
//автор автор
//год издания
//жанр жанр
//В классе Book реализован конструктор, геттеры и сеттеры для всех полей и метод отображения,
// который выводит информацию о книге.
// Создать конструктор, в котором нет поля ISBN.
// Создайте конструктор, в котором есть только поля название, автор и жанр.

public class Book {

    //fields
    private long isbn;
    private String titleBook;
    private String authorBook;
    private int yearOfPublcation;
    private String genreBook;

    public Book(long isbn, String titleBook, String authorBook, int yearOfPublcation, String genreBook) {
        this.isbn = isbn;
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearOfPublcation = yearOfPublcation;
        this.genreBook = genreBook;
    }

    public Book(String titleBook, String authorBook, int yearOfPublcation, String genreBook) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearOfPublcation = yearOfPublcation;
        this.genreBook = genreBook;
    }


    public Book(String titleBook, String authorBook, String genreBook) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.genreBook = genreBook;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getYearOfPublcation() {
        return yearOfPublcation;
    }

    public void setYearOfPublcation(int yearOfPublcation) {
        this.yearOfPublcation = yearOfPublcation;
    }

    public String getGenreBook() {
        return genreBook;
    }

    public void setGenreBook(String genreBook) {
        this.genreBook = genreBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", titleBook='" + titleBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                ", yearOfPublcation=" + yearOfPublcation +
                ", genreBook='" + genreBook + '\'' +
                '}';
    }
}
