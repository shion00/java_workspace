package day1030.album;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

//썸네일 하나를 정의한다!!
public class Thumb extends JPanel implements MouseListener{
	Toolkit kit;//이미지가 추상클래서여서가 아니라, 플랫폼(os)에 의존적인 경로(D:)를 이용할 때 툴킷이 필요하다. 
	Image img;
	public static final int WIDTH=75;
	public static final int HEIGHT=55;
	GalleryApp galleryApp;//현재 null,
	
	public Thumb(String src,GalleryApp galleryApp) {
		this.galleryApp=galleryApp;//
		kit=Toolkit.getDefaultToolkit();
		img=kit.getImage(src);
		img=img.getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);//이미지 크기 조절
		
		setPreferredSize(new Dimension(WIDTH,HEIGHT));//상수로 대입하여 유지보수성을 높이자
		setBackground(Color.BLACK);
		
		//리스너와 연결
		this.addMouseListener(this);
		
		
	
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		//n을 지금 나의.index값으로..
		//현재 패널이 ArrayList 내에서의 몇번째 인덱스에 들어있는지 역추적하자!!
		galleryApp.n=galleryApp.list.indexOf(this);
		galleryApp.updateData();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}

	
	
}
