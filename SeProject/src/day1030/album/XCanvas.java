package day1030.album;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class XCanvas extends Canvas{
	private Toolkit kit=Toolkit.getDefaultToolkit();
	private Image img;
	private String src;
	public static final int WIDTH=660;
	public static final int HIGHT=450;

	public XCanvas(String src) {
		img=kit.getImage(src);
		img=img.getScaledInstance(WIDTH, HIGHT, Image.SCALE_SMOOTH);
		setPreferredSize(new Dimension(WIDTH,HIGHT));
	}
	
	
	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		img=kit.getImage(src);
		img=img.getScaledInstance(WIDTH, HIGHT, Image.SCALE_SMOOTH);
		this.src = src;
	}


	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
		
}
