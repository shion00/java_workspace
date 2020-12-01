package day1030.album;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class GalleryApp extends JFrame implements ActionListener{
	JPanel p_west;
	JPanel p_center;
	JScrollPane scroll;
	JLabel la_name;//제목 나올 라벨
	XCanvas can;//센터에 크게 나올 이미지를 그릴 켄버스
	JPanel p_south;
	JButton bt_prev, bt_next;
	
	ArrayList<Thumb> list=new ArrayList<Thumb>();//썸네일 배열 선언,컬랙션 프레임웍 중 list 계열 중 arraylist 사용해보자
	String dir="D:/workspace/java_workspace/SeProject/res/travel2/";
	String[] src= {"aa.jpg","ab.jpg","ax.jpg","bm.jpg","et.jpg","kg.jpg","mx.jpg","pk.jpg","ub.jpg","ya.jpg"};
	
	int n=0;//배열의 index
	
	public GalleryApp() {
		super("자바캘러리");
		//생성
		p_west=new JPanel();
		p_center=new JPanel();
		scroll=new JScrollPane(p_west);//scroll이 먹는다
		la_name=new JLabel(src[n], SwingConstants.CENTER);//라벨센터
		can=new XCanvas(dir+src[n]);
		p_south=new JPanel();
		bt_prev=new JButton("이전");
		bt_next=new JButton("다음");
		
		
		//썸네일생성
		for(int i=0;i<src.length;i++) {
			Thumb thumb=null;
			list.add(thumb=new Thumb(dir+src[i],this));
			p_west.add(thumb);
		}
		
		//스타일
		la_name.setPreferredSize(new Dimension(700,50));
		la_name.setFont(new Font("Verdana", Font.BOLD, 25));
		
		p_west.setPreferredSize(new Dimension(100,600));
		p_center.setPreferredSize(new Dimension(700,600));
		p_west.setBackground(Color.YELLOW);
		p_center.setBackground(Color.GREEN);
		
		//조립
		p_south.add(bt_prev);
		p_south.add(bt_next);
		p_center.add(la_name);
		p_center.add(can);
		p_center.add(p_south);
		
		
		add(scroll,BorderLayout.WEST);//scroll이 잡아먹어서 크기때문에
		add(p_center);
		
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
		
		
		setLocationRelativeTo(null);//윈도우를 화면 중앙에 띄우는 법
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		updateData();
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();//
		if(obj==bt_prev) {
			prev();
		}else if(obj==bt_next){
			next();
		}
		updateData();
	}
	
	public void updateData() {//공통된 로직은 메서드로 빼줘서 유지보수성을 높인다.
		//그림은 XCanvas가 담당하므로, 그려질 img를 변경시켜주고, 다시 그리라고 하면 됨.
		can.setSrc(dir+src[n]);
		can.repaint();//update()->paint() 순으로 시스템에 의해 자동 호출 된다.
		
		//제목변경
		la_name.setText(src[n]+"("+(n+1)+"/"+src.length+")");
		System.out.println("현재 n"+n);
	}
	
	public void prev() {
		if(n>0) {
			n--;
		}else {
			JOptionPane.showMessageDialog(this, "처음 이미지입니다.");
		}
	}
	public void next() {
		//배열을 넘어서지 않는 범위내에서 ++허용
		if(n<src.length-1) {
			n++;
		}else {
			JOptionPane.showMessageDialog(this, "마지막 이미지입니다.");
		}
	}
	
	
	public static void main(String[] args) {
		new GalleryApp();
	}
	
	
}










