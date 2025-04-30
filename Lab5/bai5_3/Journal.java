package bai5_3;

public class Journal extends LibraryItem {
	private int publishedDate;

	public Journal(int lid, String title, String authorName, String publisher, int maxRentedDays, double purchasePrice,
			int publishedDate) {
		super(lid, title, authorName, publisher, maxRentedDays, purchasePrice);
		this.publishedDate = publishedDate;
	}






	
}
