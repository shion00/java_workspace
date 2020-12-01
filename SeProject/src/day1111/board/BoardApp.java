package day1111.board;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import common.image.ImageUtil;
import day1111.member.Login;
import day1111.member.RegistForm;

public class BoardApp extends JFrame{
	JPanel p_north, p_center;
	JButton bt_board, bt_regist, bt_login;
	
	private JPanel[] pages=new JPanel[5];
	
	public static final int BOARD_LIST=0;
	public static final int BOARD_WRITE=1;
	public static final int BOARD_DETAIL=2;
	public static final int MEMBER_REGIST=3;
	public static final int MEMBER_LOGIN=4;
	
	public BoardApp() {
		
		p_north=new JPanel();
		p_center=new JPanel();
		bt_board=new JButton(ImageUtil.getIcon(this.getClass(), "res/board.png", 100, 35));
		bt_regist=new JButton(ImageUtil.getIcon(this.getClass(), "res/register.png", 100, 35));
		bt_login=new JButton(ImageUtil.getIcon(this.getClass(), "res/login.png", 100, 35));
		
		pages[0]=new BoardList();
		pages[1]=new BoardDetail();
		pages[2]=new BoardWrite();
		pages[3]=new Login();
		pages[4]=new RegistForm();
		
		
		//스타일
		bt_board.setPreferredSize(new Dimension(100,45));
		bt_regist.setPreferredSize(new Dimension(100,45));
		bt_login.setPreferredSize(new Dimension(100,45));
		
		//조립
		p_north.add(bt_board);
		p_north.add(bt_regist);
		p_north.add(bt_login);
		
		p_center.add(pages[0]);
		p_center.add(pages[1]);
		p_center.add(pages[2]);
		p_center.add(pages[3]);
		p_center.add(pages[4]);
		
		add(p_north,BorderLayout.NORTH);
		add(p_center);
		
		
		setVisible(true);
		setSize(800, 600);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		new BoardApp();
	}
}




























