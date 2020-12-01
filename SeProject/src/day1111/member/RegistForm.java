package day1111.member;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistForm extends JPanel{
	JPanel p_container;//묶기위한 컨테이너
	JTextField t_id;
	JPasswordField t_pass;
	JTextField t_name;
	JButton bt;
	JButton bt_login;
	
	public RegistForm() {
		p_container=new JPanel();
		t_id=new JTextField(30);
		t_pass=new JPasswordField(30);
		t_name=new JTextField(30);
		bt=new JButton("가입");
		bt_login=new JButton("로그인하기");
		
		p_container.setBackground(Color.YELLOW);
		p_container.setPreferredSize(new Dimension(400,200));
		
		p_container.add(t_id);
		p_container.add(t_pass);
		p_container.add(t_name);
		p_container.add(bt);
		p_container.add(bt_login);
		
		add(p_container);
		setVisible(true);
		
	}
}
