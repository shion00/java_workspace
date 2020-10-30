package day1028.graphic;

import java.awt.Canvas;
import java.awt.Graphics;

public class MyCanvas2 extends Canvas{
	int x1,x2,y1,y2;

	public MyCanvas2() {
	
	}
	
	public void paint(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
	
	}
	
	
}
