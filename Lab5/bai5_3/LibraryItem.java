package bai5_3;

public abstract class LibraryItem {
	private int lid;
	private String title;
	private String authorName;
	private String publisher;
	private int maxRentedDays;
	private double purchasePrice;
	
	
	public LibraryItem(int lid, String title, String authorName, String publisher, int maxRentedDays,
			double purchasePrice) {
		super();
		this.lid = lid;
		this.title = title;
		this.authorName = authorName;
		this.publisher = publisher;
		this.maxRentedDays = maxRentedDays;
		this.purchasePrice = purchasePrice;
	}


	public int getLid() {
		return lid;
	}


	public void setLid(int lid) {
		this.lid = lid;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getMaxRentedDays() {
		return maxRentedDays;
	}


	public void setMaxRentedDays(int maxRentedDays) {
		this.maxRentedDays = maxRentedDays;
	}


	public double getPurchasePrice() {
		return purchasePrice;
	}


	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}


	@Override
	public String toString() {
		return "ID: " + lid + " - title: " + title + " - authorName: " + authorName + " - publisher: " + publisher + "- maxRentedDays: " + maxRentedDays + " - purchasePrice: " + purchasePrice;
	}

	public abstract String getType();
	
	// c) Viết phương thức isAuthor xác định xem một ấn phẩm có phải do một tác giả có tên cho trước viết không.
	public boolean isAuthor(String otherAuthor) {
	return this.authorName.equals(otherAuthor);
	}
	//e) Tính giá đền một ấn phẩm khi độc giả làm mất ấn phẩm được cho mượn, biết rằng, với: 
	public abstract double calculate();

}
