public class Listing {

    protected String name;
    protected Book book;
    protected String condition;
    protected double price;
    
    public Listing (String aName, Book aBook) {
        name = aName;
        book = aBook;
    }

    public String toString() {
        return name + "  " + book.getTitle();
    }
}
