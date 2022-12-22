package homework2_7;

import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;

    public Author (String firstName, String lastName ) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public String getFirstName(){
        return  this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    @Override
    public String toString() {
        return "Автор : " + this.firstName + " "+ this.lastName;
    }

    @Override
    public boolean equals(Object author) {
        if (this.getClass() != author.getClass()) {
            return false;
        }
        Author author2 = (Author) author;

        return firstName.equals(author2.firstName) && lastName.equals(author2.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
