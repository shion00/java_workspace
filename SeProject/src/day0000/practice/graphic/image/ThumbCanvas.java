package day0000.practice.graphic.image;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class ThumbCanvas extends Canvas{
	Toolkit kit;
	Image img;
	
	
	public ThumbCanvas(String path) {
		kit=Toolkit.getDefaultToolkit();
		img=kit.getImage(path);
		setPreferredSize(new Dimension(100,100));
	}
	

}
