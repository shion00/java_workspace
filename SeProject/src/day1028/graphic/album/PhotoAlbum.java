package day1028.graphic.album;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PhotoAlbum extends JFrame implements ActionListener{
	AlbumPanel p;//paint메서드를 재정의하려면 클래스로 재정의해야한다. 일반패널 쓰면 안된다.
	
	JPanel p_south;//버튼 2개를 얹힐 패널 
	JButton bt_prev, bt_next;//이전, 다음 버튼
	
	public PhotoAlbum() {
		//생성
		p=new AlbumPanel();
		p.setBackground(Color.YELLOW);
		p_south=new JPanel();
		bt_prev=new JButton("이전 사진");
		bt_next=new JButton("다음 사진");
		
		//조립
		add(p);//중앙에 앨범패널
		p_south.add(bt_prev);//패널에 이전 버튼 넣기
		p_south.add(bt_next);//패널에 다음 버튼 넣기
		add(p_south,BorderLayout.SOUTH);//남쪽에 버튼패널 넣기
		
		//이전, 다음 버튼과 리스너 연결
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
		
		//JFrame 설정
		setSize(500, 450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();//이벤트를 일으킨 이벤트소스 구하기
		//이벤트소스란? 이벤트를 일으킨 컴포넌트를 의미~!!
		
		if(obj==bt_prev) {
			p.n--;//이전버튼이면 AlbumPanel.n을 감소
		}else if(obj==bt_next) {
			p.n++;//다음버튼이면 AlbumPanel.n을 증가
		}
		
		//화면 갱신( 직접 AlbumPanel의 paint()호출 불가)
		//갱신하도록 요청!!
		p.repaint();//다시 그려주세요 repaint()~->update()화면지우기->paint() 순으로 호출됨
		
	}
	
	public static void main(String[] args) {
		new PhotoAlbum();
	}
}






















