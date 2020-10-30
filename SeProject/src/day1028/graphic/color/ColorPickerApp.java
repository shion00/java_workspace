package day1028.graphic.color;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPickerApp extends JFrame {
	JPanel wp_up;
	JPanel wp_center;
	JPanel[] arrayp=new JPanel[7];
	Canvas can;
	
	//생성자 메서드
	public ColorPickerApp() {
		//생성
		wp_up=new JPanel();
		wp_center=new JPanel();
		can=new Canvas();
		
		for(int i=0;i<arrayp.length;i++) {
			arrayp[i]=new JPanel();			
			wp_up.add(arrayp[i]);
			arrayp[i].setPreferredSize(new Dimension(100,100));
		}
		
		
		//부치기
		add(wp_up,BorderLayout.NORTH);
		add(wp_center);
		
		//
		arrayp[0].setBackground(Color.RED);
		arrayp[1].setBackground(Color.ORANGE);
		arrayp[2].setBackground(Color.YELLOW);
		arrayp[3].setBackground(Color.GREEN);
		arrayp[4].setBackground(Color.BLUE);
		arrayp[5].setBackground(Color.PINK);
		arrayp[6].setBackground(Color.BLACK);
		
		
		//
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		for(int i=0;i<arrayp.length;i++) {
			if(obj==arrayp[i]) {
				System.out.println("akwd");
			}
		}
	}
	
	//main 메서드
	public static void main(String[] args) {
		new ColorPickerApp();
	}
	
}
