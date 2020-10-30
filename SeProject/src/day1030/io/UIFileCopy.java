package day1030.io;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UIFileCopy extends JFrame implements ActionListener{
	JLabel la_orl, la_dest;
	JTextField t_ori, t_dest;
	JButton bt;
	

	
	public UIFileCopy() {
		//생성
		la_orl=new JLabel("원본경로");
		la_dest=new JLabel("복사경로");
		t_ori=new JTextField(50);
		t_dest=new JTextField(50);
		bt=new JButton("복사실행");
		
		//스타일적용
		la_orl.setPreferredSize(new Dimension(150,30));
		la_dest.setPreferredSize(new Dimension(150,30));
		t_ori.setPreferredSize(new Dimension(500,30));
		t_dest.setPreferredSize(new Dimension(500,30));
		
		//조립
		setLayout(new FlowLayout());//
		add(la_orl);
		add(t_ori);
		add(la_dest);
		add(t_dest);
		add(bt);
		
		bt.addActionListener(this);//버튼과 리서너 연결
		
		//탐색창 띄우는 클래스와 그 메서드
		//JFileChooser chooser=new JFileChooser();
		//chooser.showOpenDialog(this);
		
		setSize(740,180);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //하면 안됨!! 스트림을 닫을 기회가 없기 때문
		//해결책) 윈도우창을 닫을때, 이벤트를 구현해야 한다. 즉 WindowListener 구현
	
	}
	
	public void copy() {
		//두개의 클래스가 메모리에 올라오는 시점은?
		//메서드의 내의 지역변수는 맴버변수가 아니므로 개발자가 초기화해야한다.!
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		String ori=t_ori.getText();
		String dest=t_dest.getText();
		
		try {
			fis=new FileInputStream(ori);//입력스트림 생성!!
			fos=new FileOutputStream(dest);//출력스트림 생성!!
			
			//읽고 내뱉자!
			int data;//읽혀진 데이터를 받을 변수
			while(true) {
				data=fis.read();
				if(data==-1)break;
				fos.write(data);
			}
			JOptionPane.showMessageDialog(this,"복사 완료!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		copy();
	}
	
	
	public static void main(String[] args) {
		new UIFileCopy();
	}
}




















