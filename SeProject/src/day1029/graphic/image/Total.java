package day1029.graphic.image;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Total extends JFrame{
	JLabel title;
	JButton bt_next;
	JButton bt_prev;
	JPanel p_south;
	JPanel p_west;
	ThumbImage p_ci;
	String dir="C:/Users/MASTER/eclipse-workspace/SeProject/res/travel2/";
	String[] src= {"aa.jpg","ab.jpg","ax.jpg","bm.jpg","et.jpg","kg.jpg","mx.jpg","pk.jpg","ub.jpg","ya.jpg"};
	ThumbImage[] thumb=new ThumbImage[src.length];
	
	public Total() {
		title=new JLabel("ㄹㄹㄹㄹㄹㄹㄹ");
		bt_next=new JButton("▶");
		bt_prev=new JButton("◀");
		p_south=new JPanel();
		p_west=new JPanel();
		for(int i=0;i<thumb.length;i++) {
			thumb[i]=new ThumbImage(dir+src[i]);
			p_west.add(thumb[i]);
		}
		
		p_south.add(bt_prev);
		p_south.add(bt_next);
		
		add(title,BorderLayout.NORTH);
		add(p_south,BorderLayout.SOUTH);
		add(p_west,BorderLayout.WEST);
		p_west.setPreferredSize(new Dimension(100,770));
		
		
		setSize(800, 770);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
	}
	
	public static void main(String[] args) {
		new Total();
	}
	
	
	
}
