import java.util.Scanner;

public class BookSwap {
    
    protected Courses courses;
    
public static void main(String args[]){
  Book[] book = {
                new Book("Sea of Poppies", "Ghosh", "9780312428594", 18,"new"),
                new Book("Pagoda", "Powell", "9780156008297" , 26.25,"new",
                new Book("Coolitude" , "Carter","9781843310068" , 22.50,"new"),
                new Book("Omeros", "Walcott","9780374523503", 18,"new"),
                new Book("Billy Budd, Bartleby & Other Stories", "Melville" , "9780143107606" , 11,"new"),
                new Book("Cat's Table" , "Ondattje", "9780307744418" , 15.95,"new"),
                new Book("Lord Jim", "Conrad","9780141441610" , 8,"new"),
                new Book("Foe", "Coetzee","9780140096231" , 15,"new"),
                new Book("Zong!" , "Philip" ,"9780819571694" , 19.75,"new"),
                new Book("Banjo" , "Mckay" ,"9780156106757" , 18.95,"new")};

  Book[] book2 = {new Book("Linear Algebra and it's Applications" , "Lay" , "9780321982384", 214,"new", "5")};
  
  Book[] book3 = {
                new Book("Black Flags", "Warrick","9780804168939" , 16,"new"),
                new Book("Violent Borders", "Jones", "9781784784713", 27.95,"new"),
                new Book("Globalization Paradox", "Rodrik", "978039334128", 18.9,"new")};
                
  Book[] book4 =
                new Book("Microeconomics with Calculus" , "Nechyba", "9781305650466", 381.25,"new")};

  
  Booklist bookList1 = new BookCollection();
  for(int i = 0; i< 10; i++){
      bookList1.add(book[i]);
  }
  Booklist bookList2 = new BookCollection();
  for(int i = 0; i<book2.length; i++){
    bookList2.add(book2[i]);
  }
  BookCollection bookList3 = new BookCollection();
    for(int j = 0; j<book3.length;j++){
      bookList3.add(book3[i]);
    }
    BookCollection bookList4 = new BookCollection();
    for(int k = 0; k<book4.length;k++){
      bookList4.add(book4[i]);
    }

        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to BookExchange!\nAre you a BUYER or a SELLER?");
        String status = in.next().toLowerCase();
        
        if(status.equals("buyer")) {    
            System.out.println(">What class are you looking for?");
            String course = in.next();
            System.out.println(">What section are you in?");
            int section = in.nextLine();
            Buyer buyer = new Buyer(course, section, courses, /*[ListingDatabase]*/);
        } else if(status.equals("seller")) {
            System.out.println(">What class are you selling for?");
            Seller seller = new Seller();
        } else {
            System.out.println(">Try again.");   
        }
        
    }   
}
