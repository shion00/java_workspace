package day1029.graphic.image;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class ThumbImage extends JPanel{
	Image img;
	Toolkit kit;
	
	public ThumbImage(String path) {
		kit=Toolkit.getDefaultToolkit();
		img=kit.getImage(path);
		setPreferredSize(new Dimension(100,100));
	
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
}
