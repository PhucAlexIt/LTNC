package Bai6_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextColorChange extends JPanel {
	private JTextArea jta = new JTextArea();
	public TextColorChange() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(jta);
		JPanel jp1 = new JPanel();
		this.add(jp1);
		
		JButton jbClear = new JButton("Clear");
		jbClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jta.setText("");
			}
		});
		jp1.add(jbClear);
		
		JButton jbColor = new JButton("Color");
		jbColor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color color = JColorChooser.showDialog(TextColorChange.this, "Change color text", jta.getForeground());
				jta.setForeground(color);
				
			}
		});
		jp1.add(jbColor);
	}
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setContentPane(new TextColorChange());
		jf.setSize(300,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
