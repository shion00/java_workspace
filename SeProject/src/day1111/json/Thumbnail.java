package day1111.json;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Thumbnail extends JPanel implements Runnable{
	Image img;
	Image big;
	String path;
	BufferedImage buffrImg;
	JsonGallery jsonGallery;
	int width;
	int height;
	
	Thread thread;
	
	public Thumbnail(JsonGallery jsonGallery, String path,int width,int height, String title,String phase,String category_name,String release_year) {
		this.jsonGallery=jsonGallery;
		this.path=path;
		this.width=width;
		this.height=height;
		
		setPreferredSize(new Dimension(width,height));
		
		thread=new Thread(this);//Runnable 을 구현한 객체를 인수로 넣어준다
		thread.start();//생성과 동시에 쓰레드 동작
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				jsonGallery.getDetail(big,title,phase,category_name,release_year);
			}
		});
		
	}
	
	public void run() {
		try {
			URL url=new URL(path);
			buffrImg=ImageIO.read(url);
			big=buffrImg.getScaledInstance(400, 550, Image.SCALE_SMOOTH);
			img=buffrImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			jsonGallery.p_south.updateUI();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("이미지를 찾을 수 없습니다.!!");
			getErrorImage();
		}
	}
	
	public void getErrorImage() {
		URL url=this.getClass().getClassLoader().getSystemResource("res/error.png");
		try {
			buffrImg=ImageIO.read(url);
			img=buffrImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}


		
	



	
}
