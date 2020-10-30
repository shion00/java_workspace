/*awt 문제점 os 마다- > swing
//멀티라인 주석 : ctrl + shift + /(슬레시)
//멀티라인 주석 해젝 : ctrl + shift + \(역슬레시)
//싱글라인 주석 설정및해제: ctrl + /(슬레시)
//AWT 는 플랫폼(os)에 따라 디자인이 다르게 표현되는 문제가 있기에, AWT를 개선한 API인 Swing을 사용해본다.
//Swing은 새롭게 배울필요
//swing은 접두어 j 가 붙는다.
//AWT가 완전히 불필요한 패키지가 아니다.
AWT 패키지의 event 와 비치관리자는 여전히 AWT 를 이용한다.
*/

package day1027.gui;

import java.awt.Checkbox;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class SwingTest extends JFrame{
	JCheckBox ch;
	JButton bt;
	
	public SwingTest() {
		ch=new JCheckBox("영화");
		bt=new JButton("나버튼");
		setLayout(new FlowLayout());
		add(ch);
		add(bt);
		setVisible(true);
		setSize(300,400);
		
		//Swing 의 프레임은 닫기 버튼을 누르면, 화면에서 안보이게 되는데,
		//이때, 프로그램이 종료괸 것이 아니라 단지
		//
		//윈도우 창 닫으면 프로세스도 함께 종료시킴
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingTest();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
