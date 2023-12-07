/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksheet1.pkg1.pkg10;

/**
 *
 * @author NelJoy
 */
public class TestBook {
    public static void main(String[] args) {
        // Instantiate three Book objects with different values using the constructor
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print out the details of each book
        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year Published: " + book1.getYearPublished());
        System.out.println("Price: $" + book1.getPrice());
        System.out.println();

        System.out.println("Book 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year Published: " + book2.getYearPublished());
        System.out.println("Price: $" + book2.getPrice());
        System.out.println();

        System.out.println("Book 3:");
        System.out.println("Title: " + book3.getTitle());
        System.out.println("Author: " + book3.getAuthor());
        System.out.println("Year Published: " + book3.getYearPublished());
        System.out.println("Price: $" + book3.getPrice());
    }
}


    

