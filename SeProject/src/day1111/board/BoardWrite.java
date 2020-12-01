package day1111.board;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BoardWrite extends JPanel{
	JTextField t_title,t_writer;
	JTextArea a_content;
	JScrollPane scroll;
	JButton b_regist,b_list;
	
	public BoardWrite() {
		t_title=new JTextField();
		t_writer=new JTextField();
		a_content=new JTextArea();
		scroll=new JScrollPane(a_content);
		b_regist=new JButton("삭제하기");
		b_list=new JButton("목록보기");
			
		// 스타일
		t_title.setPreferredSize(new Dimension(780, 35));
		t_writer.setPreferredSize(new Dimension(780, 35));
		scroll.setPreferredSize(new Dimension(780, 200));
		
		//조립
		add(t_title);
		add(t_writer);
		add(scroll);
		add(b_regist);
		add(b_list);
		
		setVisible(true);
		setPreferredSize(new Dimension(780, 500));
		
		
	}
	
		
		
}



















