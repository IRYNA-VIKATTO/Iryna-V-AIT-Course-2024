package homework_44.book_and_computer;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int year;
    private double price;

    // Конструктор
    public Book(String title, String author, String genre, int year, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    // Геттеры
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
