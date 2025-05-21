package Bai6_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ClockProgram extends JFrame {
	JLabel jl;
	public ClockProgram(){
		setTitle("Clock");
		setSize(300, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		jl = new JLabel();
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		Timer time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {	
			@Override
			public void run() {
			updateTime();		
			}
			
		}, 0, 1000);
		
		
		add(jl);

	}
	private void updateTime() {
		SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
		String timeString = formatTime.format(new Date());
		jl.setText(timeString);
	}
	public static void main(String[] args) {
		 new ClockProgram();
	}

}
