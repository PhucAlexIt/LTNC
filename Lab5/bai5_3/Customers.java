package bai5_3;

import java.util.ArrayList;
import java.util.List;

public class Customers {
	private String name;
    private String email;
    private List<RentItem> rentItems;
	public Customers(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.rentItems = new ArrayList<RentItem>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<RentItem> getRentItems() {
		return rentItems;
	}
	public void setRentItems(List<RentItem> rentItems) {
		this.rentItems = rentItems;
	}
    public void addRentItem(RentItem rentItem) {
        rentItems.add(rentItem);
    }
    public void displayInfo() {
    	 System.out.println(name + ", " + email);
         for (RentItem rent : rentItems) {
             System.out.println(rent);
         }
    }
}
