package bai5_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Library {

	//a) Biểu diễn dữ liệu ấn phẩm, độc giả, danh sách ấn phẩm, mục mượn ấn phẩm và danh sách các mục mượn ấn phẩm. Viết testcase tạo các dữ liệu như ví dụ. 
	@Test
	void testApp() {
		Story story1 = new Story(201, "Doremon", "Fujiko. F. Fujio", "NXB Kim Đồng", 3, 20000);
        Customers reader1 = new Customers("Nguyen Tuan", "tuanng@gmail.com");
        reader1.addRentItem(new RentItem(story1, 4));

		assertEquals("Nguyen Tuan", reader1.getName());
		assertEquals("Doremon", reader1.getRentItems().get(0).getItem().getTitle());
		assertEquals("tuanng@gmail.com", reader1.getEmail());
		assertEquals(3, reader1.getRentItems().get(0).getItem().getMaxRentedDays());

	}
	//b) Viết phương thức getType xác định tên của loại ấn phẩm 
	@Test
	void testType() {
        ReferenceBook book2 = new ReferenceBook(102, "Nhạc lý căn bản và nâng cao", "Lương Bằng Vinh", "NXB Thị Nghè", 7, 30000, "Nhạc");
        Story story2 = new Story(202, "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", "NXB Trẻ", 3, 45000);
        Journal journal2 = new Journal(302, "Nhịp cầu đầu tư số 387", "-", "MTV Ấn Phẩm", 15, 1, new Date(20, 6, 2014));

		assertEquals("Reference Book", book2.getType());
		assertEquals("Journal", journal2.getType());
		assertEquals("Story", story2.getType());

	}
	// c) Viết phương thức isAuthor xác định xem một ấn phẩm có phải do một tác giả có tên cho trước viết không.
	@Test
	void testNameAuthor() {
		 ReferenceBook book2 = new ReferenceBook(102, "Nhạc lý căn bản và nâng cao", "Lương Bằng Vinh", "NXB Thị Nghè", 7, 30000, "Nhạc");
	        Story story2 = new Story(202, "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", "NXB Trẻ", 3, 45000);
	        Journal journal2 = new Journal(302, "Nhịp cầu đầu tư số 387", "-", "MTV Ấn Phẩm", 15, 1, new Date(20, 6, 2014));
	        
	        assertTrue(book2.isAuthor("Lương Bằng Vinh"));
	        assertTrue(story2.isAuthor("Nguyễn Nhật Ánh"));
	        assertFalse(journal2.isAuthor("Châu Bùi"));

	}
	//e) Tính giá đền một ấn phẩm khi độc giả làm mất ấn phẩm được cho mượn, biết rằng, với: 
			// Tạp chí, Giá đền ấn phẩm = 0.8 * Giá nhập. - 
			// Sách tham khảo hoặc Truyện, Giá đền ấn phẩm = Giá nhập * 1.2 

	@Test
	void testCalulate() {
		 ReferenceBook book2 = new ReferenceBook(102, "Nhạc lý căn bản và nâng cao", "Lương Bằng Vinh", "NXB Thị Nghè", 7, 30000, "Nhạc");
	        Story story2 = new Story(202, "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", "NXB Trẻ", 3, 45000);
	        Journal journal2 = new Journal(302, "Nhịp cầu đầu tư số 387", "-", "MTV Ấn Phẩm", 15, 15000, new Date(20, 6, 2014));
	        assertEquals(36000, book2.calculate());
	        assertEquals(54000, story2.calculate()); 
	        assertEquals(12000, journal2.calculate());
	}
}
