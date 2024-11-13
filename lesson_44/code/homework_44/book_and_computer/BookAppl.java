package homework_44.book_and_computer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookAppl {
    public static void main(String[] args) {
        // Создаем список книг
        List<Book> books = Arrays.asList(
                new Book("War and Peace", "Leo Tolstoy", "Historical", 1869, 20.0),
                new Book("1984", "George Orwell", "Dystopian", 1949, 12.0),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 1925, 10.0),
                new Book("Moby-Dick", "Herman Melville", "Adventure", 1851, 15.0),
                new Book("Pride and Prejudice", "Jane Austen", "Romance", 1813, 8.0),
                new Book("Brave New World", "Aldous Huxley", "Dystopian", 1932, 14.0)
        );

        // Отобразить все книги
        System.out.println("Все книги:");
        books.forEach(System.out::println);

        // Отобразить книги определённого жанра
        String genreFilter = "Dystopian";
        System.out.println("\nКниги жанра " + genreFilter + ":");
        books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genreFilter))
                .forEach(System.out::println);

        // Отобразить книги дороже определённой цены
        double priceFilter = 12.0;
        System.out.println("\nКниги дороже " + priceFilter + ":");
        books.stream()
                .filter(book -> book.getPrice() > priceFilter)
                .forEach(System.out::println);

        // Отобразить книги, изданные в заданном диапазоне лет
        int yearStart = 1900;
        int yearEnd = 2000;
        System.out.println("\nКниги, изданные с " + yearStart + " по " + yearEnd + ":");
        books.stream()
                .filter(book -> book.getYear() >= yearStart && book.getYear() <= yearEnd)
                .forEach(System.out::println);

        // Отсортировать книги по цене (по убыванию)
        System.out.println("\nКниги, отсортированные по убыванию цены:");
        books.stream()
                .sorted(Comparator.comparingDouble(Book::getPrice).reversed())
                .forEach(System.out::println);

        // Получить среднюю цену книг
        double averagePrice = books.stream()
                .mapToDouble(Book::getPrice)
                .average()
                .orElse(0);
        System.out.println("\nСредняя цена книг: " + averagePrice);

        // Подсчитать количество книг по жанрам
        System.out.println("\nКоличество книг по жанрам:");
        books.stream()
                .collect(Collectors.groupingBy(Book::getGenre))
                .forEach((genre, bookList) -> {
                    System.out.println(genre + ": " + bookList.size());
                });
    }


}