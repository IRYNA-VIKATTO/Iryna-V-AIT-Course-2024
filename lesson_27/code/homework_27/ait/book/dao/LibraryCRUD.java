package homework_27.ait.book.dao;

import classwork_24.book_library.model.Book;

public interface LibraryCRUD {
    void createBook(Book book);

    Book getBookByAuthor( String author);

    boolean addBook(Book book);

    void printBooks();

    Book findByAuthor(String author);

    Book findBook(long isbn);

    Book removeBook(long isbn);

    int size(int size);
}
