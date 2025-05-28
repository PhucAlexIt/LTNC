package Bai6_4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	public Calculator(String title) {
		this.setTitle(title);
		this.setSize(300,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JTextField jtx = new JTextField("0");
		jtx.setEditable(false);
		jtx.setPreferredSize(new Dimension(200,30));
		this.add(jtx, BorderLayout.NORTH);
		
		JPanel disBut = new JPanel();
		disBut.setLayout(new GridLayout(4,4,5,5));
		String [] buttons = {"1","2","3","+",
				"5","6","7","/",
				"8","9","0","*",
				"x",".","-","="};
		for (String but : buttons) {
			JButton jb = new JButton(but);
			disBut.add(jb);
		}
		this.add(disBut, BorderLayout.CENTER);
	}
		
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator("Calculator");
		cal.setVisible(true);
		
	}

}
