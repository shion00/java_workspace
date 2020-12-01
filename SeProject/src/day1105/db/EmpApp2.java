package day1105.db;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.mysql.jdbc.PreparedStatement;

public class EmpApp2 extends JFrame{
	JButton bt_connect, bt_load;
	JTextArea area;
	JScrollPane scroll;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String url="jdbc:mariadb://localhost/db1105";
	String user="root";
	String password="";
	
	public EmpApp2() {
		area=new JTextArea();
		scroll=new JScrollPane(area);
		bt_connect=new JButton("Connect");
		bt_load=new JButton("Load");
		
		add(bt_connect);
		add(bt_load);
		add(scroll);
		
		bt_connect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connect();
			}
		});
		
		bt_load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				load();
			}
		});
		

		area.setPreferredSize(new Dimension(780,500));
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(800,600);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void connect() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void load() {
		
	}
	
	
	
	
	public static void main(String[] args) {
		new EmpApp2();
	}
}
