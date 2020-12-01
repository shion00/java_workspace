package day1111.member;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel {
	JPanel p_container;
	JTextField t_id;
	JPasswordField t_pass;
	JButton bt_regist, bt_login;

	public Login() {
		p_container = new JPanel();
		t_id = new JTextField(30);
		t_pass = new JPasswordField(30);
		bt_regist = new JButton("회원가입");
		bt_login = new JButton("로그인");

		p_container.setPreferredSize(new Dimension(400, 150));

		p_container.add(t_id);
		p_container.add(t_pass);
		p_container.add(bt_regist);
		p_container.add(bt_login);

		add(p_container);
	
		setVisible(true);

	}

}
