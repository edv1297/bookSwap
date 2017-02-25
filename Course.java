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
    
}
