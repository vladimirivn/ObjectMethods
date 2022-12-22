package homework2_7;

import java.util.Objects;

public class Book {

    private  String bookName;
    private  Author author;
    private  int publishingYear;

    public Book (String bookName, Author author, int publishingYear ) {
        this.bookName = bookName;
        this.author =  author;
        this.publishingYear = publishingYear;

    }
    public String getBookName() {
        return this.bookName;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString() {
        return "Книга: " + this.bookName + ". " + this.author + ". Год издания: " + this.publishingYear;
    }
    @Override
    public boolean equals(Object book) {
        if (this.getClass() != book.getClass()) {
            return false;
        }
        Book book2 = (Book) book;

        return bookName.equals(book2.bookName) && author.equals(book2.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }


}


