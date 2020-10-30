package day1029.collection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonCollection extends JFrame implements ActionListener{
	JPanel p_north,p_center;
	JButton bt_create,bt_bg;
	//배열은 크기를 정해야 하기 때문에 크기를 알 수 없는 프로그램에선 사용에 제한이 있다.
	//JButton[] btn=new JButton[10000];//배열의 가장 큰 특징, 배열은 생성시 반드시 크기를 명시해야 한다!
	ArrayList<JButton> btn=new ArrayList<JButton>();
	
	public ButtonCollection() {
		//생성
		p_north=new JPanel();
		p_center=new JPanel();
		bt_create=new JButton("버튼생성");
		bt_bg=new JButton("배경색");
		
		p_north.add(bt_create);
		p_north.add(bt_bg);

		//프레임에 부착
		add(p_north,BorderLayout.NORTH);
		add(p_center);
		
		//버튼과 리스너 연결
		bt_create.addActionListener(this);
		bt_bg.addActionListener(this);
		
		
		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();//이벤트를 일으킨 컴포넌트를 반환!
		
		if(bt_create==obj) {
			create();
		}else if(obj.equals(bt_bg)){
			setBg();
		}
		
//		for(int i=0;i<btn.size();i++) {
//			 if(obj==btn.get(i)) {
//				 btn.get(i).setBackground(Color.GREEN);
//			}
//		}
		
	}
	
	//버튼 생성 메서드
	public void create() {
		JButton bt=new CustomButton();//커스텀화한 버튼을 생성
		p_center.add(bt);
		
		btn.add(bt);//btn 리스트에 추가하기!! js의 push() 메서드와 같다!!
		//System.out.println("현재까지 누적된 리스트의 수는 "+btn.size());
		bt.setText("버튼"+Integer.toString(btn.size()));//wrapper 클래스를 사용하여 숫자를 String 으로 형변환
		
		//p_center에 버튼을 그린게 아니라, 버튼을 추가한것이다. 그린것 repaint() 와 구별필요
		//따라서 이때는 p_center를 갱신하면 된다! updateUI
		p_center.updateUI();
		
		
		//문제 : 생성한 버튼 중 내가 클릭한 버튼의 배경색을 바꿔라
		//내접근: 배열과 반복문을 이용하여 모든 버튼에 액션리스너를 붙이고, 반복문과 조건문으로 내가 선택한 버튼이 맞다면 색을 바꾸는 방법으로 접근하였다.
		//선생님: 리스너가 붙고 액션발생시 색이 녹색인 커스텀화한 버튼 클래스를  작성한후, 기존 클래스 버튼을 커스텀화버튼으로 생성하였다. 
//		for(int i=0;i<btn.size();i++) {
//			btn.get(i).addActionListener(this);
//		}
		
	}
	
	//배경색 한꺼번에 바꾸는 메서드
	public void setBg() {
		//btn 리스트에 들어있는 모든 요소들 대상으로 배경색 바꾸기!
		//ArrayList 는 순서있는 집합이므로, for문을 사용할 수 있다.
		for(int i=0;i<btn.size();i++) {
			JButton bt=btn.get(i);
			bt.setBackground(Color.YELLOW);
			
		}
		
	}
	
	
	
	 public static void main(String[] args) {
		new ButtonCollection();
	}


}


















