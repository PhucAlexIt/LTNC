package Bai6_1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ColorButton extends JFrame{
	JButton jb1 = new JButton("RED");
	JButton jb2 = new JButton("GREEN");
	JButton jb3 = new JButton("BLUE");
	JTextField jtx = new JTextField();
	
	public ColorButton() {
		this.getContentPane().setLayout(new FlowLayout());
		jtx.setColumns(10);
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jtx);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.RED);
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.GREEN);
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.BLUE);
				
			}
		});
		Map <String, Color> colors = new HashMap<String, Color>();{
			colors.put("red", Color.RED);
			colors.put("blue", Color.BLUE);
			colors.put("yellow", Color.YELLOW);
			colors.put("pink", Color.PINK);

			
		}
		jtx.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textColor = jtx.getText().toLowerCase();
				getContentPane().setBackground(colors.get(textColor));
				
			}
		});
		

		}
	public static void main(String[] args) {
		ColorButton cb = new ColorButton();
		cb.setTitle("Lab1");
		cb.setSize(400, 500);
		cb.setVisible(true);
	}
			
	
}
