public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name + " has " + this.books.length + " books.");
        System.out.println();
        System.out.println("Books available for checkout are: ");
        // Data type Book for every book in the array of books
        for(Book book : books ){
            System.out.println(book.displayInfo());
            System.out.println();
        }
    }
}