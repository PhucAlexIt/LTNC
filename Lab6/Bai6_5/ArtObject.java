package Bai6_5;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ArtObject extends JFrame {
	public ArtObject(String title) {
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		// Tiêu đề
		JLabel jlTitle = new JLabel("QUẢN LÝ TÁC PHẨM HỘI HOẠ");
		jlTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		jlTitle.setPreferredSize(new Dimension(169,50));
		this.add(jlTitle);
		
		//row 1
		JPanel jp1 = new JPanel();
		JLabel jl1 =new JLabel("Tên Tác phẩm: ");
		jl1.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextField fillForm = new JTextField();
		fillForm.setPreferredSize(new Dimension(200,25));
		jp1.add(jl1);
		jp1.add(fillForm);
		this.add(jp1);

		
	// row 2
		JPanel jp2 = new JPanel();
		JLabel jl2 = new JLabel("Năm sáng tác: ");
		jl2.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextField fill = new JTextField();
		fill.setPreferredSize(new Dimension(200,25));
		jp2.add(jl2);
		jp2.add(fill);
		this.add(jp2);
	
	// row 3
		JPanel jp3 = new JPanel();
		JLabel jl3 = new JLabel("Loại tranh: ");
		jl3.setHorizontalAlignment(SwingConstants.RIGHT);
		String addPaints[] = {"Sơn dầu","Sơn mài","Gốm","Đơn sắc","Men","Thủy mặc"}; 
		JComboBox<String> jcob1 = new JComboBox<String>(addPaints);
		jcob1.setPreferredSize(new Dimension(200,25));
		jp3.add(jl3);
		jp3.add(jcob1);
		this.add(jp3);
	// row 4
		JPanel jp4 = new JPanel();
		JLabel jl4 = new JLabel("Phong cách: ");
		jl4.setHorizontalAlignment(SwingConstants.RIGHT);
		String addStyle[] = {"Không rõ", "Cổ điển", "Hiện đại"};
		JComboBox<String> jcob2 = new JComboBox<String>(addStyle);
		jcob2.setPreferredSize(new Dimension(200,25));
		jp4.add(jl4);
		jp4.add(jcob2);
		this.add(jp4);
	// row 5
		JPanel jp5 = new JPanel();
		JLabel jl5 = new JLabel("Tác giả: ");
		String [] author = {"Bùi Xuân Phái", "Fernando Botero",
				"Leonardo Da Vinci", "Picasso", "Vincent Vangogh"};
		JComboBox<String> jcob3 = new JComboBox<String>(author);
		jcob3.setPreferredSize(new Dimension(200,25));
		jp5.add(jl5);
		jp5.add(jcob3);
		this.add(jp5);
 // row 6
		JPanel jp6 = new JPanel();
		JButton jb1 = new JButton("Thêm");
		JButton jb2 = new JButton("Sắp xếp");
		jp6.add(jb1);
		jp6.add(jb2);
		this.add(jp6);
		
	}
	
	
	public static void main(String[] args) {
		ArtObject art = new ArtObject("Art Management");
		art.setVisible(true);
		art.pack();
	
	}

}
