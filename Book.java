public class Book{

      protected String title;
      protected String author;
      protected String isbn;
      protected double price;
      protected String condition;
      protected String edition;

      public Book (String aTitle, String anAuthor, String anISBN, double aPrice, String aCondition, String aEdition) {
          //Edition default of 1?
          title = aTitle;
          author = anAuthor;
          isbn = anISBN;
          price = aPrice;
          condition = aCondition;
          edition = aEdition;
      }

      public String getTitle(){
          return this.title;
      }

      public String getAuthor() {
          return this.author;
      }

      public String getISBN() {
          return this.ISBN;
      }

      public double getPrice() {
          return this.price;
      }

      public String toString() {
          String s = this.getTitle() + " by " + this.getAuthor() + " (" + this.getISBN()  + ") sells for " + this.getPrice();
          return s;
      }

      public void setPrice (double newPrice) {
          price = newPrice;
      }

      //in the future with the scraper we could make this store books in an array based on its associated course object
      /* public Array bookList(){
          Array bookList = new Array();
  	}*/
  }
/*
  Book book1 = new Book("Sea of Poppies", "Ghosh", "9780312428594", 18,"new");
  Book book2 = new Book("Pagoda", "Powell", "9780156008297" , 26.25,"new");
  Book book3 = new Book("Coolitude" , "Carter","9781843310068" , 22.50,"new");
  Book book4 = new Book("Omeros", "Walcott","9780374523503", 18,"new");
  Book book5 = new Book("Billy Budd, Bartleby & Other Stories", "Melville" , "9780143107606" , 11,"new");
  Book book6 = new Book("Cat's Table" , "Ondattje", "9780307744418" , 15.95,"new");
  Book book7 = new Book("Lord Jim", "Conrad","9780141441610" , 8,"new");
  Book book8 = new Book("Foe", "Coetzee","9780140096231" , 15,"new");
  Book book9 = new Book("Zong!" , "Philip" ,"9780819571694" , 19.75,"new");
  Book book10 = new Book("Banjo" , "Mckay" ,"9780156106757" , 18.95,"new");
  Book book11 = new Book("Linear Algebra and it's Applications" , "Lay" , "9780321982384", 214,"new", "5");
  Book book12 = new Book("Black Flags", "Warrick","9780804168939" , 16,"new");
  Book book13 = new Book("Violent Borders", "Jones", "9781784784713", 27.95,"new");
  Book book14 = new Book("Globalization Paradox", "Rodrik", "978039334128", 18.9,"new");
  Book book15 = new Book("Microeconomics with Calculus" , "Nechyba", "9781305650466", 381.25,"new");
