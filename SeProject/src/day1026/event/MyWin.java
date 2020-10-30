package day1026.event;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class MyWin extends Frame{
	Button bt;
	TextField t;
	Choice ch;
	
	public MyWin() {
		//생성
		bt=new Button("나 눌러봐");
		t=new TextField(15);
		ch=new Choice();
		
		//ch의 아이템 채우기
		ch.add("Java Programming");
		ch.add("JSP Programming");
		ch.add("Android Programming");
		ch.add("Spring Programming");
		ch.add("Mybatis Programming");
		
		//윈도우에 부착
		add(bt);
		add(t);
		add(ch);
		
		// setLayout을 FlowLayout 으로 변경 
		setLayout(new FlowLayout());
		
		//리스너 연결
		bt.addActionListener(new MyListener());//버튼과 클릭 리스너 연결!!
		t.addKeyListener(new MyKey());//텍스트박스와 키 리스너 연결
		this.addMouseListener(new MyMouse());//프레임과 마우스 리스너 연결!!!, 주체가 누구인가? 중요!
		ch.addItemListener(new MyItem());//초이스와 리스너 연결
		addWindowListener(new MyWindowListener());//프레임과 리스너 연결, this. 생략가능

		this.setVisible(true);
		this.setSize(300,400);

	}
	public static void main(String[] args) {
		new MyWin();
	}
	
	
	
}
