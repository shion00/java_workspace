package day1103.thread;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class ProgressApp extends JFrame{
	JLabel la;
	JProgressBar bar1,bar2,bar3;
	BarThread thread,thread2,thread3;
	
	public ProgressApp() {
		//생성
		la=new JLabel("0",SwingConstants.CENTER);
		bar1=new JProgressBar();
		bar2=new JProgressBar();
		bar3=new JProgressBar();
		
		thread=new BarThread(bar1, 100);
		thread2=new BarThread(bar2, 150);
		thread3=new BarThread( bar3, 200);
		
		//쓰레드 동작
		thread.start();
		thread2.start();
		thread3.start();
		
		
		//스타일 적용
		setLayout(new FlowLayout());
		la.setPreferredSize(new Dimension(500,150));
		la.setFont(new Font("Verdana",Font.BOLD|Font.ITALIC,90));
		bar1.setPreferredSize(new Dimension(500,70));
		bar2.setPreferredSize(new Dimension(500,70));
		bar3.setPreferredSize(new Dimension(500,70));
		
		//부착
		add(la);
		add(bar1);
		add(bar2);
		add(bar3);
		
		
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		new ProgressApp();
	}
	
	
}



