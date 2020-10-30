package day1028.graphic.line;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LineMaker extends JFrame {
	JPanel p_north;
	JLabel la_x1, la_y1, la_x2, la_y2;
	JTextField t_x1, t_y1, t_x2, t_y2;
	JButton bt;
	YCanvas can;

	public LineMaker() {
		// 생성
		p_north = new JPanel();
		la_x1 = new JLabel("x1");
		la_y1 = new JLabel("y1");
		la_x2 = new JLabel("x2");
		la_y2 = new JLabel("y2");
		t_x1 = new JTextField(10);
		t_y1 = new JTextField(10);
		t_x2 = new JTextField(10);
		t_y2 = new JTextField(10);
		bt = new JButton("그리기");
		can = new YCanvas(this);

		// 붙치기
		add(p_north, BorderLayout.NORTH);
		add(can);
		p_north.add(la_x1);
		p_north.add(t_x1);
		p_north.add(la_y1);
		p_north.add(t_y1);
		p_north.add(la_x2);
		p_north.add(t_x2);
		p_north.add(la_y2);
		p_north.add(t_y2);
		p_north.add(bt);
		
		
		//리스너 부착
		bt.addActionListener(this);

		can.setBackground(Color.YELLOW);

		setSize(700, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


	public static void main(String[] args) {
		new LineMaker();
	}
}















