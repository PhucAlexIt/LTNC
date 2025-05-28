package Bai6_7;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuLookDemo {
	public static void main(String[] args) {
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu jm1 = new JMenu("A menu");
		JMenuItem ji1 = new JMenuItem("A text-only menu item");
		jm1.add(ji1);
		menuBar.add(jm1);
		
		JFrame jf = new JFrame("MenuLook Demo");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300,400);
		jf.setJMenuBar(menuBar);
		jf.setVisible(true);
		
		
	}
}
