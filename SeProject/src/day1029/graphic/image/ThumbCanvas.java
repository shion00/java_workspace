package day1029.graphic.image;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

//
public class ThumbCanvas extends Canvas implements MouseListener{
	Toolkit kit;
	Image img;
	DetailPanel p_center;//null
	
	public ThumbCanvas(String path, DetailPanel p_center) {
		kit=Toolkit.getDefaultToolkit();//
		img=kit.getImage(path);
		this.setPreferredSize(new Dimension(100,100));
		this.p_center=p_center;
		
		this.addMouseListener(this);//마우스 리스너와 연결
		
	}
	
	//
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		//p_center 패널에, 이미지를 그리되, 현재 나의 이미지를 가지고
		p_center.setImg(img);//p_center 에게 나의 img를 전달해야 한다!!
		p_center.repaint();//다시 그려라-->update()화면지우기-->paint()
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	
		
}
