public class Aggregation {
    public static void main (String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects
        // One object contains another object as part of its structure,
        // but the contained object/s can exist independently.

        Book book1 = new Book("Diary of a Wimpy Kid",274);
        Book book2 = new Book("Captain Underpants",110);
        Book book3 = new Book("Harry Potter",545);
        Book book4 = new Book("Berserk",320);
        Book book5 = new Book("Sleep Better",75);

        Book[] books = {book1, book2, book3, book4, book5};

        // Library object contains an array of book objects
        Library library = new Library("Kenosha Public Library",1896,books);

        library.displayInfo();
    }
}