package homework2_7;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Лев","Толстой");
        Author author2 = new Author("Александр","Пушкин");

        Book book1 = new Book("Война и Мир",author1,2020);
        Book book2 = new Book("Полтава",author2,2022);

        System.out.println("Книга: "+book1.getBookName()+", издания:"+ book1.getPublishingYear());
        System.out.println("Автор: "+ author1.getFirstName()+" "+ author1.getLastName());

        book1.setPublishingYear(2021);
        System.out.println("Книга: "+book1.getBookName()+", издания:"+ book1.getPublishingYear()+"\n");

        System.out.println("Книга: "+book2.getBookName()+", издания:"+ book2.getPublishingYear());
        System.out.println("Автор: "+ author2.getFirstName()+" "+ author2.getLastName()+"\n");

        System.out.println("-------------------------------------------");

        System.out.println(author1.toString());
        System.out.println(book1.toString());

        System.out.println(author2.toString());
        System.out.println(book2.toString());

        System.out.println("-------------------------------------------");

        System.out.println(author1.equals(author2)); //false
        System.out.println(book1.equals(book2));  //false
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println("-------------------------------------------");

        author2 = author1;
        System.out.println(author1.equals(author2)); // true
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

    }
}
