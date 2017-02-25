public class Course{
  String title;
  String listing;
  int num;
  BookCollection bookList;
  int section;
//course objects with a constructed array of book objects(filled from a scraper)
  public Course(String aTitle, String courseTitle, BookCollection books, int aSection){
  title = aTitle;
  listing = courseTitle;
  bookList = books;
  section = aSection;
  }
  public String getTitle(){
    return title;
    }

  public int getListing(){
    return listing;
  }

  public String getDepartment(){
    return department;
  }

  public int getSection(){
    return section;
  }

  public String toString(){
    String courseDescription = "Title: " + getTitle + " " + getListing + " Books requiered" +  ;

    for(int bookNum = 0; bookNum < bookList.length; bookNum++){
      books+= (bookList[bookNum] + "\n");
      }
    return books;
  }

  /*public vector allCourses(){
    //Scraper use to store all populated courses with their populated arrays in a vector
  }*/

  public String toString(){
    String cBooks = "Your required book(s) are: ";
    return (cBooks + this.getBooks());
  }
}
