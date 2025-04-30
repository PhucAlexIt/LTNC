package bai5_3;

public class RentItem {
	private LibraryItem item;
	private int rentedDays;
	
		
	public RentItem(LibraryItem item, int rentedDays) {
		super();
		this.item = item;
		this.rentedDays = rentedDays;
	}


	public LibraryItem getItem() {
		return item;
	}


	public void setItem(LibraryItem item) {
		this.item = item;
	}


	public int getRentedDays() {
		return rentedDays;
	}


	public void setRentedDays(int rentedDays) {
		this.rentedDays = rentedDays;
	}
	 
	
}
