package bai5_3;

public class ReferenceBook extends LibraryItem {
	private LibraryItem libraryItem;
	private String category;
	
	public ReferenceBook(int lid, String title, String authorName, String publisher, int maxRentedDays,
			double purchasePrice, LibraryItem libraryItem, String category) {
		super(lid, title, authorName, publisher, maxRentedDays, purchasePrice);
		this.libraryItem = libraryItem;
		this.category = category;
	}



	
}
