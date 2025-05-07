package bai5_3;

public class Story extends LibraryItem {

	public Story(int lid, String title, String authorName, String publisher, int maxRentedDays, double purchasePrice) {
		super(lid, title, authorName, publisher, maxRentedDays, purchasePrice);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Story";
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return  getPurchasePrice() * 1.2;
	}

	
	
	


}
