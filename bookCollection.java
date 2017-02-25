public class BookCollection(){
  protected Book[] books;

  public BookCollection(){
    //maximize the array size to 15 books
    books = new Book[15];
  }
  public int length(){
    return books.length();
  }
  public void add(Book book){
    for(int i =0; i<books.length-1;++i){
      if(books[i]==null){
        books[i] = book;
      }
    }
  }
  /*public void remove(Book book){
  for(int i=0; i<books.length-1;++i){
  if(books[i].equals(book)){
  for(int j = books.length-1; j>i;++j){
  Book temp = books[j-1];
  books[j-1]= books[j];

}
}
}
}

*/
}
