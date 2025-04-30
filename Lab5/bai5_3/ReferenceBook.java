package bai5_3;

public class ReferenceBook extends LibraryItem {
	private String category;

	public ReferenceBook(int lid, String title, String authorName, String publisher, int maxRentedDays,
			double purchasePrice, String category) {
		super(lid, title, authorName, publisher, maxRentedDays, purchasePrice);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ReferenceBook [category=" + category + "]";
	}
	




	
}
