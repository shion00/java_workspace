package day1110.network.echo;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EchoClient extends JFrame {
	JPanel p_north;
	JPanel p_center;
	Choice ch_ip;
	JTextField t_port;
	JButton bt_conn;
	JTextArea area;
	JScrollPane scroll;
	JTextField t_msg;
	JButton bt_send;

	Socket socket;
	BufferedWriter buffw;
	BufferedReader buffr;

	public EchoClient() {
		p_north = new JPanel();
		p_center = new JPanel();
		ch_ip = new Choice();
		t_port = new JTextField("7777", 10);
		bt_conn = new JButton("접속");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		t_msg = new JTextField(15);
		bt_send = new JButton("send");

		p_north.add(ch_ip);
		ch_ip.add("localhost");
		p_north.add(t_port);
		p_north.add(bt_conn);
		add(p_north, BorderLayout.NORTH);
		add(scroll);

		add(p_center, BorderLayout.SOUTH);
		p_center.add(t_msg);
		p_center.add(bt_send);
		
		bt_conn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connect();
			}
		});
		
		bt_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				send();
			}
		});
		


		setVisible(true);
		setBounds(900, 400, 300, 400);

	}
	
	public void connect() {
		try {
			socket=new Socket(ch_ip.getSelectedItem(),Integer.parseInt(t_port.getText()));
			area.append("서버에 접속\n");
			
			buffw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			buffr=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void send() {
		try {
			buffw.write(t_msg.getText()+"\n");
			buffw.flush();
			listen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void listen() {
		String msg=null;
		try {
				msg=buffr.readLine();
				area.append(msg+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new EchoClient();
	}

}




















