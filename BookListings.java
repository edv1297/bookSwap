import structure5.*;

public class BookListings {

    Vector <Association <Book, Listing>> bookListings;
    
    /*
     *  The Constructor for the Booklistings Data Structure
     */
    public BookListings(Book[] bookList) {
        bookListings = new Vector <Association <Book, Vector>> ();

        // Load the books into the BookListings
        for (int i = 0; i < bookList.length; i++) {
            Association <Book, ListingVector>> assoc = bookListings.get(i);
            assoc.getKey() = bookList(i);
            assoc.getValue() = new Vector<Listing>();
        }
    }
}
