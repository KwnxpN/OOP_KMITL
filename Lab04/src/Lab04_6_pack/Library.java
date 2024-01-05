package Lab04_6_pack;


import Lab04_6_pack.Book;

public class Library {
    public String libraryName;
    public Book book1, book2, book3;
    public void addBook(Book book, int slot) {
        switch(slot) {
            case 1:
                book1 = book;
                break;
            case 2:
                book2 = book;
                break;
            case 3:
                book3 = book;
                break;
        }
    }
    public void removeBook(int slot) {
        switch(slot) {
            case 1:
                book1 = null;
                break;
            case 2:
                book2 = null;
                break;
            case 3:
                book3 = null;
                break;
        }
    }
    public void printLibraryDetails() {
        System.out.println("Library: "+libraryName+"\n");
        
        printBookDetails(book1);
        System.out.println("");
        printBookDetails(book2);
        System.out.println("");
        printBookDetails(book3);
    }
    public void checkBookAvailability(int slot) {
        switch(slot) {
            case 1:
                if (book1 == null) {
                    System.out.println("Book in slot "+slot+" is not available.");
                }
                else {
                    System.out.println(book1.title+" is available.");
                }
                break;
            case 2:
                if (book2 == null) {
                    System.out.println("Book in slot "+slot+" is not available.");
                }
                else {
                    System.out.println(book2.title+" is available.");
                }
                break;
            case 3:
                if (book3 == null) {
                    System.out.println("Book in slot "+slot+" is not available.");
                }
                else {
                    System.out.println(book3.title+" is available.");
                }
                break;
        }
    }
    public void updateBookPrice(int slot, double newPrice) {
        switch(slot) {
            case 1:
                if (book1 == null) {
                    System.out.println("No book in this slot.");
                }
                else {
                    System.out.println("Updated price of "+book1.title+" to $"+newPrice+".");
                    book1.price = newPrice;
                }
                break;
            case 2:
                if (book2 == null) {
                    System.out.println("No book in this slot.");
                }
                else {
                    System.out.println("Updated price of "+book2.title+" to $"+newPrice+".");
                    book2.price = newPrice;
                }
                break;
            case 3:
                if (book3 == null) {
                    System.out.println("No book in this slot.");
                }
                else {
                    System.out.println("Updated price of "+book3.title+" to $"+newPrice+".");
                    book3.price = newPrice;
                }
                break;
        }
    }
    public void printBookDetails(Book book) {
        if (book == null) {
            System.out.println("No book in this slot.");
        }
        else if (book.equals(book1)) {
            book1.printDetails();
        }
        else if (book.equals(book2)) {
            book2.printDetails();
        }
        else if (book.equals(book3)) {
            book3.printDetails();
        }
    }
}
