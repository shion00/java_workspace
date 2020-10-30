package day1028.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient2 extends JFrame implements KeyListener{
							  /*is a                    is a*/
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;
	JPanel p_south;
	JButton bt;
	ChatClient ch;//null
	
	
	public ChatClient2(ChatClient ch) {
		this.ch=ch;
		
		//생성
		area=new JTextArea();
		scroll=new JScrollPane(area);
		p_south=new JPanel();
		t_input=new JTextField(15);
		bt=new JButton("send");
		
		this.area=area;
		this.t_input=t_input;
		
		//패널 조립(패널은 디폴트가 FlowLayout 이다.)
		p_south.add(t_input);
		p_south.add(bt);
		
		add(scroll);//센터에 스크롤 부착
		add(p_south,BorderLayout.SOUTH);//남쪽에 패널부착
		
		//스타일 적용
		area.setBackground(Color.GREEN);
		t_input.setBackground(Color.BLUE);
		t_input.setForeground(Color.WHITE);
		bt.setBackground(Color.BLACK);
		bt.setForeground(Color.WHITE);
		
		t_input.setPreferredSize(new Dimension(285,30));
		
		//보여주기 전에 미리 연결해놓자(컴포넌트와 리스너 연결)
		t_input.addKeyListener(this);//프레임이 곧 리스너다!!
		
		//setSize(300,400);
		setBounds(500,150,300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	//@은 어노테이션이다. java 5 부터 지원되는 일종의 주석.
	//일반적인 주석은 프로그램에 관여하지 않지만, 어노테이션은 프로그래밍에서 어떤 표시를 하기 위함이다.
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent e) {
		//엔터키를 누르면, area 에 입력 데이터를 반영하자~!(누적시키자)
		int key=e.getKeyCode();//키코드 값 반환
		
		if(key==10) {//엔터 치면
			send();
		}
	}
	
	public void send() {
		//나에 대한 처리
		String msg=t_input.getText();//텍스트필드 값을 구하자!!
		area.append(msg+"\n");
		t_input.setText("");//빈텍스트로 초기화
		
		//너에 대한 처리
		ch.area.append(msg+"\n");


	}




}
