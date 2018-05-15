package Bibliothek;

/**
 * 
 * @author Fabian Pohl
 *
 */
public class LibraryTest {

	public static void main(String[] args) {
	

		Library bib = new Library();

		System.out.println("We are testing, if the library is empty");

		List booklist = bib.search("l");
	
		if (booklist == null) {
			System.out.println("Library is correctly empty");
		} else
			System.out.println("Library is wrongly not empty");

		
		 System.out.println(""); 

		 
		  LibraryItem book1 = new Book("The Internet of Money", "Andreas M. Antonopoulos");
		  LibraryItem book2 = new Book("wolf of wallstreet", "Jordan Belfort"); 
		  LibraryItem book3 = new Book("I am Zlatan ", "Zlatan Ibrahimovic");
		  LibraryItem book4 = new Book("The Lord of the Rings ", "J. R. R. Tolkien");
		  
		
		  LibraryItem blu1 = new BluRay(" Dragon Ball Z - Battle of Gods ","Masahiro Hosoda"); 
		  LibraryItem blu2 = new BluRay(" Wolf of Wallstreet ","Martin Scorsese"); 
		  LibraryItem blu3 = new BluRay(" Warcraft - The Beginning ","Duncan Jones");
		  LibraryItem blu4 = new BluRay("Lord of the Rings - The return of the King"," Peter Jackson");
		  
		  
		  bib.addItem(book1); 
		  bib.addItem(book2);
		  bib.addItem(book3);
		  bib.addItem(book4);
		  
		  bib.addItem(blu1); 
		  bib.addItem(blu2); 
		  bib.addItem(blu3);
		  bib.addItem(blu4);
		  
		  blu1.setBorrowed(); 
		  blu3.setBorrowed(); 
		
		  book1.setBorrowed(); 		
		  book4.setBorrowed();
		  
		  
		  System.out.println("");
		  System.out.println("Test if blueray is borrowed");
		  if (blu3.isBorrowed()){
			  System.out.println("Book is correctly borrowed");
		  } else  System.out.println("Book is wrongly not borrowed");
		  System.out.println("");
		  
		  System.out.println("");
		  System.out.println("Test if blueray is borrowed");
		  if (book3.isBorrowed()){
			  System.out.println("Book is wrongly borrowed");
		  } else  System.out.println("Book is correctly not borrowed");
		  System.out.println("");
		  
		  
		  
		  System.out.println("Output of the existing books "); 
		  System.out.println(book1.getDescription());
		  System.out.println(book2.getDescription());
		  System.out.println(book3.getDescription());
		  System.out.println(book4.getDescription());
		  
		  System.out.println(""); 
		  
		  System.out.println("Output of the existing BluRays "); 
		  System.out.println(blu1.getDescription());
		  System.out.println(blu2.getDescription());
		  System.out.println(blu3.getDescription());
		  System.out.println(blu4.getDescription());
		  
		  System.out.println(); 

		  
		  
		  
		  System.out.println("Testing if the library is empty");
		
		  
		
		  booklist = bib.search("w"); 
		  if (booklist.isEmpty()){
		  System.out.println("Library is wrongly empty"); } 
		  else
		  System.out.println("Library is correctly not empty"); 
	
		 
		  System.out.println();
		  
		  
		  System.out.println("Deleting The Lord of the Rings");
		  
		  bib.deleteItem(book4);
		  
		  
		  System.out.println("We test if the book is correctly deleted");
		  
		  booklist = bib.search("lord"); 
		  if
		  (booklist.isEmpty()) {
		  
		  System.out.println("book has been deleted correctly");
		  
		  } else System.out.println("Book still existing");
		  
		  
		  
		  
		  
		  }

}
