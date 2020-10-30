package day0000.practice.graphic.image;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePickerApp extends JFrame{
	JPanel p_north,p_center;
	ThumbCanvas can;
	
	
	public ImagePickerApp() {
		//생성
		p_north=new JPanel();
		p_center=new JPanel();
		can=new ThumbCanvas(null);
				
		
		
		//
		add(p_north,BorderLayout.NORTH);
		add(p_center);
		
		
	
		//
		setSize(770, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new ImagePickerApp();
	}
}
