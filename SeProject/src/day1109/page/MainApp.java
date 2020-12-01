package day1109.page;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainApp extends JFrame implements ActionListener{
	JPanel p_north,p_center;
	JButton[] bt=new JButton[4];
	String[] title= {"Home","Login","Member","Board"};
	JPanel[] pages=new JPanel[4];
	
	public MainApp() {
		p_north=new JPanel();
		p_center=new JPanel();
		pages[0]=new Home();
		pages[1]=new Login();
		pages[2]=new Member();
		pages[3]=new Board();
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton(title[i]);
			p_north.add(bt[i]);
			bt[i].addActionListener(this);
			p_center.add(pages[i]);
		};
		
		add(p_north,BorderLayout.NORTH);
		add(p_center);
		
		pages[0].setPreferredSize(new Dimension(580,480));
		pages[1].setPreferredSize(new Dimension(580,480));
		pages[2].setPreferredSize(new Dimension(580,480));
		pages[3].setPreferredSize(new Dimension(580,480));
		
		setVisible(true);
		setSize(600,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object object=e.getSource();
		
		if(object==bt[0]) {
			setPage(0);
		}else if(object==bt[1]) {
			setPage(1);
		}else if(object==bt[2]) {
			setPage(2);
		}else if(object==bt[3]) {
			setPage(3);
		}
	}
	
	public void setPage(int index) {
		for(int i=0;i<pages.length;i++) {
			if(i==index) {
				pages[i].setVisible(true);
			}else {
				pages[i].setVisible(false);
			}
		}
	}
	
	public static void main(String[] args) {
		new MainApp();
	}
}



















