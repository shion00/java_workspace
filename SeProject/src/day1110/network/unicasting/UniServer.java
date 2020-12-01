package day1110.network.unicasting;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UniServer extends JFrame{
	JPanel p_north;
	JLabel la;
	JTextField t_port;
	JButton bt_server;
	JTextArea area;
	JScrollPane scroll;
	
	int port=7878;
	Socket socket;

	public UniServer() {
		super("Server");
		p_north=new JPanel();
		t_port=new JTextField(Integer.toString(port),10);
		la=new JLabel("Port");
		bt_server=new JButton("서버가동");
		area=new JTextArea();
		scroll=new JScrollPane(area);
		
		p_north.add(la);
		p_north.add(t_port);
		p_north.add(bt_server);
		
		add(p_north,BorderLayout.NORTH);
		add(scroll);
		
		bt_server.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  Thread	thread=new Thread() {
				public void run() {
					startServer();
				}
			  };
			  thread.start();
			}
		});
		
		setVisible(true);
		setBounds(600,400,300,400);
	}
	

	
	public void startServer() {
		try {
			ServerSocket server=new ServerSocket(Integer.parseInt(t_port.getText()));
			area.append("서버 준비\n");
			while(true) {
				socket=server.accept();
				area.append("접속자 발견\n");
				
				MessageThread messageThread=new MessageThread(this);
				messageThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new UniServer();
	}

}


















