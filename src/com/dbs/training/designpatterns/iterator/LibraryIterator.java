package com.dbs.training.designpatterns.iterator;
public interface LibraryIterator {
	  public Book nextBook();
	 
	  public boolean isLastBook();
	 
	  public Book currentBook();
	}
