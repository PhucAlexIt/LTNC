package Bai6_6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NestedLayout extends JPanel{
	private JTextField fieldtxt;
	private JTextArea txtArea;
	private JButton bSave, bOk, bExit;
	public NestedLayout(String title) {
		this.setLayout(new BorderLayout(2,2));
		txtArea = new JTextArea(12,40);
		bSave = new JButton("Save as");
		bOk = new JButton("OK");
		bExit = new JButton("Exit");
		fieldtxt = new JTextField("C:\\Doc.txt");
		this.add(txtArea, BorderLayout.CENTER);
		
		JPanel bottomLevel = new JPanel();
		bottomLevel.setLayout(new GridLayout(2,1));
		
		JPanel subPal = new JPanel();
		subPal.setLayout(new BorderLayout());
		subPal.add(bSave, BorderLayout.WEST);
		subPal.add(fieldtxt,BorderLayout.CENTER);
		
		JPanel subPal2 = new JPanel();
		subPal2.setLayout(new FlowLayout(FlowLayout.RIGHT,2,2));
		subPal2.add(bOk);
		subPal2.add(bExit);
		bottomLevel.add(subPal);
		bottomLevel.add(subPal2);
		this.add(bottomLevel,BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setContentPane(new NestedLayout("TestDemo"));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
}
