package day1028.graphic.line;

import java.awt.Canvas;
import java.awt.Graphics;

public class YCanvas extends Canvas{
	int x1,y1,x2,y2;
	
	public YCanvas(LineMaker LineMaker) {
		this.x1=LineMaker.x1;
		this.y1=LineMaker.y1;
		this.x2=LineMaker.x2;
		this.y2=LineMaker.y2;
	}
	
	
	private void paint(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
	}
	
}
