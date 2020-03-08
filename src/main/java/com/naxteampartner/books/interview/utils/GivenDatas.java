package com.naxteampartner.books.interview.utils;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import com.naxteampartner.books.interview.model.Author;
import com.naxteampartner.books.interview.model.Book;
import com.naxteampartner.books.interview.model.Author.Country;
import com.naxteampartner.books.interview.model.Book.Category;

public class GivenDatas {
	
	static Author john = new Author("John Keegan", 78, Country.UK);
	static Author angeli = new Author("Marguerite de Angeli", 98, Country.USA);
	static Author lewis = new Author("Charlton Miner Lewis", 57, Country.FR);
	static Author gwen = new Author("Gwen Shamblin", 64, Country.DE);
	static Author nestle = new Author("Marion Nestle", 64, Country.UK);
	static Author mark = new Author("Mark Lutz", 49, Country.USA);
	static Author jerry = new Author("Jerry Peek", 57, Country.FR);
	static Author bob = new Author("Bob LeVitus", 63, Country.USA);
	static Author dennis = new Author("Dennis M. Ritchie", 63, Country.USA);
	
	
	static Book b1 = new Book("Face of Battle", LocalDate.of(1983, Month.JANUARY, 1), 15, Category.HISTORY, john);
	static Book b2 = new Book("Door in the Wall", LocalDate.of(1998, Month.AUGUST, 1), 8, Category.HISTORY, angeli);
	static Book b3 = new Book("Beowulf", LocalDate.of(1992, Month.SEPTEMBER, 1), 14, Category.HISTORY, john);
	static Book b4 = new Book("Gunslinger", LocalDate.of(2016, Month.MAY, 1), 10, Category.HISTORY, lewis);
	
	static Book b5 = new Book("Weigh down Diet", LocalDate.of(1997, Month.FEBRUARY, 1), 10, Category.MEDICAL, gwen);
	static Book b6 = new Book("Two Towers", LocalDate.of(1986, Month.AUGUST, 1), 8, Category.MEDICAL, lewis);
	static Book b7 = new Book("Lord of the Rings", LocalDate.of(1998, Month.MARCH, 1), 54, Category.MEDICAL, john);
	static Book b8 = new Book("Nutritional Healing", LocalDate.of(1997, Month.FEBRUARY, 1), 10, Category.MEDICAL, nestle);
	
	static Book b9 = new Book("Learning Python", LocalDate.of(2013, Month.JULY, 1), 32, Category.TECHNOLOGY, mark);
	static Book b10 = new Book("UNIX PowerTools", LocalDate.of(1997, Month.AUGUST, 1), 5, Category.TECHNOLOGY, jerry);
	static Book b11 = new Book("Mac OS X Leopard", LocalDate.of(2008, Month.MAY, 1), 10, Category.TECHNOLOGY, bob);
	static Book b12 = new Book("C Programming Language", LocalDate.of(1978, Month.FEBRUARY, 1), 9, Category.TECHNOLOGY, dennis);

	public static List<Book> givenBooks(){
		return Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12);
	}
}
