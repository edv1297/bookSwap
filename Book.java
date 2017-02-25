public class Book {

    protected String title;
    protected String author;
    protected int ISBN;
    protected double price;

    /*
     *  BOOK: A book object that stores a book's information
     *
     */
    public Book (String aTitle, String anAuthor, int anISBN, double aPrice, String aCondition, String aEdition) {
        //Edition default of 1?
        title = aTitle;
        author = anAuthor;
        ISBN = anISBN;
        price = aPrice;
        condition = aCondition;
        edition = aEdition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return title + " by " + author + " (" + ISBN + ") sells for " + price;
    }

    public void setPrice (double newPrice) {
        price = newPrice;
    }
    
    public static void main(String[] args){
        Book   
    }
}
 
