package day1111.json;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonGallery extends JFrame{
	JPanel p_south,p_center,p_can,p_detail;
	BufferedReader buffr;
	JScrollPane scroll;
	Image big;
	public static final int WIDTH=80;
	public static final int HEIGHT=80;
	
	Label[] laArray=new Label[4];
	
	public JsonGallery() {
		p_center=new JPanel();
		p_south=new JPanel();
		p_can=new JPanel() {
			public void paint(Graphics g) {
				g.drawImage(big, 0, 0, p_can);
			}
		};
		p_detail=new JPanel();
		scroll=new JScrollPane(p_south);
		
		for(int i=0;i<laArray.length;i++) {
			laArray[i]=new Label();
			
			laArray[i].setPreferredSize(new Dimension(380,50));
			laArray[i].setFont(new Font("Verdana", Font.BOLD, 28));
			p_detail.add(laArray[i]);
		}
		
		add(p_center);
		add(scroll,BorderLayout.SOUTH);
		p_center.setLayout(new GridLayout(1,2));
		p_center.add(p_can);
		p_center.add(p_detail);
		
		scroll.setPreferredSize(new Dimension(800,100));
		
		setVisible(true);
		setSize(800, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		createThumb();
	}
	
	public void createThumb() {
		try {
			URL url=this.getClass().getClassLoader().getResource("res/data.json");
			URI uri= url.toURI();
			FileReader reader=new FileReader(new File(uri));
			buffr=new BufferedReader(reader);
			String data=null;
			StringBuffer sb=new StringBuffer();
			while(true) {
				data=buffr.readLine();
				if(data==null)break;
				sb.append(data);
			}
			System.out.println(sb.toString());
			
			JSONParser jsonParser=new JSONParser();
			JSONObject jSONObject=(JSONObject)jsonParser.parse(sb.toString());
			JSONArray jsonArray=(JSONArray)jSONObject.get("marvel");
			
			for(int i=0;i<jsonArray.size();i++) {
				JSONObject obj=(JSONObject)jsonArray.get(i);
				
				String path=(String)obj.get("url");	
				String title=(String)obj.get("title");
				String phase=(String)obj.get("phase");
				String category_name=(String)obj.get("category_name");
				String release_year=((Long)obj.get("release_year")).toString();
				
				Thumbnail thumbnail=new Thumbnail(this,path,WIDTH,HEIGHT,title,phase,category_name,release_year);
				p_south.add(thumbnail);
			}
			
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public void getDetail(Image big,String title,String phase,String category_name,String release_year) {
		this.big=big;
		p_can.repaint();
		
		laArray[0].setText("Title : "+title);
		laArray[1].setText("Phase : "+phase);
		laArray[2].setText("Category_name : "+category_name);
		laArray[3].setText("Release_year : "+release_year);
	}

	
	public static void main(String[] args) {
		new JsonGallery();
	}

}




















