import java.util.Scanner;

public class BookSwap {
    
    protected Courses courses;
    
    public static void main(String args[]) {

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
