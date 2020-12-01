package day1111.board;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class BoardList extends JPanel{
	JTable table;
	JButton bt;
	JScrollPane scroll;
	
	public BoardList() {
		table=new JTable();
		scroll=new JScrollPane(table);
		bt=new JButton("글등록");
		
		setLayout(new BorderLayout());
		add(bt,BorderLayout.SOUTH);
		add(scroll);
		
		setVisible(true);
		setPreferredSize(new Dimension(780,500));
	}
	
	
}
