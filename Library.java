/*
Create a class hierarchy for a Library System. Implement a base class Item with 
properties like title, author, and publicationYear. Derive two classes, Book and 
Magazine, from the Item class. Each derived class should have additional properties 
such as genre for books and issueNumber for magazines. Write methods in each class 
to display their details. Demonstrate the use of inheritance by creating objects of 
both classes and calling their respective methods.
 */
class Item {
    String title;
    String author;
    int publishing_year;
}
class Book extends Item {
    String genre;
    Book(String title, String author, int publishing_year, String genre) {
        this.title=title;
        this.author=author;
        this.publishing_year=publishing_year;
        this.genre=genre;
    }
    void displayDetails() {
        System.out.println("BOOK DETAILS:");
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPublishing Year: "+publishing_year+"\nGenre: "+genre+"\n");
    }
}
class Magazine extends Item {
    int issueNumber;
    Magazine(String title, String author, int publishing_year, int issueNumber) {
        this.title=title;
        this.author=author;
        this.publishing_year=publishing_year;
        this.issueNumber=issueNumber;
    }
    void displayDetails() {
        System.out.println("MAGAZINE DETAILS:");
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPublishing Year: "+publishing_year+"\nIssue Number: "+issueNumber+"\n");
    }
}
public class Library {
    public static void main(String[] args) {
        Book book1=new Book("Title 1", "Author 1", 2024, "Genre 1");
        book1.displayDetails();
        Magazine magazine1=new Magazine("Magazine 1", "M Author 1", 2025, 03022025);
        magazine1.displayDetails();
    }
}
