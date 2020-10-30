package day1029.graphic.image;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

//상세이미지가 그려질 패널, 이 패널을 클래스로 별도로 정의 
//
public class DetailPanel extends JPanel{
	private Image img;
	
	//이
	public void setImg(Image img) {
		this.img = img;
		this.img=this.img.getScaledInstance(770, 500, Image.SCALE_SMOOTH);
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
}
