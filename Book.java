public class Book {

    protected String title;
    protected String author;
    protected int ISBN;
    protected double price;

    /*
     *  BOOK: A book object that stores a book's information
     *
     */
    public Book (String aTitle, String anAuthor, int anISBN, double aPrice, String aCondition) {
        //Edition default of 1?
        title = aTitle;
        author = anAuthor;
        ISBN = anISBN;
        price = aPrice;
        condition = aCondition;
    }
    
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
    
    //in the future with the scraper we could make this store books in an array based on its associated course object
    public Array bookList(){
        Array bookList = new Array();
    }
    
    public static void main(String[] args){
        bookList1 = [Book("Sea of Poppies", "Ghosh", 9780312428594, 18,"new"),
        Book("Pagoda", "Powell", 9780156008297 , 26.25,"new"),
        Book("Coolitude" , "Carter",9781843310068 , 22.50,"new"),
        Book("Omeros", "Walcott", 9780374523503, 18,"new"),
        Book("Billy Budd, Bartleby & Other Stories", "Melville" ,9780143107606 , 11,"new"),
        Book("Cat's Table" , "Ondattje", 9780307744418 , 15.95,"new"),
        Book("Lord Jim", "Conrad",9780141441610 , 8,"new"),
        Book("Foe", "Coetzee",9780140096231 , 15,"new"),
        Book("Zong!" , "Philip" ,9780819571694 , 19.75,"new"),
        Book("Banjo" , "Mckay" , 9780156106757 , 18.95,"new")];
        bookList2 = [ Book("Linear Algebra and it's Applications" , "Lay" , 9780321982384, 214,"new", "5");];
        bookList3 = [  Book("Black Flags", "Warrick",9780804168939 , 16,"new"),
        Book("Violent Borders", "Jones", 9781784784713, 27.95,"new"),
        Book("Globalization Paradox", "Rodrik", 9780393341287, 18.9,"new")];
        bookList4 = [ Book("Microeconomics with Calculus" , "Nechyba",9781305650466, 381.25,"new")];
        
        System.out.println(bookList1);
        System.out.println(bookList2);
        System.out.println(bookList3);
        System.out.println(bookList4);
    }
}
 
