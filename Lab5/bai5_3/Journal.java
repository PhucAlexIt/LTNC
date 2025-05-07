package bai5_3;

public class Journal extends LibraryItem {
	private Date publishedDate;

	public Journal(int lid, String title, String authorName, String publisher, int maxRentedDays, double purchasePrice,
			Date publishedDate) {
		super(lid, title, authorName, publisher, maxRentedDays, purchasePrice);
		this.publishedDate = publishedDate;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	@Override
	public String toString() {
		return "ID: " + getLid() + " - title: " +getTitle() + " - authorName: " + getAuthorName() + " - publisher: " + getPublisher() + "- maxRentedDays: " + getMaxRentedDays()
		+ " - purchasePrice: " + getPurchasePrice() +" - Date: "+this.publishedDate;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Journal";
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return  getPurchasePrice() * 0.8;
	}
	






	
}
