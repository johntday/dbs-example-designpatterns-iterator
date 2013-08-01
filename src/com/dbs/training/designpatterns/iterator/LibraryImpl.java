package com.dbs.training.designpatterns.iterator;
import java.util.ArrayList;
import java.util.List;
 
public class LibraryImpl implements ILibrary {
 
  List<Book> bookList;
 
  public LibraryImpl() {
    bookList = new ArrayList<Book>();
  }
 
  @Override
  public List<Book> getBooks() {
 
    return bookList;
  }
 
  @Override
  public void addBook(Book book) {
    bookList.add(book);
  }
 
  @Override
  public void removeBook(Book book) {
    bookList.remove(book);
  }
 
  @Override
  public LibraryIterator createIterator(String iteratorType) {
    if ("Fiction".equals(iteratorType)) {
      return new FictionIterator(bookList);
    } else if ("NonFiction".equals(iteratorType)) {
      return new NonFictionIterator(bookList);
    } else {
      throw new RuntimeException("Unknown iteratorType=" + iteratorType);
    }
  }
}
