package bai5_3;

public class App {
	public static void main(String[] args) {

        ReferenceBook book1 = new ReferenceBook(101, "Bậc thầy môi giới địa ốc", "Henry Huỳnh Anh Dũng", "NXB Trẻ", 7, 300000, "Kinh tế");
        ReferenceBook book2 = new ReferenceBook(102, "Nhạc lý căn bản và nâng cao", "Lương Bằng Vinh", "NXB Thị Nghè", 7, 30000, "Nhạc");

        Story story1 = new Story(201, "Doremon", "Fujiko. F. Fujio", "NXB Kim Đồng", 3, 20000);
        Story story2 = new Story(202, "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", "NXB Trẻ", 3, 45000);
        Story story3 = new Story(203, "Harry Potter and the Half-Blood Prince", "J.K. Rowling", "Bloomsbury PLC", 3, 270000);

        Journal journal1 = new Journal(301, "Thế giới Vi Tính số 256", "-", "PC World Việt Nam", 20000, 1, new Date(14, 2, 2014));
        Journal journal2 = new Journal(302, "Nhịp cầu đầu tư số 387", "-", "MTV Ấn Phẩm", 15000, 1, new Date(20, 6, 2014));

        Customers reader1 = new Customers("Nguyen Tuan", "tuanng@gmail.com");
        reader1.addRentItem(new RentItem(book1, 4));
        reader1.addRentItem(new RentItem(journal1, 3));

        Customers reader2 = new Customers("Le Phuong Lan", "lanphuong@gmail.com");
        reader2.addRentItem(new RentItem(book2, 10));
        reader2.addRentItem(new RentItem(story2, 3));
        reader2.addRentItem(new RentItem(story3, 3));

        reader1.displayInfo();
        System.out.println();
        reader2.displayInfo();
    }
}
	
