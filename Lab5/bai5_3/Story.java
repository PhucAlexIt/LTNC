package bai5_3;

public class Story extends LibraryItem {
	private String category;
	private int publishedDate;
	
	public Story(int lid, String title, String authorName, String publisher, int maxRentedDays, double purchasePrice,
			String category, int publishedDate) {
		super(lid, title, authorName, publisher, maxRentedDays, purchasePrice);
		this.category = category;
		this.publishedDate = publishedDate;
	}
	


}
