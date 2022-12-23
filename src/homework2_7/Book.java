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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}


