package classwork_24.book_library.controller;

import classwork_24.book_library.model.Book;
import homework_27.ait.book.dao.LibraryCRUD;

public class Library implements LibraryCRUD {



//Реализовать методы:
//        - печать списка всех книг в библиотеке; +
//        - получение кол-ва книг в библиотеке; +
//        - поиска книги по ISBN; +
//        - добавление книги в библиотеку с учетом требований:
//           - не добавлять null
//           - не добавлять дубликат
//           - не добавлять больше, чем может вместить в себя библиотека.
//        - удаление книги из библиотеки.

        // fields
        private Book[] books;
        private int size;// текущее кол-во книг
        private String author;


        // constructor
        public Library(int capacity) {
            this.books = new Book[capacity];
            this.size = 0;
        }

        // CRUD methods
        public boolean addBook(Book book){
            // negative cases
            if(book == null){
                return false;
            }
            if(size == books.length){
                return false;
            }
            if (!(findBook(book.getIsbn()) == null)) {
                return false;
            }
            // positive case
            books[size] = book; // ставим книгу в конец массива, первое свободное место
            size++;
            return true;
        }

        // void printBooks()
        public void printBooks() {
            for (int i = 0; i < size; i++) {
                System.out.println(books[i]);
            }
        }

    // find by author
     public Book findByAuthor(String author){
            for (int i = 0; i < size; i++) {
                if(books[i].getAuthor().equalsIgnoreCase(author) ){
                    return books[i];
                }
            }
            return null;
        }


        public Book findBook(long isbn){
            for (int i = 0; i < size; i++) {
                if(books[i].getIsbn() == isbn){
                    return books[i];
                }
            }
            return null;
        }

        public Book removeBook(long isbn){
            for (int i = 0; i < size; i++) {
                if(books[i].getIsbn() == isbn){
                    Book victim = books[i];
                    books[i] = books[size - 1];// last book put instead victim
                    books[size - 1] = null;// затираем последний элемент массива
                    size--;
                    return victim;
                }
            }
            return null;
        }

    @Override
    public int size(int size) {
        return 0;
    }

    // boolean updateBook()
        public int size(){
            return size;
        }

    @Override
    public void createBook(Book book) {

    }

    public Book getBookByAuthor(String author){
        for (Book book : books) { // books - это коллекция книг)
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book; // Если нашли книгу с заданным автором, возвращаем её
            }
        }
        return null;
    }




}
