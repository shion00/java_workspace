package day1028.graphic.color;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPickerApp1 extends JFrame{
	JPanel p_north;
	JPanel P_center;
	ThumbPanel[] thumb=new ThumbPanel[7];
	//7가지 색상을 배열로 보유하자(반복문마다 틀린 색을 )
	Color[] colorArray= {
		Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,Color.CYAN,Color.PINK,
	};
	
	public ColorPickerApp1() {
		p_north=new JPanel();
		P_center=new JPanel();
		
		for(int i=0;i<thumb.length;i++) {
			thumb[i]=new ThumbPanel(P_center,colorArray[i]);
			p_north.add(thumb[i]);
		}
	
		
		P_center.setBackground(Color.WHITE);
		
		
		add(p_north,BorderLayout.NORTH);//p_north 를 프레임의 북쪽에 부착!
		add(P_center);//
		
		
		setSize(770,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	public static void main(String[] args) {
		new ColorPickerApp1();
	}
}
