package bank_account;

import bank_account.model.Book;

public class BookAppl {

    public static void main(String[] args) {

        Book book001 = new Book(1001,"War and Peace", "Leo Tolstoy",1864,"novel");

        System.out.println(book001);

        Book book002 = new Book("Anna Karenina", "Leo Tolstoy","novel");

        System.out.println(book002);

        Book book003 = new Book("Resurrection","Leo Tolstoy",2009,"novel");

        System.out.println(book003);
    }


}
