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
		return "ID: " + getLid() + " - title: " +getTitle() + " - authorName: " + getAuthorName() + " - publisher: " + getPublisher() + "- maxRentedDays: " + getMaxRentedDays()
		+ " - purchasePrice: " + getPurchasePrice() +" - Category: "+this.category;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Reference Book";
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return  getPurchasePrice() * 1.2;
	}




	
}
