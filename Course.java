public class Course{
  //course objects with a constructed array of book objects(filled from a scraper)
  public Course(String aTitle, String aDepartment, int courseNum, array Book[], int aSection){
    String title = aTitle;
    String department = aDepartment;
    int num = courseNum;
    Array books = Book[];
    int section = aSection;
    }
    
    public String getTitle(){
      return this.title;
      }
    
    public int getNum(){
      return this.num;
    }
    
    public getDepartment(){
      return this.department;
    }
    
    public int getSection(){
      return this.section;
    }
    
    public String getBooks(){
      bookslist = "";
      for(int bookNum = 0; bookNum < this.books.size(); bookNum++){
        bookList += (" " + books.get(bookNum));
        }
      return booksList
    }
    
    public vector allCourses(){
      //Scraper use to store all populated courses with their populated arrays in a vector
    }
    
    public String toString(){
      String cBooks = "Your required book(s) are: ";
      return (cBooks + this.getBooks());
    }
    
    public static void main(String[] args){
       public Course(String aTitle, String aDepartment, int courseNum, array Book[], int aSection);
      Course("Across the Oceans and Seas", "COMP", 358, , 01);
      Course("Linear Algebra", "MATH", 250, , 02);
      Course("World Politics: An Introduction to International Relations", "PSCI", 202, , 01);
      Course("Price and Allocation Theory", "ECON" , 251, , 02);
  
    }
}
