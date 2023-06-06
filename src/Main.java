
import java.util.*;

public class Main {
            public static void main(String[] args) throws InterruptedException{
                Library library = new Library();
                Scanner scanner = new Scanner(System.in);
                int choice;
                    System.out.println("What is your first name?");
                    String name = scanner.nextLine();


                    System.out.println("Hey!!! " + name + " what do you want to do?");

                do {
                    System.out.println("1. Add book?");
                    Thread.sleep(1500);
                    System.out.println("2. Remove book?");
                    Thread.sleep(1300);
                    System.out.println("3. Display books?");
                    Thread.sleep(1100);
                    System.out.println("4. or Exit");
                    Thread.sleep(1000);
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter title: ");
                            String title = scanner.next();
                            System.out.print("Enter author: ");
                            String author = scanner.next();
                            System.out.print("Enter publisher: ");
                            String publisher = scanner.next();
                            System.out.print("Enter ISBN: ");
                            int isbn = scanner.nextInt();
                            System.out.print("Enter year: ");
                            int year = scanner.nextInt();
                            library.addBook(new Book(title, author, publisher, isbn, year));
                            break;

                        case 2:
                            System.out.print("Enter the index of the book to remove: ");
                            int index = scanner.nextInt() - 1;
                            library.removeBook(index);
                            break;

                        case 3:
                            library.displayBooks();
                            break;

                        case 4:
                            System.out.println("Thank you " + name +" for using the Library Management System. Appreciate you much");
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } while (choice != 4);

                scanner.close();
            }
        }


        class Book {
            String title, author, publisher;
            int isbn, year;

            Book(String title, String author, String publisher, int isbn, int year) {
                this.title = title;
                this.author = author;
                this.publisher = publisher;
                this.isbn = isbn;
                this.year = year;
            }
        }

        class Library {
            ArrayList<Book> books;

            Library() {
                this.books = new ArrayList<>();
            }

            void addBook(Book book) {
                books.add(book);
                System.out.println("Book added successfully.");
            }

            void removeBook(int index) {
                books.remove(index);
                System.out.println("Book removed successfully.");
            }

            void displayBooks() {
                if (books.isEmpty()) {
                    System.out.println("No books available in the library.");
                    return;
                }

                System.out.println("List of books in the library:");
                for (int i = 0; i < books.size(); i++) {
                    System.out.println("Book " + (i + 1) + ":");
                    System.out.println("Title: " + books.get(i).title);
                    System.out.println("Author: " + books.get(i).author);
                    System.out.println("Publisher: " + books.get(i).publisher);
                    System.out.println("ISBN: " + books.get(i).isbn);
                    System.out.println("Year: " + books.get(i).year);
                }
            }
        }



