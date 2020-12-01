package day1105.db;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class EmpApp extends JFrame{
	JTextArea area;
	JScrollPane scroll;
	JButton bt_connect,bt_load;
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="user1104";
	String password="user1104";
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	public EmpApp() {
		super("내것");
		//
		area=new JTextArea();
		scroll=new JScrollPane(area);
		bt_connect=new JButton("Connect");
		bt_load=new JButton("Load");
		
		//
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
		
		//
		area.setPreferredSize(new Dimension(780,500));
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			area.append("드라이버 로드 성공\n");
			
			con=DriverManager.getConnection(url,user,password);
			if(con==null) {
				area.append("접속실패\n");
			}else {
				area.append("접속성공\n");
			}
	
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public void load() {
		String sql="select * from emp";
		
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if(con!=null) {
				try {
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new EmpApp();
	}

}
